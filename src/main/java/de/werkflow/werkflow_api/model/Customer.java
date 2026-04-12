package de.werkflow.werkflow_api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long customerID;

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

    @OneToMany(mappedBy = "customer")
    @Setter
    private List<Job> jobs;
}
