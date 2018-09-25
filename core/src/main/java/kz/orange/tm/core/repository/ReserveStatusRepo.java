package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.ReserveStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ReserveStatusRepo extends  JpaRepository<ReserveStatus, Integer> {
}
