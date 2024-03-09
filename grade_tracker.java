import java.util.*;
public class grade_tracker {
    public static void main(String[] args){
        double s=0;
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the total number of students");
            int n=sc.nextInt();
            double[] arr = new double[n];
            System.out.println("enter marks of students");
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextDouble();
            }
            double min=arr[0];
            double max=arr[0];

            for(int i=0;i<n;i++)
            {
                 s=s+arr[i];
                if (arr[i]<min) {
                    min = arr[i];
                }
                if(arr[i]>max)
                {
                     max=arr[i];

                }
        }
            double avg=s/n;
            System.out.println("The average is " + avg);
            System.out.println("The maximum marks obtained is " + max);
            System.out.println("The minimum marks obtained is " +min);

    }
}
