
package com.zensar.exception;

public class ServiceExceptions extends Exception {
 private String errormsg;
 
 public ServiceExceptions()
 {
	 errormsg="error : service exception";
	 
 }

public ServiceExceptions(String errormsg) {
	super();
	this.errormsg = errormsg;
}

@Override
public String toString() {
	return "ServiceExceptions [errormsg=" + errormsg + "]";
}
 
}
