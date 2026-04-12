package de.werkflow.werkflow_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class JobDescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long descriptionID;

    @OneToOne
    @JoinColumn(name = "job")
    @NonNull
    private Job job;

    @Setter
    @NonNull
    private String text;
}
