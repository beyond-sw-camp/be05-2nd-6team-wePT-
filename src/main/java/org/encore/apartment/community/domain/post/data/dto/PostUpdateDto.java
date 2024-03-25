package org.encore.apartment.community.domain.post.data.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.encore.apartment.community.domain.post.data.entity.Post;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostUpdateDto {

    @NotBlank
    private Long postId;
    @NotBlank
    private String postTitle;
    @NotBlank
    private String postContent;
    @NotBlank
    private LocalDateTime updatedAt;

    @Builder
    public PostUpdateDto(Long postId, String postTitle, String postContent,LocalDateTime updatedAt ) {

        this.postId = postId;
        this.postTitle= postTitle;
        this.postContent = postContent;
        this.updatedAt = updatedAt;
    }

    public Post ToEntity(){
        return Post.builder()
                .postTitle(this.postTitle)
                .postId(this.postId)
                .postContent(this.postContent)
                .updatedAt(this.updatedAt)
                .build();
    }
}
