package com.application.contreoller;

import com.application.dto.AppDto;
import com.application.service.AppService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/app")
public class AppController {

  private final AppService service;

  @GetMapping("/id{id}")
  public ResponseEntity<AppDto> getById(@PathVariable Long id) {
    return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
  }

  @GetMapping("/all")
  public ResponseEntity<List<AppDto>> findAll() {
    return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
  }

  @PostMapping
  public ResponseEntity<AppDto> save(@RequestBody AppDto entity) {
    return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
  }

  @PutMapping("/id{id}")
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}
