package org.encore.apartment.community.domain.post.data.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // 객체 매핑
@NoArgsConstructor
@Getter
public class PostCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postCategoryId;

    @Column(name = "post_category_name", nullable = false)
    private String postCategoryName;

    @Builder
    public PostCategory(Long postCategoryId, String postCategoryName){
        this.postCategoryId = postCategoryId;
        this.postCategoryName = postCategoryName;
    }


}
