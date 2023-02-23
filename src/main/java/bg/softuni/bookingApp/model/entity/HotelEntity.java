package bg.softuni.bookingApp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hotels")
public class HotelEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private CountryEntity country;

    @ManyToOne
    private CityEntity city;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "hotel", targetEntity = RoomEntity.class)
    private List<RoomEntity> rooms;

    @OneToMany(mappedBy = "hotel", targetEntity = ReservationEntity.class)
    private List<ReservationEntity> reservations;

}
