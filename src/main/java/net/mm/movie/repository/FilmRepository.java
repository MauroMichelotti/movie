package net.mm.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.mm.movie.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

}
