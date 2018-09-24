package kz.orange.tm.core.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "restaurant_room", schema = "orange_food_core", catalog = "")
public class RestaurantRoom {
    private int id;
    private Integer restaurantId;
    private String name;
    private Integer maxCount;

    @Id
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "max_count")
    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantRoom that = (RestaurantRoom) o;
        return id == that.id &&
                Objects.equals(restaurantId, that.restaurantId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(maxCount, that.maxCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, restaurantId, name, maxCount);
    }
}
