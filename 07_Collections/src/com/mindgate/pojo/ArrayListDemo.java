package com.mindgate.pojo;

import java.util.List;

public class ArrayListDemo {
	private List<String> nameList;
	private int arrayListId;

	public ArrayListDemo() {
		// TODO Auto-generated constructor stub
	}

	public ArrayListDemo(List<String> nameList, int arrayListId) {
		super();
		this.nameList = nameList;
		this.arrayListId = arrayListId;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public int getArrayListId() {
		return arrayListId;
	}

	public void setArrayListId(int arrayListId) {
		this.arrayListId = arrayListId;
	}

	@Override
	public String toString() {
		return "ArrayListDemo [nameList=" + nameList + ", arrayListId=" + arrayListId + "]";
	}

	
}
