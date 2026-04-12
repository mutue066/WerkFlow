package de.werkflow.werkflow_api.repository;

import de.werkflow.werkflow_api.model.JobImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobImageRepository extends JpaRepository<JobImage, Long> {
}
