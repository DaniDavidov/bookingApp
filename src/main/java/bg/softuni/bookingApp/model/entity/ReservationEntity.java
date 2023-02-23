package bg.softuni.bookingApp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "reservations")
public class ReservationEntity extends BaseEntity {

    @OneToOne
    private RoomEntity room;

    @ManyToOne
    private HotelEntity hotel;

    @OneToOne
    private UserEntity guest;

    @Column(nullable = false)
    private BigDecimal balanceAmount;
}
