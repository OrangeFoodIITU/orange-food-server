package kz.orange.tm.core.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "restaurant_cuisine_map", schema = "orange_food_core", catalog = "")

public class RestaurantCuisineMap {

    private int id;
    private Integer restaurantId;
    private Integer cuisineId;

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
    @Column(name = "cuisine_id")
    public Integer getCuisineId() {
        return cuisineId;
    }
    public void setCuisineId(Integer cuisineId) {
        this.cuisineId = cuisineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantCuisineMap that = (RestaurantCuisineMap) o;
        return id == that.id &&
                Objects.equals(restaurantId, that.restaurantId) &&
                Objects.equals(cuisineId, that.cuisineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, restaurantId, cuisineId);
    }

}





