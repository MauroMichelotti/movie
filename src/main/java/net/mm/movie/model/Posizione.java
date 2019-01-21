package net.mm.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "posizione", schema = "public", uniqueConstraints = @UniqueConstraint(name = "posizione_uk", columnNames = {
    "codice" }))
@SequenceGenerator(schema = "public", sequenceName = "posizione_seq", name = "posizione_seq", allocationSize = 1)
public class Posizione {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posizione_seq")
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "codice", nullable = false)
  private String codice;

  @Column(name = "descrizione", nullable = false)
  private String descrizione;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCodice() {
    return codice;
  }

  public void setCodice(String codice) {
    this.codice = codice;
  }

  public String getDescrizione() {
    return descrizione;
  }

  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((codice == null) ? 0 : codice.hashCode());
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
    Posizione other = (Posizione) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (codice == null) {
      if (other.codice != null)
        return false;
    } else if (!codice.equals(other.codice))
      return false;
    return true;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Posizione [id=").append(id);
    builder.append(", codice=").append(codice);
    builder.append(", descrizione=").append(descrizione);
    builder.append("]");
    return builder.toString();
  }
}
