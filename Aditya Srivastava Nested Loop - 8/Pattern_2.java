class Pattern_2
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {   
            for(int y=1;y<=x;y++)
            {
                System.out.print(x%2);
            }
            System.out.println();
        }
    }
}