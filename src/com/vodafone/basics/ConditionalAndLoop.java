package com.vodafone.basics;

public class ConditionalAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b=5;
		/*if(a==1)
		{
			if(b==10)
			{
			System.out.println("one");
			}
			System.out.println("end");
		}
		else if(a==2)
			System.out.println("two");
		else if(a==3)
			System.out.println("three");
		else
			System.out.println("no match");*/
		/*switch(a)
		{
		case 1: case 11:  case 21:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
			default:
				System.out.println("no match");
				break;
		}*/
		/*int c = 0;
		do
		{
			System.out.println(c);
			c=c+2;
		}while(c<10);*/
		String[] q = {"one","two","three","four"};
		/*for(int x=0;x<q.length;x++)
		{
			System.out.println(q[x]);
		}*/
		for(String l:q)
		{
			System.out.println(l);
		}
	}

}
