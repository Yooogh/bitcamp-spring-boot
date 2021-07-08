package shop.growith.api.seat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.growith.api.seat.domain.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
