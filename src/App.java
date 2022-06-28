
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.print("Hello");
        System.out.print(" Ly Hoai Lam \n");// In ra sau đó xuống dòng (sử dụng "\n" để xuống dòng)
        System.out.print("Gia Dinh ");// In ra không xuống dòng
        System.out.println("dao tao");// In ra sau đó xuống dòng
        System.out.printf("%d \n", 64);// In ra theo định kiểu dữ liệu (dùng "\n" để xuống dòng)
        int d = 456;
        System.out.printf("bien d = %d", d);// In ra theo định kiểu dữ liệu (Không xuống dòng)
        //System.out.println("%d", 55);
        //System.out.println("%d", d);// Không được
        //System.out.print("%d", 5);
        //System.out.print("%d", d);

      
        System.out.println();

        int a = 5, b = 6;
        System.out.println("a = " + a + " va" + " b = " + b + " a + b = " +(a + b) );// = 11

        System.out.println("a = " + a + " va" + " b = " + 6 + " a + b = " + a + b );// = 65

        System.out.println();

        System.out.println("a = " + 7 + " va" + " b = " + 13 + " a + b = " +(7 + 13) );// = 20

        System.out.println("a = " + 7 + " va" + " b = " + 13 + " a + b = " + 7 + 13 );// = 713

        System.out.println();

        int c = 11;
        int f;
        f = 56;
        System.out.printf("c = %d va f = %d (Tong c + f) =  %d + %d = %d", c, f, c, f, c + f );// = 67

        System.out.printf("\n c = %d va f = %d (Tong c + f) =  %d + %d = %d", 2, 3, 2, 3, 2 + 3 );// = 5

        System.out.println();

        System.out.print("c = " + c + " f = " + f + " = " + (c + f));// = 67

        System.out.print("\nc = " + c + " f = " + f + " = " + c + f + "\n");// = 1156 

        System.out.print("c = " + 50 + " f = " + 60 + " = " + (50 + 60) +"\n");// = 110

        System.out.print("c = " + 50 + " f = " + 60 + " = " + 50 + 60);// = 5060

        


    }
}
