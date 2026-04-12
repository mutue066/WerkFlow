package de.werkflow.werkflow_api.repository;

import de.werkflow.werkflow_api.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
