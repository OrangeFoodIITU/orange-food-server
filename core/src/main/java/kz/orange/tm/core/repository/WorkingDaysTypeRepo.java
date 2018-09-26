package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.WorkingDaysType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WorkingDaysTypeRepo extends JpaRepository<WorkingDaysType, Integer> {
}
