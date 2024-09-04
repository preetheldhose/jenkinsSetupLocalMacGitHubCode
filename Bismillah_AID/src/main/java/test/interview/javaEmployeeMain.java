package test.interview;

import java.io.FileOutputStream;

import test.interview.Employee;
import test.interview.execution.*;
import java.util.Map;
import java.util.*;
import java.io.*;
import org.asynchttpclient.Response;

import dev.failsafe.internal.util.Assert;

public class javaEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Hello World");
		
		Employee emp = new Employee(1, "wcc");
		System.out.println("EmpID : " + emp.empID);
		System.out.println("EmpName : " + emp.empName);	
		nothing();
	}
	
	public static void nothing() {
		System.out.println("Abstract class");
	}

}
