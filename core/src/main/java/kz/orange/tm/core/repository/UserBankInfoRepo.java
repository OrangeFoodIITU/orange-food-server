package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.UserBankInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserBankInfoRepo extends JpaRepository<UserBankInfo, Integer> {
}
