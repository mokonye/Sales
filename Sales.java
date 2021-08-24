/**
creating a two-dimensional array based on the following table of first quarter sales data from Mom's Friendly Robot Factory. 
Store the data in the table.
*/

public class Sales
{
	public static void man(String[] args)
	{
		//Declares a 2D array with 4 rows
		//and 4 column.
		
		int[][] number = {{January	February	March
                           Trenton	2420.89	3299.99	4277.88,
                           Marley	7355.07	4470.89	9236.13,
                           Ronin	6856.72	6038.08	3518.80,
		                   Ivy	    8531.36	3037.39	9146.95}};
						   
		// Display the number of rows.
        System.out.println("The	number of " + "rows is " + numbers.length);

	    // Display the number of colume in rach row.
		for (int index = 0; index < numbers.length; index++)
		{
			System.out.println("The number of " + "column in row " + index + " is " + numbers[index].length);
		}
	}
}