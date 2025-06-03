package com.demo.thread;

import com.demo.beans.MyFileSerach;

public class SearchThread implements Runnable{
	private MyFileSerach fs;
	private String str;
	
	public SearchThread(MyFileSerach fs2, String str) {
		super();
		this.fs = fs2;
		this.str = str;
	}

	public void run() {
		fs.search(str);
	}

}
