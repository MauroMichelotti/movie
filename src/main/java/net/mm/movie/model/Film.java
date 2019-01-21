package net.mm.movie.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "film", schema = "public")
@SequenceGenerator(schema = "public", sequenceName = "film_seq", name = "film_seq", allocationSize = 1)
public class Film {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "film_seq")
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "titolo", nullable = false)
  private String titolo;

  @Column(name = "trama", nullable = false)
  private String trama;

  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "genere_id", nullable = true, foreignKey = @ForeignKey(name = "fk_genere"))
  private Genere genere;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitolo() {
    return titolo;
  }

  public void setTitolo(String titolo) {
    this.titolo = titolo;
  }

  public String getTrama() {
    return trama;
  }

  public void setTrama(String trama) {
    this.trama = trama;
  }

  public Genere getGenere() {
    return genere;
  }

  public void setGenere(Genere genere) {
    this.genere = genere;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
    result = prime * result + ((trama == null) ? 0 : trama.hashCode());
    result = prime * result + ((genere == null) ? 0 : genere.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Film other = (Film) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (titolo == null) {
      if (other.titolo != null)
        return false;
    } else if (!titolo.equals(other.titolo))
      return false;
    if (trama == null) {
      if (other.trama != null)
        return false;
    } else if (!trama.equals(other.trama))
      return false;
    if (genere == null) {
      if (other.genere != null)
        return false;
    } else if (!genere.equals(other.genere))
      return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Film [id=").append(id);
    builder.append(", titolo=").append(titolo);
    builder.append(", trama=").append(trama);
    builder.append(", genere=").append(Objects.isNull(genere) ? "NULL" : genere.getId());
    builder.append("]");
    return builder.toString();
  }

}
