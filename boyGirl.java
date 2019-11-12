public class Chapter_6_Exercises
{
    public static void main(String[] agrs)
                        throws FileNotFoundException {
        Scanner a = new Scanner(new File("c6e1.txt"));
        boyGirl(a);
    }

    public static void boyGirl(Scanner input)
                       throws FileNotFoundException {
        int boySum = 0;
        int girlSum = 0;
        int count = 0;
        int sumDifference = 0;
        while(input.hasNextInt()) {
           count++;
           if(count%2 == 0) {
              girlSum += input.nextInt();     
           } else {
              boySum += input.nextInt();    
           }
        }
        sumDifference = Math.abs(boySum-girlSum);
        System.out.println("boySum = " + boySum);
        System.out.println("girlSum = " + girlSum);
        System.out.println("Difference between boys' and girls' ");
        System.out.println("sums is " + sumDifference);
    }
}
