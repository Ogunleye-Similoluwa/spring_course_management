package com.simex.springbootcoursemanagementapp.data.model.model;


import jakarta.persistence.*;
import lombok.*;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Topic {
    @Id
    private String   id;
    private String name;
    private String description;


}
