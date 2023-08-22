package com.green.smartgradever2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Table (name = "board")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardEntity extends BaseEntity{

    /** PK **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, columnDefinition = "BIGINT UNSIGNED")
    private Long iboard;

    @ManyToOne
    @JoinColumn(name = "iadmin")
    @ToString.Exclude
    private AdminEntity iadmin;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 1000)
    private String ctnt;

    @Column(length = 2)
    @Size(min = 0, max = 1)
    private int importance;

    @Column(columnDefinition = "BIGINT UNSIGNED")
    private Long boardView;
}
