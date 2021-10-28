package it.unical.demacs.ProvaIngSw_213560;

import java.util.List;

public class MyListUtil {
	
	int cur=0;

	 public List<Integer> sort(List<Integer> list, int order){  
		 if(list.size()<=1)
			 return list;
		 List<Integer> myList=list;
		 if(cur==myList.size())
			 return myList;
		 if(order==0) {
			 for(int i=0;i<myList.size()-1;i++) {
				 if(myList.get(i)>myList.get(i+1))
				 {
					 Integer a=myList.get(i);
					 myList.remove(i);
					 myList.add(i, myList.get(i));
					 myList.remove(i+1);
					 myList.add(i+1,a);
				 }
			 }
			 cur++;
			 sort(myList,order);
		 }
		 else {
			 for(int i=0;i<myList.size()-1;i++) {
				 if(myList.get(i)<myList.get(i+1))
				 {
					 Integer a=myList.get(i);
					 myList.remove(i);
					 myList.add(i, myList.get(i));
					 myList.remove(i+1);
					 myList.add(i+1,a);
				 }
			 }
			 cur++;
			 sort(myList,order);
		 }
		 return myList;
     }
}
