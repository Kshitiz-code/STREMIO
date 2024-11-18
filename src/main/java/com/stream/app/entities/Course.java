package com.stream.app.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "yt_courses")
public class Course {
    @Id
    private  String id;

    private  String title;
}
