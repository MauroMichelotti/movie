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
import net.mm.movie.model.Genere;
import net.mm.movie.repository.GenereRepository;
import net.mm.movie.response.ListObjectResponse;

@RestController
@RequestMapping(path = "/genere")
public class GenereController {

  @Autowired
  private GenereRepository genereRepo;

  @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<Response> read() {
    List<Genere> lst = genereRepo.findAll();
    ListObjectResponse<Genere> response = new ListObjectResponse<>();
    response.setObjects(lst);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

}
