class pattern_1
{
    public static void main()
    {
        for(int x=1;x<=5;x++)
        {   
            for(int y=1;y<=x;y++)
            {
                System.out.print((char)(y+64));
            }
            System.out.println();
        }
    }
}