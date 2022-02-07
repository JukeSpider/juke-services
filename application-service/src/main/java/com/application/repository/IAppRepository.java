package com.application.repository;

import com.application.entity.AppEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRepository extends JpaRepository<AppEntity, Long> {

}
