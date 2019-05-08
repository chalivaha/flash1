package innerclass;



public class MemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		 A.B  b= a.new B();
         b.show();
	}

}
class A{
	int age;
	String name;
	class B{
		public void show(){
			System.out.println("show in b of a");
		}
		
	}
	
}
