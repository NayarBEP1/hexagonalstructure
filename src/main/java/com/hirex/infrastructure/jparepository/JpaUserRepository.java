package com.hirex.infrastructure.jparepository;

import com.hirex.infrastructure.entity.EntityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<EntityUser, Long> {
}
