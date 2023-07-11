package com.radev.basecode.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "CreatedDate", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "CreatedBy", length = 50)
    private String createdBy;

    @Column(name = "UpdatedDate")
    private LocalDateTime updatedDate;

    @Column(name = "UpdatedBy", length = 50)
    private String updatedBy;
}
