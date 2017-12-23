import java.util.Scanner;
public class DataAnaylze {

	public static void main(String[] args) 

	{Scanner input = new Scanner(System.in);

	int i = 0; int j = 0; int z = 0;
	int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
	int max = 0; 
	int min = 0;
	min = Integer.MAX_VALUE; 
	max = Integer.MIN_VALUE;

	System.out.print("Please Enter The Sample Size: ");
	int size = input.nextInt();

	int trial = 4;
	int arr0[] = new int[size + 1];
	int arr1[] = new int[size + 1];
	int arr2[] = new int[size + 1];
	int arr3[] = new int[size + 1];

	do{
		System.out.println("Enter Numbers for Trial " + i);
		i++;
		for (j = 0; j < size; ++j){

			if (i == 4)
			{System.out.print("Enter Sample Size #" + j + ": ");
			arr0[j] = input.nextInt();
			sum4 += arr0[j];
			}
			else if (i == 3){
				System.out.print("Enter Sample Size #" + j + ": ");
				arr1[j] = input.nextInt();
				sum3 += arr1[j];
			}
			else if (i == 2){
				System.out.print("Enter Sample Size #" + j + ": ");
				arr2[j] = input.nextInt();
				sum2 += arr2[j];
			}
			else if (i ==1){
				System.out.print("Enter Sample Size #" + j + ": ");
				arr3[j] = input.nextInt();
				sum1 += arr3[j];
			}
		}
		System.out.println(" ");}
	while (i < trial);
	System.out.println("\tSample # \tTrial 1 \tTrial 2 \tTrial 3 \tTrial 4");

	for (j = 0; j < size; ++j)
	{System.out.print("\t" + j);
	System.out.print("\t\t" + arr3[j]);
	System.out.print("\t\t" + arr2[j]);
	System.out.print("\t\t" + arr1[j]);
	System.out.println("\t\t" + arr0[j]);}

	System.out.println("\t:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

	System.out.print("Average: ");
	System.out.print("\t\t" + ((sum1) / (size)));
	System.out.print("\t\t" + ((sum2) / (size)));
	System.out.print("\t\t" + ((sum3) / (size)));
	System.out.println("\t\t" + ((sum4) / (size)));
	System.out.println(" ");

	int avg1 = ((sum1) / (size)); 
	int avg2 = ((sum2) / (size)); 
	int avg3 = ((sum3) / (size));
	int avg4 = ((sum4) / (size));

	int[]avg_arr = {avg1, avg2, avg3, avg4};

	for (z = 0; z < avg_arr.length; z++){
		if (min > avg_arr[z]){
			min = avg_arr[z];
		}
		if (max < avg_arr[z]){
			max = avg_arr[z];
		}
	}
	System.out.println("Minimum Average: " + min);
	System.out.println("Maximum Average: " + max);
	System.out.println(" ");

	if (max == min){
		System.out.println("The trials match EXACTLY.");
	}
	else if (max < (min + min)){
		System.out.println("The trials concur with each other.");
	}
	else {
		System.out.println("The trials do not concur with each other.");
	}

	}

}
