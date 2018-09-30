package pkg2324.pruebas;

import java.lang.reflect.Array;

public class Pruebas {
public static void main(String[] args) {

int[] x=new int[10];
int d[] = new int[1];

if(x.getClass().equals(d.getClass()));
    System.out.print("si");
	
if(x.getClass()== d.getClass());
   System.out.print("si");


System.out.print(x.getClass()+"\n");

    }
    
}
