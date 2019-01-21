package net.mm.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.mm.movie.controller.beans.Response;
import net.mm.movie.model.Formato;
import net.mm.movie.repository.FormatoRepository;
import net.mm.movie.response.ListObjectResponse;

@RestController
@RequestMapping(path = "/formato")
public class FormatoController {

  @Autowired
  private FormatoRepository formatoRepo;

  @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<Response> read() {
    List<Formato> lst = formatoRepo.findAll();
    ListObjectResponse<Formato> response = new ListObjectResponse<>();
    response.setObjects(lst);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

}
