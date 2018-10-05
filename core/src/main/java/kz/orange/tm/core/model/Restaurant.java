package kz.orange.tm.core.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "restaurant", schema = "orange_food_core", catalog = "")
public class Restaurant {
    private int id;
    private String name;
    private String address;
//    private Integer cuisineId;
//    private Integer contactId;
//    private Integer workingTimeId;
//    private Integer avgPriceId;
//    private Integer roomTypeId;
//    private Integer reservationId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "`name`")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    @Basic
//    @Column(name = "cuisine_id")
//    public Integer getCuisineId() {
//        return cuisineId;
//    }
//
//    public void setCuisineId(Integer cuisineId) {
//        this.cuisineId = cuisineId;
//    }
//
//    @Basic
//    @Column(name = "contact_id")
//    public Integer getContactId() {
//        return contactId;
//    }
//
//    public void setContactId(Integer contactId) {
//        this.contactId = contactId;
//    }
//
//    @Basic
//    @Column(name = "working_time_id")
//    public Integer getWorkingTimeId() {
//        return workingTimeId;
//    }
//
//    public void setWorkingTimeId(Integer workingTimeId) {
//        this.workingTimeId = workingTimeId;
//    }
//
//    @Basic
//    @Column(name = "avg_price_id")
//    public Integer getAvgPriceId() {
//        return avgPriceId;
//    }
//
//    public void setAvgPriceId(Integer avgPriceId) {
//        this.avgPriceId = avgPriceId;
//    }
//
//    @Basic
//    @Column(name = "room _type_id")
//    public Integer getRoomTypeId() {
//        return roomTypeId;
//    }
//
//    public void setRoomTypeId(Integer roomTypeId) {
//        this.roomTypeId = roomTypeId;
//    }
//
//    @Basic
//    @Column(name = "reservation_id")
//    public Integer getReservationId() {
//        return reservationId;
//    }
//
//    public void setReservationId(Integer reservationId) {
//        this.reservationId = reservationId;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) //&&
//                Objects.equals(cuisineId, that.cuisineId) &&
//                Objects.equals(contactId, that.contactId) &&
//                Objects.equals(workingTimeId, that.workingTimeId) &&
//                Objects.equals(avgPriceId, that.avgPriceId) &&
//                Objects.equals(roomTypeId, that.roomTypeId) &&
//                Objects.equals(reservationId, that.reservationId)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address /*, cuisineId, contactId, workingTimeId, avgPriceId, roomTypeId, reservationId*/);
    }
}
