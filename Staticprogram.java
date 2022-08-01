package com.company;
import java.util.Scanner;
class Classroom
{
     static int  Student(){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        return n;
    }
    public void Name()
    {
        Classroom m =new Classroom();
        int n =Student();
        int i;
        Scanner in =new Scanner(System.in);
        String []a=new String[100];
        for(i=0;i<n;i++)
        {
            a[i]=in.next();
        }
        for(i=0;i<n;i++)
        System.out.println(i+1+ " "+a[i]+" ");
    }
}
public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.Name();
    }
}
