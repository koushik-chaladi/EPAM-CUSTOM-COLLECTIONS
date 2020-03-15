package epam.task.customcollections;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class collectionMain {
public static Logger LOGGER = LogManager.getLogger(collectionMain.class);	
public static void main(String[] args) {
	CustomCollection<String> l=new CustomCollection<String>();
	try (Scanner s = new Scanner(System.in)) {
		boolean flag=true;
		while(flag)
		{
		LOGGER.info("Enter your choice:\n1-add\n2-print\n3-remove\n4-fetch\n5-replace\n6-getsize\n7-exit");
		int i=s.nextInt();
		switch(i) 
		{
		case 1: LOGGER.info("Enter element to add");
				String ele=s.next();
				l.add(ele);
				break;
		case 2: LOGGER.info("Displaying the elements:");
				l.print();
				break;
		case 3: LOGGER.info("Enter element index to remove");
				int index=s.nextInt();
				String ele1=l.remove(index);
				LOGGER.info("Element removed = "+ele1);
				break;
		case 4: LOGGER.info("Enter element index to fetch");
				int index1=s.nextInt();
				String element=l.get(index1);
				LOGGER.info("Element fetched:"+element);
				break;
		case 5: LOGGER.info("Enter element and index to be replaced");
				String ele2=s.next();
				int ind2=s.nextInt();
				String elem=l.set(ind2,ele2);
				LOGGER.info("Element replaced:"+elem);
				break;
		case 6: LOGGER.info("The size of custom list ="+l.size());
		        break;		
		case 7: flag=false;
		        break;
		default: LOGGER.info("Please enter valid input");
			
	   }	
	 }
	}
  }
}
