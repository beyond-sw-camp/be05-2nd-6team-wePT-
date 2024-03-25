package org.encore.apartment.community.domain.post.data.repository;

import org.encore.apartment.community.domain.post.data.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
