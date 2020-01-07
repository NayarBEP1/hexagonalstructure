package com.hirex.infrastructure.adapter.repository;

import com.hirex.domain.model.entity.User;
import com.hirex.domain.port.repository.RepositoryUser;
import com.hirex.infrastructure.adapter.repository.mapper.MapperUser;
import com.hirex.infrastructure.entity.EntityUser;
import com.hirex.infrastructure.jparepository.JpaUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryCreateUserImpl implements RepositoryUser {

    private JpaUserRepository jpaUserRepository;
    private MapperUser mapperUser = new MapperUser();

    public RepositoryCreateUserImpl(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public User createUser(User user) {
        EntityUser entityUser = this.mapperUser.modelToEntity(user);
        EntityUser entityUserSaved = this.jpaUserRepository.save(entityUser);
        return this.mapperUser.entityToModel(entityUserSaved);
    }
}
