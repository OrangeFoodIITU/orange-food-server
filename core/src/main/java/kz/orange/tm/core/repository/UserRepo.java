package kz.orange.tm.core.repository;

import kz.orange.tm.core.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends  JpaRepository<User, Integer>{
}

