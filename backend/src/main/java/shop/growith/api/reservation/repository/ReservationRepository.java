package shop.growith.api.reservation.repository;

import shop.growith.api.reservation.domain.Reservation;
import shop.growith.api.reservation.domain.ReservationDto;
import shop.growith.api.seat.domain.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
