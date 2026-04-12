package de.werkflow.werkflow_api.repository;

import de.werkflow.werkflow_api.model.JobDescription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDescriptionRepository extends JpaRepository<JobDescription, Long> {
}
