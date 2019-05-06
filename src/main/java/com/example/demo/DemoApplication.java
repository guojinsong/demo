package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  public static void main(String[] args) throws InterruptedException {
    /*SpringApplication.run(DemoApplication.class, args);*/

    String[] words = new String[]{"hello", "word"};
    List<String[]> list= Arrays.stream(words)
                              .map(word->word.split(""))
                              .distinct()
                              .collect(Collectors.toList());
    System.out.println(list.size());
    for (String[] strArr : list) {
      System.out.println(strArr.length);
    }
  }

}
