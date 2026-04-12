package de.werkflow.werkflow_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
@Getter
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentID;

    @OneToOne
    @Setter
    @NonNull
    private Job job;

    @Setter
    @NonNull
    private Instant date;

    @Setter
    private boolean confirmed;
}
