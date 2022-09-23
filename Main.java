//@mihirx17
public class Main {
    public static void pairs_of_Array(int a[])
    {
        int current;
        for (int i=0;i<a.length;i++)
        {
            current=a[i];
            for (int j=i+1;j<a.length;j++)
            {
                System.out.print("("+current + a[j]+")" );
            }
            System.out.println("");
        }
    }
    public static void main(String[] args)

    {

        int a[]={1,2,4,5};
        pairs_of_Array(a);
    }
}
///NOTHING IS GOOD LIKE YOU
