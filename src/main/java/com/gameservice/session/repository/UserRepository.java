package com.gameservice.session.repository;

import com.gameservice.session.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long>
{
    Users findByUsername(String username);
}
