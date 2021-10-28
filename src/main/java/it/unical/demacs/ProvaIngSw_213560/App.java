package it.unical.demacs.ProvaIngSw_213560;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> m=new ArrayList<Integer>();
        m.add(2);
        MyListUtil mLU=new MyListUtil();
        mLU.sort(m, 1);
        System.out.println(m);
    }
}
