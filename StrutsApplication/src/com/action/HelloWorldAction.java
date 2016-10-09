package com.action;

public class HelloWorldAction {
	 private String name;

	   public String execute() throws Exception {
		   name="Shubham Singh Kushwah";
	      return "success";
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}
