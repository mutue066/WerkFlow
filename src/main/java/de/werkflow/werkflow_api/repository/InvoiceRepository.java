package de.werkflow.werkflow_api.repository;

import de.werkflow.werkflow_api.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
