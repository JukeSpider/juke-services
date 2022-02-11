package com.validator.repository;

import com.validator.entity.ValidatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IValidatorRepository extends JpaRepository<ValidatorEntity, Long> {

}
