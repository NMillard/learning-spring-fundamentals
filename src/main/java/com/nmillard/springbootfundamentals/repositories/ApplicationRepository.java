package com.nmillard.springbootfundamentals.repositories;

import com.nmillard.springbootfundamentals.models.Application;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ApplicationRepository extends CrudRepository<Application, UUID> {
}
