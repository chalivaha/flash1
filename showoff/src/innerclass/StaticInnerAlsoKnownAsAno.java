package innerclass;



public class StaticInnerAlsoKnownAsAno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab a = new Ab();
		 Ab.B  b= new Ab.B();
         b.show();
	}

}
class Ab{
	int age;
	String name;
	 static class B{
		public void show(){
			System.out.println("show in b of a");
		}
		
	}
	public static B B() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
