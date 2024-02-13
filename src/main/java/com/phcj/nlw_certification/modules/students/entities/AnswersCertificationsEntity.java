package com.phcj.nlw_certification.modules.students.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "answers_certifications_students")
public class AnswersCertificationsEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @Column(name = "certification_id")
    private UUID certificationID;

    @Column(name = "student_id")
    private UUID studentID;

    @Column(name = "question_id")
    private UUID questionsID;

    @Column(name = "answer_id")
    private UUID answerID;

    @Column(name = "is_correct")
    private boolean isCorrect;

    @ManyToOne
    @JoinColumn(name = "certification_id", insertable = false, updatable = false)
    private CertificationsStudentEntity certificationsStudentEntity;

    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private StudentEntity studentEntity;

    @CreationTimestamp
    private LocalDateTime createdAt;

}
