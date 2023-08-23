package com.green.smartgradever2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import jakarta.validation.groups.Default;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.ColumnDefault;

@Data
@Table (name = "board")
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
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
    @ColumnDefault("0")
    private int importance;

    @Column(columnDefinition = "BIGINT UNSIGNED", name = "board_view")
    private Long boardView;
}
