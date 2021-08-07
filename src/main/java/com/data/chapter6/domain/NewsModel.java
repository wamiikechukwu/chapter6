package com.data.chapter6.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
//Instructs Lombok to create getter, setter, equals(), hashCode(), and toString() methods, creating a so-called data class
@NoArgsConstructor
//Instructs Lombok to create a zero-parameter constructor, thus requiring no arguments
@AllArgsConstructor
//Instructs Lombok to create a constructor with a parameter for each member variable, requiring an argument be provided for all

public class NewsModel {
    @Id
    public Long Id;

    public String sourceName, author, title;

    @JsonProperty("description")
    public String newsShortDescription;

    @JsonProperty("url")
    public String newsUrl;

    public String urlToImage, content;

    @JsonProperty("publishedAt")
    public String newsPublishedAt;
}
