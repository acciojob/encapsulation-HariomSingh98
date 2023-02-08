package com.driver;

public class Main {
    Scanner sc = new Scanner(System.in);
      RWOnly rw = new RWOnly();
      // name has private access in com.driver.RWOnly
      rw.setName(sc.nextLine());
      rw.getName();
  
}
