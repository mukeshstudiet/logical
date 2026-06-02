import java.util.*;

class Check {
public static final int ii=12101;

int a;

Check(int ab)
{
this.a=ab;
}

public boolean equals (Object ab1){
Check ob1= (Check)ab1;

if (ob1.a==this.a)
return true;
else 
return false;
}
public int hashCode(){
return 4;
}

public static void main (String args [])

{
Check ch1 =new Check(10);
Check ch2 =new Check(20);	
Check ch3 =new Check(30);

System.out.println("@@@@@@MUKI hashCode1 " + ch1.hashCode());
System.out.println("@@@@@@MUKI hashCode2 " + ch2.hashCode());
System.out.println("@@@@@@MUKI hashCode3 " + ch3.hashCode());
if (ch1.equals(ch2))
System.out.println("@@@@@@MUKI ch1 equals ch2");
if (ch2.equals(ch3))
System.out.println("@@@@@@MUKI ch2 equals ch3");





Hashtable<Check, String> ma = new Hashtable<Check, String>();
//	HashMap ma = new HashMap();
ma.put(ch1,"Mukesh");
ma.put(ch1,"MukeshCH");

ma.put(ch2,"Amit");
//ma.put(null,"Mali");
ma.put(ch3,"Mali");
String str =ma.get(ch1);
String str2 =ma.get(ch2);
String str3 =ma.get(ch3);
//String str3 =ma.get(null);

System.out.println("@@@@@@MUKI HashMap ma " + ma);

System.out.println("@@@@@@MUKI " + str);
System.out.println("@@@@@@MUKI " + str2);
System.out.println("@@@@@@MUKI " + str3);

}
}
