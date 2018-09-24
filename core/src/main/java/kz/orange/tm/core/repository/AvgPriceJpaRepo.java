package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.AvgPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvgPriceJpaRepo extends JpaRepository<AvgPrice, Integer> {
}
