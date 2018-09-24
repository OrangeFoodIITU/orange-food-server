package kz.orange.tm.core.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "restaurant_contact", schema = "orange_food_core", catalog = "")
public class RestaurantContact {
    private int id;
    private Integer restaurantId;
    private Integer phoneNumber;
    private String description;
    private String isDisable;

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
    @Column(name = "phone_number")
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "is_disable")
    public String getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(String isDisable) {
        this.isDisable = isDisable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantContact that = (RestaurantContact) o;
        return id == that.id &&
                Objects.equals(restaurantId, that.restaurantId) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(description, that.description) &&
                Objects.equals(isDisable, that.isDisable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, restaurantId, phoneNumber, description, isDisable);
    }
}
