package pr7;
import java.io.IOException;
import java.util.Scanner;

abstract  class furniture{
    protected String quality;
    protected int longg;
    protected String color;
    furniture(){}
    furniture(String quality,int longg,String color)
    {
        this.quality=quality;
        this.longg=longg;
        this.color=color;
    }

    abstract String getQuality();

    abstract int getLongg() ;

    abstract String getColor();
}
class  Sofa extends furniture
{
    Sofa(String quality, int longg,String color)
    {
        super(quality,longg,color);
    }
    public String getQuality() {
        return super.quality;
    }
    public int getLongg() {
        return super.longg;
    }
    public String getColor() {
        return super.color;
    }
}
class Table extends furniture
{
    Table(String quality, int longg,String color)
    {
        super(quality,longg,color);
    }
    public String getQuality() {
        return super.quality;
    }
    public int getLongg() {
        return super.longg;
    }
    public String getColor() {
        return super.color;
    }
}
class FurnitureShop
{
    public void funshion()
    {
        Sofa sofa = new Sofa("Велюр", 250, "Красный");
        Table table = new Table("Дерево", 100, "Коричневый");
        Person person=new Person();
        System.out.println("Приветствую в магазине мебели");
        Scanner scanner=new Scanner(System.in);
        int a;
        do
        {
            System.out.println("Магазин обладает следующим функционалом:");
            System.out.println("1 - посмотреть диван");
            System.out.println("2 - посмотреть стол");
            System.out.println("3 - посмотреть корзину");
            System.out.println("0 - выйти с магазина");
            System.out.println("Введите число: ");
            a=scanner.nextInt();
            switch (a)
            {
                case 1:
                    System.out.println("Характеристики дивана: ");
                    System.out.println("Качество: " + sofa.getQuality() + "  Длина: " + sofa.getLongg() + "  Цвет: " + sofa.getColor());
                    System.out.println("Добавить в корзину, введите 1, иначе 0 :");
                    int w = scanner.nextInt();
                    if (w == 1) {
                        person.basket(w);
                    }
                    else  {break;}
                    break;
                case 2:
                    System.out.println("Характеристики стола: ");
                    System.out.println("Качество: " + table.getQuality() + "  Длина: " + table.getLongg() + "  Цвет: " + table.getColor());
                    System.out.println("Добавить в корзину, введите 2, иначе 0 :");
                    int o = scanner.nextInt();
                    if (o == 2) {
                        person.basket(o);
                    }
                    else {
                        break;
                    }
                    break;
                case 3:
                    person.output();
                case 0: break;
                default:
                    System.out.println("Вы ошиблись, повторите попытку");
                    break;
            }

        }while(a!=0);
    }
}
class Person extends FurnitureShop
{
    protected int s1=0,s2=0;
    public void basket(int a)
    {
        if(a==1)
        {
            System.out.println("Добавлен диван в корзину");
            s1++;
        }
        else
        {
            System.out.println("Добавлен стол в корзину");
            s2++;
        }
    }
    public  void output()
    {
        System.out.println("В Корзине: Диванов - "+s1+"  Столов - "+s2);
    }


}
public class prseven {


    public static void main(String[] args) throws IOException {
        FurnitureShop furnitureShop=new FurnitureShop();
        furnitureShop.funshion();

    }
}
