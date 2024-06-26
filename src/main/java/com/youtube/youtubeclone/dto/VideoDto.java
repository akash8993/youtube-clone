package com.youtube.youtubeclone.dto;

import com.youtube.youtubeclone.entity.VideoStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoDto {
    public String id;
    private String title;
    private String description;
    private List<String> tags;
    private String videoUrl;
    private VideoStatus videoStatus;
    private String thumbnailUrl;
}
