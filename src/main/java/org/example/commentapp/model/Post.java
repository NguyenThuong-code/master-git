package org.example.commentapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 5000)
    private  String content;
    private String postedBy;
    private String img;
    private Date date;
    private int likeCount;
    private int viewCount;
    private String tag;
}
