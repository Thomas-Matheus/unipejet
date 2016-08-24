package br.com.unipejet.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "travel")
public class Travel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "leaving", nullable = false)
    private String leaving;

    @NotEmpty
    @Column(name = "destiny", nullable = false)
    private String destiny;

    @NotEmpty
    @Column(name = "value", nullable = false)
    private Float value;

    @Column(name = "exit_time", nullable = false)
    @Temporal(TemporalType.DATE.TIMESTAMP)
    private Date exitTime;

    @Column(name = "date_register", nullable = false)
    @Temporal(TemporalType.DATE.TIMESTAMP)
    private Date dateRegister;

    @OneToOne(mappedBy = "travel_id", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Passenger passenger;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeaving() {
        return leaving;
    }

    public void setLeaving(String leaving) {
        this.leaving = leaving;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Travel travel = (Travel) o;

        if (id != null ? !id.equals(travel.id) : travel.id != null) return false;
        if (leaving != null ? !leaving.equals(travel.leaving) : travel.leaving != null) return false;
        if (destiny != null ? !destiny.equals(travel.destiny) : travel.destiny != null) return false;
        if (value != null ? !value.equals(travel.value) : travel.value != null) return false;
        if (exitTime != null ? !exitTime.equals(travel.exitTime) : travel.exitTime != null) return false;
        if (dateRegister != null ? !dateRegister.equals(travel.dateRegister) : travel.dateRegister != null)
            return false;
        return passenger != null ? passenger.equals(travel.passenger) : travel.passenger == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (leaving != null ? leaving.hashCode() : 0);
        result = 31 * result + (destiny != null ? destiny.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (exitTime != null ? exitTime.hashCode() : 0);
        result = 31 * result + (dateRegister != null ? dateRegister.hashCode() : 0);
        result = 31 * result + (passenger != null ? passenger.hashCode() : 0);
        return result;
    }
}
