package kz.orange.tm.core.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "working_time", schema = "orange_food_core", catalog = "")
public class WorkingTime {
    private int id;
    private Integer restaurantId;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer workingDaysId;

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
    @Column(name = "restaurant_id")
    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Basic
    @Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "working_days_id")
    public Integer getWorkingDaysId() {
        return workingDaysId;
    }

    public void setWorkingDaysId(Integer workingDaysId) {
        this.workingDaysId = workingDaysId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkingTime that = (WorkingTime) o;
        return id == that.id &&
                Objects.equals(restaurantId, that.restaurantId) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(workingDaysId, that.workingDaysId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, restaurantId, startTime, endTime, workingDaysId);
    }
}
