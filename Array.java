public class Array{
	int size = 8;
	int Array[];
	int top = 0;
	double length;
	int remove;
	int a;
	double size_1by4 = 0.25;
	double size_3by4 = 0.75;
	public Array(){
		Array = new int[size];
	}

    public int size()
	{
		return size;
	}

	public void add(int b)
	{
		if(size==0){
			Array[0]=b;
			top=0;
		}
		else{
			Array[top+1]=b;
			top++;

		}
	}
	public void pop()
	{
		top--;
		remove = Array[top];
		Array[top] = 0;
		int count = 0;
		int i = 0;
		while(i < Array[i]) { 
			i++;
			count++;
		}
		a = count;
		length = (double)a/size;
		System.out.println("POPED Out Elements: " +remove);
	}
	public void resize()
	{
		if(length == size_1by4 ) {
			int newArray[] = new int[(size/2)*2];
			int i = 0;
			while( i < Array.length ) {
				i++;
				newArray[i] = Array[i];
			}
			Array = newArray;
			size = size/2;	
		}
		else if(length == size_3by4) {
			int newArray[] = new int[size*2];
			int i = 0;
			while( i < Array.length) {
				i++;
				newArray[i] = Array[i];
			}
			size = size * 2;
			Array = newArray;
		}
		else {
			System.out.println("INDEX OUT OF BOUND!!!!");
		}
	}
	public String toString()
	{
		String s = Integer.toString(size);
		return s;
	}
	
}