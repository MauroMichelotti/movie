package net.mm.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.mm.movie.model.Formato;

@Repository
public interface FormatoRepository extends JpaRepository<Formato, Long> {

  public List<Formato> findByCodice(String codice);

}
