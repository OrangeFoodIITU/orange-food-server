package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.CardType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardTypeRepo extends JpaRepository<CardType, Integer> {
}
