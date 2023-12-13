package edu.ics4u.alex;

public class patron {

    public static void main(String[] args){
        int b = 10;
        int[] a = new int[b];
        for (int i =0 ; i==b-1; i++){
a[i]=i;
        }
        seqence c = new normal();
         seqence d = new adapter();
       System.out.println(c.Seqence(a)); 
       System.out.println(d.Seqence(a));

}}