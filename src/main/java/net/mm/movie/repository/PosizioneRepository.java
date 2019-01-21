package net.mm.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.mm.movie.model.Posizione;

@Repository
public interface PosizioneRepository extends JpaRepository<Posizione, Long> {

  public List<Posizione> findByCodice(String codice);

}
