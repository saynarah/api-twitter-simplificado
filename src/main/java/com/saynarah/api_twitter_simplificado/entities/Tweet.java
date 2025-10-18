package com.saynarah.api_twitter_simplificado.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private Long tweetId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String content;

    private Instant creationTimestamp;
}
