package epam.task.customcollections;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CustomCollection<T> extends AbstractList<T>
{
	public static Logger LOGGER = LogManager.getLogger(CustomCollection.class);	
	int size=0;
	Object elements[];
	public CustomCollection()
	{
		elements=new Object[10];
	}
	public boolean add(T element) 
	{
		if(size==elements.length)
		{
			maintainCapacity();
		}
		elements[size++]=element;
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public T remove(int i) 
	{
		Object p=elements[i];
		size--;
		System.arraycopy(elements, i+1,elements,i,elements.length-i-1);
		return (T) p;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int i)
	{
		return (T) elements[i];
	}
	
	@SuppressWarnings("unchecked")
	public T set(int index, T element) 
	{
		T oldvalue=(T) elements[index];
        elements[index] = element;
        return oldvalue;
    }
	
	public  int size()
	{
		return elements.length;
	}
	
	public void maintainCapacity()
	{
		elements=Arrays.copyOf(elements,elements.length*2);	
	}
	
	public void print() {
		for(int i=0;i<size;i++) {
			LOGGER.info(elements[i]);
		}
	}
}
