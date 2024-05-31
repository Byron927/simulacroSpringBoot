package riwi.simulacroSpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String assignment_title;

    @Column(nullable = false)
    @Lob
    private String description;

    @Column(nullable = false)
    private LocalDateTime due_date;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "assignment",
    orphanRemoval = false, cascade = CascadeType.ALL)
    private List<Submission> submission;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lesson_id", referencedColumnName = "id")
    private Lesson lesson;
}
