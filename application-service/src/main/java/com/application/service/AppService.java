package com.application.service;

import com.application.dto.AppDto;
import com.application.entity.AppEntity;
import com.application.mapper.IAppMapper;
import com.application.repository.IAppRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AppService implements IAppService {

  private final IAppRepository repository;
  private final IAppMapper mapper;

  @Override
  public AppDto getById(Long id) {
    AppEntity entity = repository.findById(id).orElseThrow(IllegalArgumentException::new);
    return mapper.mapToDto(entity);
  }

  @Override
  public List<AppDto> findAll() {
    List<AppEntity> entityList = repository.findAll();
    return mapper.mapToDtoList(entityList);
  }

  @Override
  public AppDto save(AppDto app) {
    AppEntity entity = mapper.mapToEntity(app);
    repository.save(entity);
    return app;
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }
}
