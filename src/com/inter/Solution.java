package com.inter;
import java.lang.reflect.*;
import java.util.*;

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
   
     public void anothermethod(){  }
  
public void ahqym() {}
public void amftc() {}
public void atcks() {}
public void bwkbd() {}
public void cfwyc() {}
public void cmkxa() {}
public void dnpym() {}
public void dnqvo() {}
public void dvvwq() {}
public void ehjdm() {}
public void elyed() {}
public void fmyce() {}
public void ghtlj() {}
public void hluvb() {}
public void isqdf() {}
public void iwhtf() {}
        
}


class Solution {

    public static void main(String[] args){
        
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

         String[] methodNames = new String[methods.length];
for (int i = 0; i < methods.length; i++) {
    methodNames[i] = methods[i].getName();
}

Arrays.sort(methodNames);
for (String name : methodNames) {
    System.out.println(name);
}System.out.println("\r\n" + 
		"{-truncated-}");
}

}