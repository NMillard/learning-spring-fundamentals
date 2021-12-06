package com.nmillard.springbootfundamentals.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.nmillard.springbootfundamentals.models.Application;
import com.nmillard.springbootfundamentals.repositories.ApplicationRepository;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private ApplicationRepository repository;

    public Query(ApplicationRepository repository) {
        this.repository = repository;
    }

    public Iterable<Application> findAllApplications() {
        return repository.findAll();
    }
}
