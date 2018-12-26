package net.mm.movie.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.mm.movie.common.Costanti;
import net.mm.movie.controller.beans.Response;
import net.mm.movie.response.SingleObjectResponse;

@RestController
@RequestMapping(path = "/alive")
public class AliveController {

  @RequestMapping(path = "/hello")
  @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
  public ResponseEntity<String> hello() {
    System.out.println("GET::read");
    return new ResponseEntity<String>("Hello Movie", HttpStatus.OK);
  }

  @RequestMapping(path = "/dateTime")
  @PostMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public ResponseEntity<Response> getDateTime() {
    SingleObjectResponse<String> resp = new SingleObjectResponse<>();
    resp.setObject(Costanti.SDF_FULL.format(new Date()));
    return new ResponseEntity<Response>(resp, HttpStatus.OK);
  }
}
