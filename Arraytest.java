public class Arraytest{
	public static void main(String[] args) {
			Array obj1 = new Array();
			obj1.add(5);
			obj1.add(8);
			// obj1.add(4);
			// obj1.add(3);
			// obj1.add(3);
			// obj1.add(7);
			// obj1.add(9);
			// obj1.add(10);
			obj1.pop();
			obj1.pop();
			obj1.resize();
			System.out.println("ToString: " +obj1.toString());
			//System.out.println("The number of elements in the new Array is " +a);
			System.out.println("Size of new Array:" +obj1.size());
		}
	}
