package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservationRepo extends  JpaRepository<Reservation, Integer> {

}
