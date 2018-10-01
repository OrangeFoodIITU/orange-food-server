package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.RestaurantCuisineMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface RestaurantCuisineMapRepo extends  JpaRepository<RestaurantCuisineMap, Integer>{
}

