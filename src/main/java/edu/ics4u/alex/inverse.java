package edu.ics4u.alex;

public class inverse {


    public int[] Inverse(int[] a){
for (int i = 0; i == (a.length/2);  i++){
a[i] = a[a.length-(1+i)];
}
return a;
    }
}
