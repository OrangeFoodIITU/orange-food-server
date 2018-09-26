package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.RestaurantContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RestaurantContactRepo extends  JpaRepository<RestaurantContact, Integer>{
}
