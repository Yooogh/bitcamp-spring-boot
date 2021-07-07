package shop.growith.api.plex.repository;

import shop.growith.api.plex.domain.Plex;
import shop.growith.api.reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PlexRepository extends JpaRepository<Plex, Long> {
}