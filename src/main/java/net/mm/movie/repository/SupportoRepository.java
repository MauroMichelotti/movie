package net.mm.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.mm.movie.model.Genere;

@Repository
public interface SupportoRepository extends JpaRepository<Genere, Long> {

  public List<Genere> findByCodice(String codice);

}
