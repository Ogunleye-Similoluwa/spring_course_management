package com.simex.springbootcoursemanagementapp.data.model.repositories;

import com.simex.springbootcoursemanagementapp.data.model.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic,String> {
}
