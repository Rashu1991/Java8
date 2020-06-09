package LamdaConcept;

public class LamdaDeclaration {
	
	public static void main(String []args) {
		
		WebPage w = (value,age) -> {
				// TODO Auto-generated method stub
				System.out.println("hii "+value+" age is "+age);
				
		}; 
		
//		WebPage w1 = (value) -> System.out.println(value.toUpperCase());
//		WebPage w3 = (n) -> System.out.println(n.length());
		
//		WebPage w2 = new WebPage() {
//			
//			public void header(String value) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
//		
		w.header("google",8);
		//w1.header("facebook");
		//w2.header("andn");
		//w2.header("facebook");
	}

}
