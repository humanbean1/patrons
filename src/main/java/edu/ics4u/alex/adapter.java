package edu.ics4u.alex;

public class adapter implements seqence {
    inverse ab = new inverse();
    @Override
    public int[] Seqence(int[] a) {
       
        return ab.Inverse(a);
    }
}
