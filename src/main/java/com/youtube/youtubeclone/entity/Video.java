package com.youtube.youtubeclone.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Video")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Video {

    @Id
    private String id;
    private String description;
    private String title;
    private String userId;
    private Long likes;
    private Long dislikes;
    private List<String> tags;
    private String url;
    private VideoStatus videoStatus;
    private Long viewCount;
    private String thumbnailUrl;
    private List<Comment> comments;

}


