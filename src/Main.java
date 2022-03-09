public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        int[] array = { 1, 4, 5, 6,8 };
        for(int i =0 ; i < 5 ; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        swap(array, 3, 1);
        for(int i =0 ; i < 5 ; i++)
        {
        System.out.print(array[i]+" ");
        }


    }
    public static void swap(int [] array, int pos1, int pos2)
    {
        int temp;
        temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
