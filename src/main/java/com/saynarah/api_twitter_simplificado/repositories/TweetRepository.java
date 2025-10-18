package com.saynarah.api_twitter_simplificado.repositories;

import com.saynarah.api_twitter_simplificado.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
