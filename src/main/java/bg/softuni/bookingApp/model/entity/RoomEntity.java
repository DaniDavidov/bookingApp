package bg.softuni.bookingApp.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rooms")
public class RoomEntity extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    private HotelEntity hotel;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private boolean hasWifi;

    @Column(nullable = false)
    private boolean hasFitnessAccess;

    @Column(nullable = false)
    private boolean hasBalcony;

    @Column(nullable = false)
    private boolean hasAirConditioning;


}
