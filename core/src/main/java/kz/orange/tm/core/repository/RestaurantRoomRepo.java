package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.RestaurantRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RestaurantRoomRepo extends  JpaRepository<RestaurantRoom, Integer>{
}
