package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.CuisineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuisineTypeRepo extends JpaRepository<CuisineType, Integer> {

}
