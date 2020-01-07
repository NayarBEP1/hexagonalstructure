package com.hirex.infrastructure.configuration;

import com.hirex.domain.port.repository.RepositoryUser;
import com.hirex.domain.service.user.ServiceCreateUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanServiceUser {

    @Bean
    public ServiceCreateUser serviceCreateUser(RepositoryUser repositoryUser) {
        return new ServiceCreateUser(repositoryUser);
    }
}
