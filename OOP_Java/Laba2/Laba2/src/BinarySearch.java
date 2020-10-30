
public class BinarySearch {
	public static void main(String[] args) {

		  int data[] = { 3, 6, 7, 10, 34, 56, 60 };
		  int numberToFind = 10;
		  int averageIndex = 0;
		  int firstIndex = 0;
		  int lastIndex = data.length-1;
		  while(firstIndex < lastIndex)
		  {
		   averageIndex = firstIndex + (lastIndex - firstIndex) / 2;
		   if(numberToFind <= data[averageIndex])
		   {
		    lastIndex = averageIndex;
		   }
		   else 
		   {
		    firstIndex = averageIndex + 1;
		   }
		  }
		   if(data[lastIndex] == numberToFind)
		   {
		    System.out.println(lastIndex);
		   }
		   else
		   {
		    System.out.println(-1);
		   }}

}
