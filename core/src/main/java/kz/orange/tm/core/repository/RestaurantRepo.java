package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RestaurantRepo extends  JpaRepository<Restaurant, Integer> {
}
