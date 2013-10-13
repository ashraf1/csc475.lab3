package lab3project;


/**
 *
 * @authors: Mike Chambers and Mohamed Fadili
 * 
 */
public class Lab3Project
{
    /**
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {
	    //matrix 1 with 8 rows and 9 columns
		int array[][] = {{2, 92, 31, 98, 3, 5, 57, 41, 29},{54, 57, 68, 92, 11, 20, 14, 58, 84},
            {48, 14, 9, 33, 9, 27, 74, 34, 85},{51, 87, 2, 96, 52, 81, 91, 95, 19},
            {15, 90, 9, 85, 51, 23, 35, 21, 78},{23, 20, 57, 94, 69, 99, 90, 78, 61},
            {35, 61, 81, 72, 3, 93, 20, 96, 9},{90, 100, 98, 14, 95, 75, 96, 8, 87}};

		//matrix 2 with 8 rows and 10 columns
		int array1[][] = {{3, 27, 37, 31, 52, 19, 63, 81, 88, 12},{80, 27, 7, 55, 21, 100, 73, 62, 9, 91},
			{85, 50, 66, 27, 63, 44, 0, 37, 93, 82},{73, 57, 4, 80, 5, 51, 63, 13, 97, 11},
			{87, 62, 20, 14, 44, 77, 71, 42, 27, 82},{37, 32, 96, 95, 45, 8, 11, 38, 61, 6},
			{34, 67, 84, 50, 38, 64, 50, 51, 50, 47},{79, 31, 54, 37, 27, 54, 57, 30, 77, 36},
			{74, 20, 98, 37, 8, 17, 18, 1, 29, 56}};

		//incompatible matrices are rejected
		int array2[][] = new int[10][10];
		int x= array.length;

		System.out.println("Matrix 1 : ");

		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j <= x; j++)
			{
				System.out.print(" "+ array[i][j]);
			}

		System.out.println();
		}

		int y= array1.length;
		System.out.println("Matrix 2 : ");

		for(int i = 0; i < y; i++)
		{
			for(int j = 0; j < y-1; j++)
			{
				System.out.print(" "+array1[i][j]);
			}

		System.out.println();
		}

		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y-1; j++)
			{
				for(int k = 0; k < y; k++)
				{
					array2[i][j] += array[i][k]*array1[k][j];
				}
			}
		}

        //performs the multiplication of the two matrices
		System.out.println("Multiplication of both matrix : ");

		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < y-1; j++)
			{
				System.out.print(" "+array2[i][j]);
			}

		System.out.println();
		}
    }
}
