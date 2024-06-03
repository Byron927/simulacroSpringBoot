package riwi.simulacroSpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import riwi.simulacroSpringBoot.util.enums.Role;

import java.util.List;
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100,nullable = false)
    private String username;
    @Column(length = 20, nullable = false)
    private String password;
    @Column(length = 100)
    private String email;
    @Column(length = 100)
    private String full_name;
    private Role role;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Enrollment> enrollments;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Course> courses;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sender_id",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Message> senderMessages;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "receiver_id",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Message> receiverMessages;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Submission> submissions;
}
