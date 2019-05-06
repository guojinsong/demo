package com.example.demo;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class Driver {

  @NotNull
  private String name;

  @Min(value = 18, groups = DriverChecker.class)
  private int age;

  @AssertTrue(groups = DriverChecker.class)
  private boolean hasDrivingLicense;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isHasDrivingLicense() {
    return hasDrivingLicense;
  }

  public void setHasDrivingLicense(boolean hasDrivingLicense) {
    this.hasDrivingLicense = hasDrivingLicense;
  }

  interface DriverChecker {

  }
}
