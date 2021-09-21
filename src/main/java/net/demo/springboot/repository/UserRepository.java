package net.demo.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.demo.springboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
