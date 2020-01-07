package com.hirex.domain.service.user;

import com.hirex.domain.model.entity.User;
import com.hirex.domain.port.repository.RepositoryUser;

public class ServiceCreateUser {

    private RepositoryUser repositoryUser;

    public ServiceCreateUser(RepositoryUser repositoryUser) {
        this.repositoryUser = repositoryUser;
    }

    public User run(User user) {
        return this.repositoryUser.createUser(user);
    }

}
