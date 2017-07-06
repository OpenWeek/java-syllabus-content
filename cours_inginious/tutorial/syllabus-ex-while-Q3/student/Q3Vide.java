package student;
import java.util.*;
import java.io.*;
import java.math.*;


public class Q3Stu {
	
	int turn = 0;
	int door;
	public Q3Stu(int a)
	{
		door = a;
	}

	// Code a verifier
	public int jeux(int n){
		@@q1@@
	}

	public char isDoor(int n)
	{
		turn ++;
		if(n == door)
		{
			return '!';
		}
		else if(n>door)
		{
			return 'l';
		}
		return 'r';
	}
}
