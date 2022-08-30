import java.util.*;
class Product 
{
    int ProdId;
    int Qty;
    int Price;
    int FinalPrice;
    String ProdName;
    Product(int ProdId,int Qty,int Price,String ProdName)
    {
        this.ProdId=ProdId;
        this.Qty=Qty;
        this.Price=Price;
        this.ProdName=ProdName;
        FinalPrice=Price*Qty;
    }
    public int getProdId()
    {
        return ProdId;
    }
    public  int getQty()
    {
        return Qty;
    }
    public int getFinalPrice()
    {
        return FinalPrice;
    }
    public String getProdName()
    {
        return ProdName;
    }
}
class ProductInfo 
{
    int n;
    Scanner sc=new Scanner(System.in);
    public Product[] create()
    {
        System.out.println("Enter the number of products you want to buy: ");
        n=sc.nextInt();
        int a,b,c;
        String d;
        Product product[]=new Product[n];
        for (int i=0;i<product.length;i++)
        {
            System.out.println("Product "+(i+1));
            System.out.println("Enter the ID of the product: ");
            a=sc.nextInt();
            System.out.println("ENter the QUantity bought: ");
            b=sc.nextInt();
            System.out.println("Enter the price of the product: ");
            c=sc.nextInt();
            System.out.println("Enter the name of the product: ");
            d=sc.next();
            sc.nextLine();
            product[i]=new Product(a,b,c,d);
        }
        return product;
    }
    public int getn()
    {
        return n;
    }
    public void display(Product prod[])
    {
        System.out.println("-----------------------------BILL-----------------------------");
        System.out.println("Product ID\tProduct Name\tQuantity\tPrice");
        int GrandTotal=0;
        for (int i=0;i<prod.length;i++)
        {
            System.out.println(prod[i].getProdId()+"\t\t"+prod[i].getProdName()+"\t\t   "+prod[i].getQty()+"\t\t"+prod[i].getFinalPrice());
            GrandTotal=GrandTotal+prod[i].getFinalPrice();
        }
        System.out.println("CGST: "+0.04*GrandTotal+"\nSGST: "+0.06*GrandTotal+"\nGrand Total: "+((0.1*GrandTotal)+GrandTotal));
        System.out.println("-----------------------------THANK YOU!-----------------------------");
    }
}
public class Main 
{
    public static void main(String args[])
    {
        ProductInfo p1=new ProductInfo();
        Product p2[]=p1.create();
        p1.display(p2);
    }
}