package riwi.simulacroSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.enums.Role;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Enrollment> enrollments;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Course> courses;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sender_id",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Message> senderMessages;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "receiver_id",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Message> receiverMessages;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user",
            cascade = CascadeType.ALL,orphanRemoval = false)
    private List<Submission> submissions;

}
