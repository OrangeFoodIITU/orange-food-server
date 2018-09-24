package kz.orange.tm.core.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "avg_price", schema = "orange_food_core", catalog = "")
public class AvgPrice {
    private int id;
    private Integer restaurantId;
    private Integer avgPriceMin;
    private Integer avgPriceMax;

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
    @Column(name = "avg_price_min")
    public Integer getAvgPriceMin() {
        return avgPriceMin;
    }

    public void setAvgPriceMin(Integer avgPriceMin) {
        this.avgPriceMin = avgPriceMin;
    }

    @Basic
    @Column(name = "avg_price_max")
    public Integer getAvgPriceMax() {
        return avgPriceMax;
    }

    public void setAvgPriceMax(Integer avgPriceMax) {
        this.avgPriceMax = avgPriceMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvgPrice avgPrice = (AvgPrice) o;
        return id == avgPrice.id &&
                Objects.equals(restaurantId, avgPrice.restaurantId) &&
                Objects.equals(avgPriceMin, avgPrice.avgPriceMin) &&
                Objects.equals(avgPriceMax, avgPrice.avgPriceMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, restaurantId, avgPriceMin, avgPriceMax);
    }
}
