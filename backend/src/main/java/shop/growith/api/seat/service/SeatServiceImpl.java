package shop.growith.api.seat.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.growith.api.seat.domain.Seat;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class SeatServiceImpl implements SeatService{
    @Override
    public ArrayList<Seat> getReservedSeat(String plexName, LocalDate ReserveDay) {
        return null;
    }

    @Override
    public ArrayList<Seat> getReservedSeat(String plexName, LocalDate ReserveDay, String reserveTime) {
        return null;
    }
}
