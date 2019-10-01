package com.developia.application.pharmacy.repository;

import com.developia.application.pharmacy.object.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shnovruzov on 10/02/2019.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
