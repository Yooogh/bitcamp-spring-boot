package shop.growith.api.reservation.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservationDto {
    private Long reserveId;
    private String theaterName;
    private String movieName;
    private String seat;
    private LocalDate reserveDay;
    private String reserveTime;
    private int people;
    private int totalPrice;
    private String memberID;
}
