package br.com.unipejet.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "passenger")
public class Passenger  implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "amount_paid", nullable = true)
    private Float amountPaid;

    @Column(name = "date_register", nullable = false)
    @Temporal(TemporalType.DATE.TIMESTAMP)
    private Date dateRegister;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Seats seatsId;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Travel travelId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public Seats getSeatsId() {
        return seatsId;
    }

    public void setSeatsId(Seats seatsId) {
        this.seatsId = seatsId;
    }

    public Travel getTravelId() {
        return travelId;
    }

    public void setTravelId(Travel travelId) {
        this.travelId = travelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        if (id != null ? !id.equals(passenger.id) : passenger.id != null) return false;
        if (name != null ? !name.equals(passenger.name) : passenger.name != null) return false;
        if (amountPaid != null ? !amountPaid.equals(passenger.amountPaid) : passenger.amountPaid != null) return false;
        if (dateRegister != null ? !dateRegister.equals(passenger.dateRegister) : passenger.dateRegister != null)
            return false;
        if (seatsId != null ? !seatsId.equals(passenger.seatsId) : passenger.seatsId != null) return false;
        return travelId != null ? travelId.equals(passenger.travelId) : passenger.travelId == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (amountPaid != null ? amountPaid.hashCode() : 0);
        result = 31 * result + (dateRegister != null ? dateRegister.hashCode() : 0);
        result = 31 * result + (seatsId != null ? seatsId.hashCode() : 0);
        result = 31 * result + (travelId != null ? travelId.hashCode() : 0);
        return result;
    }
}
