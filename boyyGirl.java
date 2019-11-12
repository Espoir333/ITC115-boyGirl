public class Chap6Ex01{
    public static void main (String[] args) throws FileNotFoundException{
        File f = new File("boysgirls.txt");
        Scanner input = new Scanner(f);
        boyGirl(input);
    }
    
    public static void boyGirl(Scanner inp){
        int boysTotal = 0;
        int boysNumbTotal = 0;
        int girlsTotal = 0;
        int girlsNumbTotal = 0;
        int count = 0;
        while (inp.hasNext()){
            if (count % 2 == 0){
                boysTotal++;
                boysNumbTotal += readNameNumber(inp);
            } else {
                girlsTotal++;
                girlsNumbTotal += readNameNumber(inp);
            }
            count += 1;
        }
        System.out.println(boysTotal + " boys, " + girlsTotal + "girls");
        System.out.println("Difference between boys' and girls' sums: " + Math.abs(boysNumbTotal - girlsNumbTotal));
    }
    
    public static int readNameNumber(Scanner inp){
        String name = inp.next();
        int    numb = inp.nextInt();
        //System.out.println(name + ": " + numb);
        return numb;
    }
}
