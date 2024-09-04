package test.interview;

import java.io.*;

interface callBack {
	void finalCallBack();
}

public class implementInterface implements callBack {

	public void finalCallBack() {
		// TODO Auto-generated method stub
		System.out.println("Interface");

	}
	
	public static void main(String args[]) {
		callBack obj = new implementInterface();
		obj.finalCallBack();
	}

}