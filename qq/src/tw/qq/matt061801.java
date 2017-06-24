package tw.qq;

public class matt061801 {

	public static void main(String[] args) {
//		p1 obj=new matt011(); //obj�w�g�O��@�����F
//		matt011 obj2=(matt011)obj;  //�j���૬obj2�~��o��m2��k
		p1 obj=new matt011();
		p1 obj2=new matt012();
		//System.out.println();
		
		main2(obj2);
	}
	
	static void main2(p1 anyobj){
		anyobj.m1();
		 if(anyobj instanceof matt011){
			 ((matt011)anyobj).m3();
		 }else if (anyobj instanceof matt012){
			 ((matt012)anyobj).m4();
		 }
		
	}

}
interface p1{
	void m1();
	
}

class matt011 implements p1{
	public void m1(){System.out.println("A");}
	void m3(){System.out.println("A1");}
}

class matt012 implements p1{
	public void m1(){System.out.println("B");}
	void m4(){System.out.println("B1");}
}