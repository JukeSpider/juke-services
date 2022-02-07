package com.application.service;

import com.application.dto.AppDto;
import java.util.List;

public interface IAppService {

  AppDto getById(Long id);

  List<AppDto> findAll();

  AppDto save(AppDto app);

  void delete(Long id);
}
