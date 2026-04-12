package de.werkflow.werkflow_api.model;

import de.werkflow.werkflow_api.enums.Expertise;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class Craftsmen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long craftsmenID;

    @OneToOne
    @Setter
    @NonNull
    private User user;

    @Setter
    @NonNull
    private String firstName;

    @Setter
    @NonNull
    private String lastName;

    @Setter
    @NonNull
    @Enumerated(EnumType.STRING)
    private Expertise expertise;

    @OneToMany(mappedBy = "craftsmen")
    @Setter
    private List<Job> jobs;
}
