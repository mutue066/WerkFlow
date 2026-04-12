package de.werkflow.werkflow_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class JobImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobImageID;

    @ManyToOne
    @JoinColumn(name = "job")
    @NonNull
    @Setter
    private Job job;

    @Setter
    private String imagePath;
}
