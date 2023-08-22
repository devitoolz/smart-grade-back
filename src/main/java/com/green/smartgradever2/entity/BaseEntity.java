package com.green.smartgradever2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    /** 작성 날짜 **/
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    /** 업데이트 날짜 **/
    @UpdateTimestamp
    @JsonIgnore
    private LocalDateTime updatedAt;
    /** 삭제 여부 **/
    @Column(name = "del_yn",columnDefinition = "0 DEFAULT")
    private int delYn;
}