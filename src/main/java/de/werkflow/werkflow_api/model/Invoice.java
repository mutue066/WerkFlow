package de.werkflow.werkflow_api.model;

import de.werkflow.werkflow_api.enums.InvoiceStatus;
import de.werkflow.werkflow_api.enums.JobStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
@Getter
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invoiceID;

    @OneToOne
    private Job job;

    @Setter
    private float amount;

    @Setter
    @NonNull
    @Enumerated(EnumType.STRING)
    private InvoiceStatus invoiceStatus;
}
