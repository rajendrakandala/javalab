import java.io.*;
import java.util.*;
class StringBufferDemo{
    public static void main(String args[]){
        StringBuilder sb1 = new StringBuilder("Hello ");
        System.out.println("the resultant string is : "+sb1);
        sb1.append("java");
        System.out.println("the resultant string is : "+sb1);
        StringBuilder sb2 = new StringBuilder("hello");
        sb2.insert(2,"java");
        System.out.println("the resultant string is : "+sb2);
        StringBuilder sb3 = new StringBuilder("HELLO");
        sb3.replace(1,3,"java");
        System.out.println("the resultant value is :"+sb3);
        StringBuilder sb4 =  new StringBuilder("hello");
        sb4.delete(1,3);
        System.out.println("the resultant string is : "+sb4);
         StringBuilder sb5 = new  StringBuilder("Hello ");
        sb5.reverse();
        System.out.println("the resultant value is :"+sb5);
        
    }
}
