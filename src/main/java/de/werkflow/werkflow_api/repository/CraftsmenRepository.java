package de.werkflow.werkflow_api.repository;

import de.werkflow.werkflow_api.model.Craftsmen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CraftsmenRepository extends JpaRepository<Craftsmen, Long> {
}
