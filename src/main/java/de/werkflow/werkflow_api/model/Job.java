package de.werkflow.werkflow_api.model;

import de.werkflow.werkflow_api.enums.JobStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobID;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @Setter
    @NonNull
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "craftsmen_id")
    @Setter
    @NonNull
    private Craftsmen craftsmen;

    @Setter
    @NonNull
    @Enumerated(EnumType.STRING)
    private JobStatus jobStatus;

    @Setter
    @NonNull
    @CreationTimestamp
    private Instant createAt;

    @OneToMany(mappedBy = "job")
    @Setter
    @NonNull
    private List<JobImage> jobImage;

    @OneToOne(mappedBy = "job")
    @Setter
    @NonNull
    private JobDescription jobDescriptions;
}
