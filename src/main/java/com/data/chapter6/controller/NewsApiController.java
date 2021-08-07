package com.data.chapter6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class NewsApiController {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("news")
    public List<Object> getNews(){
        Object[] news = restTemplate.getForObject("https://newsapi.org/v2/everything?q=tesla&from=2021-07-07&sortBy=publishedAt&apiKey=+apikey",Object[].class);
        return Arrays.asList(news);
    }
}
