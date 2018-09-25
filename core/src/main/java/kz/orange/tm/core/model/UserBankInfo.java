package kz.orange.tm.core.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_bank_info", schema = "orange_food_core", catalog = "")
public class UserBankInfo {
    private int id;
    private Integer userId;
    private Integer cardTypeId;

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
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "card_type_id")
    public Integer getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(Integer cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBankInfo that = (UserBankInfo) o;
        return id == that.id &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(cardTypeId, that.cardTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, cardTypeId);
    }
}
