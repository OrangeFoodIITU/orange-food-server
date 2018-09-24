package kz.orange.tm.core.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "card_type", schema = "orange_food_core", catalog = "")
public class CardType {
    private int id;
    private String name;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardType cardType = (CardType) o;
        return id == cardType.id &&
                Objects.equals(name, cardType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
