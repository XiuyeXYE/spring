package com.xy.test.bean;

public class A {

	private String tagName;
	private int nodeType;
	
	
	
	public String getTagName() {
		return tagName;
	}



	public void setTagName(String tagName) {
		this.tagName = tagName;
	}



	public int getNodeType() {
		return nodeType;
	}



	public void setNodeType(int nodeType) {
		this.nodeType = nodeType;
	}



	@Override
	public String toString() {
		return "A [tagName=" + tagName + ", nodeType=" + nodeType + "]";
	}
	
	
}
