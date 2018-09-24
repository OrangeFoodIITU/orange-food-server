package kz.orange.tm.core.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Reservation {
    private int id;
    private Integer userId;
    private Integer restaurantId;
    private Integer roomTypeId;
    private Date reserveDate;
    private Integer reserveTime;
    private Integer reserveStatusId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "restaurant_id")
    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Basic
    @Column(name = "room_type_id")
    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Basic
    @Column(name = "reserve_date")
    public Date getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }

    @Basic
    @Column(name = "reserve_time")
    public Integer getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(Integer reserveTime) {
        this.reserveTime = reserveTime;
    }

    @Basic
    @Column(name = "reserve_status_id")
    public Integer getReserveStatusId() {
        return reserveStatusId;
    }

    public void setReserveStatusId(Integer reserveStatusId) {
        this.reserveStatusId = reserveStatusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return id == that.id &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(restaurantId, that.restaurantId) &&
                Objects.equals(roomTypeId, that.roomTypeId) &&
                Objects.equals(reserveDate, that.reserveDate) &&
                Objects.equals(reserveTime, that.reserveTime) &&
                Objects.equals(reserveStatusId, that.reserveStatusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, restaurantId, roomTypeId, reserveDate, reserveTime, reserveStatusId);
    }
}
