package br.com.unipejet.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "seats")
public class Seats implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "seat_number", unique = true, nullable = false)
    private String seatNumber;

    @NotEmpty
    @Column(name = "is_busy", nullable = false)
    private Boolean isBusy;

    @Column(name = "price", nullable = false)
    private Float price;

    @OneToOne(mappedBy = "seats_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Passenger passenger;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Boolean getBusy() {
        return isBusy;
    }

    public void setBusy(Boolean busy) {
        isBusy = busy;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seats seats = (Seats) o;

        if (id != null ? !id.equals(seats.id) : seats.id != null) return false;
        if (seatNumber != null ? !seatNumber.equals(seats.seatNumber) : seats.seatNumber != null) return false;
        if (isBusy != null ? !isBusy.equals(seats.isBusy) : seats.isBusy != null) return false;
        if (price != null ? !price.equals(seats.price) : seats.price != null) return false;
        return passenger != null ? passenger.equals(seats.passenger) : seats.passenger == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (seatNumber != null ? seatNumber.hashCode() : 0);
        result = 31 * result + (isBusy != null ? isBusy.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (passenger != null ? passenger.hashCode() : 0);
        return result;
    }
}
