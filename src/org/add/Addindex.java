package org.add;

import java.util.ArrayList;
import java.util.List;

public class Addindex {
public static void main(String[] args) {
	List i = new ArrayList();
	
	i.add(10);
	i.add(20);
	i.add(30);
	i.add(90);
	i.add(10);
	i.add(10);
	i.add(40);
	i.add(50);
	
	i.add(8, 80);
	System.out.println(i);
}
private void work() {

    System.out.println("Changes in Collection Methods");
    System.out.println("Work done");
}
private void sub() {
	System.out.println("Adding new Data");
	System.out.println("Work Done");

}
	

}

	





