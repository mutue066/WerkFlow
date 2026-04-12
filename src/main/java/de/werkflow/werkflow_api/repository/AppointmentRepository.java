package de.werkflow.werkflow_api.repository;

import de.werkflow.werkflow_api.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
