package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.WorkingTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WorkingTimeRepo extends JpaRepository<WorkingTime, Integer> {
}
