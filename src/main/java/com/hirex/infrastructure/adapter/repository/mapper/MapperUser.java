package com.hirex.infrastructure.adapter.repository.mapper;

import com.hirex.domain.model.entity.User;
import com.hirex.infrastructure.entity.EntityUser;

public class MapperUser {

    public MapperUser(){}

    public EntityUser modelToEntity(User user) {
        return new EntityUser(user.getId(),user.getName(), user.getLastName(), user.getEmail(), user.getPass());
    }

    public User entityToModel(EntityUser entityUser) {
        return new User(entityUser.getId(), entityUser.getName(), entityUser.getLastName(), entityUser.getEmail(), entityUser.getPass());
    }
}
