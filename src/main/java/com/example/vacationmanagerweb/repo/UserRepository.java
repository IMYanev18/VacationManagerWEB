package com.example.vacationmanagerweb.repo;

import com.example.vacationmanagerweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByNicknameAndPasswd(String username, String password);

}
