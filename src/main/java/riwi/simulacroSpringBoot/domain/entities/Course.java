package riwi.simulacroSpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Lob
    @Column(nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instructor_id", referencedColumnName = "id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course",
            orphanRemoval = false, cascade = CascadeType.ALL)
    private List<Lesson> lessons;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course",
            orphanRemoval = false, cascade = CascadeType.ALL)
    private List<Message> messages;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course",
            orphanRemoval = false, cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;
}
