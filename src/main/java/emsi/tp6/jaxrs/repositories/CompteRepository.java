package emsi.tp6.jaxrs.repositories;

import emsi.tp6.jaxrs.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}