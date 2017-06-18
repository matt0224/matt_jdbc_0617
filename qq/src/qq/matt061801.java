package qq;

public class matt061801 {

	public static void main(String[] args) {
//		p1 obj=new matt011(); //obj已經是實作物見了
//		matt011 obj2=(matt011)obj;  //強制轉型obj2才能得到m2方法
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