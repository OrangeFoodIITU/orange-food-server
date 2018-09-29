package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.Cuisine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuisineRepo extends JpaRepository<Cuisine, Integer> {

}
