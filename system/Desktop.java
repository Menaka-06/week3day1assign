package org.system;

public class Desktop implements Computer  
{
	public static void main(String[] args) 
	{
		Desktop objdsktop = new Desktop();
		objdsktop.computerModel();
		objdsktop.desktopSize();
		}
	public void computerModel() {
		System.out.println("my computer model is hp");
	}
	public void desktopSize() {
		System.out.println("my desktop size is 13inch");
	}
	}
