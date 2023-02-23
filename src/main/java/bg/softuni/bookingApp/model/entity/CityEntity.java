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
@Table(name = "cities")
public class CityEntity extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToOne
    private CountryEntity country;

    @OneToMany(mappedBy = "city", targetEntity = HotelEntity.class)
    private List<HotelEntity> hotels;
}
