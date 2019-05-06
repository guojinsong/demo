package com.example.demo;

import static org.junit.Assert.*;

import com.example.demo.Driver.DriverChecker;
import java.time.LocalDateTime;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.junit.Test;

public class DriverTest {

  @Test
  public void test() {
    System.out.println(LocalDateTime.now());
    System.out.println(LocalDateTime.now().minusSeconds(1));
  }
}