package no.flexivakt.core;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * Session Bean implementation class TestBean
 */
@Named
@SessionScoped
public class TestBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer count = null;
	private String name =  null;

    /**
     * Default constructor. 
     */
    public TestBean() {
    	System.out.println("Creating Bean...");
    	name="Eirik";
    	count=0;
    }
    
    public String getName() {
    	System.out.println("In getName()");
    	count = count + 1;
    	name = name + " "+ Integer.toString(count);
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public Integer getCount() {
    	return count;
    }
    
    public void setCount(Integer count) {
    	this.count = count;
    }

}
