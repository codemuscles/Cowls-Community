import java.util.*;
import java.text.*;
import java.io.*;
public class electronic_shop
{
    //master file
    int m_id[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    String m_cat[]={"Smartphone","Smartphone","Smartphone","Tablet    ","Tablet    ",
            "Tablet    ","Laptop    ","Laptop    ","Laptop    ","Laptop    ","","","","",""};
    String m_name[]={"Iphone 7             ","Samsung Note 7       ","One Plus 3           ",
            "Lenovo Yoga Tablet   ","Apple Ipad Air 2     ","Samsung J7 Prime     ","Asus ZenBook         ",
            "Microsoft SurfaceBook","Apple Macbook Air    ","HP Spectre           ","","","","",""};
    int m_qty[]={50,50,50,30,30,30,20,20,20,20,0,0,0,0,0};
    int m_cost[]={75000,65000,28000,45000,60000,18790,80000,120000,95000,150000,0,0,0,0,0};
    char m_rmv[]={'n','n','n','n','n','n','n','n','n','n','y','y','y','y','y'};
    int out=0,conti=0;
    static int ch;
    int i,j;

    // transaction file

    String c_name[] = {"","","","","","","","","","","","","","",""};
    String c_email[]= {"","","","","","","","","","","","","","",""};
    long c_no[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    int cid = 0;

    String cust_name=" ";
    String cust_email=" ";
    long cust_contact=0;

    int c_m_id[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    String c_m_cat[] = {"","","","","","","","","","","","","","",""};
    String c_m_name[] = {"","","","","","","","","","","","","","",""};
    int c_m_qty[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int c_m_cost[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    int id;

    int m_conti = 0;

    String dustbin;

    Scanner sc = new Scanner (System.in);
    int added=10;
    int added1=10;
    int tot=0;
    double total_cost=0;
    int a=0;
    DateFormat dft=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    Date now=new Date();
    public static void main(String[] args) throws Exception
    {
        electronic_shop obj = new electronic_shop();

        do{
            System.out.println("\f");  
            System.out.println(obj.dft.format(obj.now));
            System.out.println("\t\t\t\t\t\t\t\t      ^ ");
            System.out.println("\t\t\t\t\t\t\t\t     ^^^ ");
            System.out.println("\t\t\t\t\t\t\t\t   ^^^^^^^ ");
            System.out.println("\t\t\t\t\t\t\t\t ------------ ");
            System.out.println("\t\t\t\t\t\t\t\t $umeet sales ");
            System.out.println("\t\t\t\t\t\t\t\t ------------ ");
            System.out.println("\t\t\t\t\t\t\t\t   vvvvvvv ");
            System.out.println("\t\t\t\t\t\t\t\t     vvv ");
            System.out.println("\t\t\t\t\t\t\t\t      v  ");
            System.out.println("**************************************************************************************************************");
            System.out.println("\t\t\t\tOUR MOTO IS TO GET EVERY ELECTRONIC ITEM IN FAIR PRICE FOR YOU!!!");
            System.out.println("**************************************************************************************************************\n");
            System.out.println("\n$UMEET $@LE$\n     ");
            System.out.println("\t||1.)SEE PRODUCT LIST     ||");
            System.out.println("\t||2.)BUY                  ||");
            System.out.println("\t||3.)BILL                 ||");
            System.out.println("\t||4.)ADD A PRODUCT        ||");
            System.out.println("\t||5.)REMOVE A PRODUCT     ||");
            System.out.println("\t||6.)MODIFY COST          ||");
            System.out.println("\t||7.)EARNINGS AND HISTORY ||");
            System.out.println("\t||8.)EXIT                 ||");
            try
            {
                System.out.println("Enter your choice");
                ch=Integer.parseInt(obj.sc.next());
            }
            catch(Exception e)
            {
                System.out.println("ENTER choice");
                ch=obj.sc.nextInt();
            }
            obj.switch1(ch);

            try
            {
                System.out.print("Press 1 if you want be redirected to main menu : ");
                obj.m_conti = obj.sc.nextInt();
            }
            catch(Exception e)
            {
                System.out.println("wrong input please ENTER your choice again:");
                obj.m_conti = obj.sc.nextInt();
            }

        }while(obj.m_conti == 1);

        System.out.println("Thank You\t Visit AGain..!!");
    }

    void switch1(int ch)
    {
        switch(ch)
        {

            case 1:
            System.out.println("\u000c");
            prod();

            break;

            case 2:
            System.out.println("\u000c");
            buy();
            break;

            case 3:
            System.out.println("\u000c");
            bill();
            break;

            case 4:
            System.out.println("\u000c");
            add();
            break;

            case 5:
            System.out.println("\u000c");
            remove();
            break;

            case 6:
            System.out.println("\u000c");
            modify_price();
            break;

            case 7:
            System.out.println("\u000c");
            earning();
            break;
            case 8:
            System.out.println("\u000c");
            exit();
            break;
            default:
            System.out.println("WRONG INPUT!!!!PLEASE TRY AGAIN");
        }
    }

    void prod()
    {
        System.out.println("\f");  
        System.out.println(dft.format(now));
        System.out.println("\t\t\t\t\t\t\t\t      ^ ");
        System.out.println("\t\t\t\t\t\t\t\t     ^^^ ");
        System.out.println("\t\t\t\t\t\t\t\t   ^^^^^^^ ");
        System.out.println("\t\t\t\t\t\t\t\t ------------ ");
        System.out.println("\t\t\t\t\t\t\t\t $umeet sales ");
        System.out.println("\t\t\t\t\t\t\t\t ------------ ");
        System.out.println("\t\t\t\t\t\t\t\t   vvvvvvv ");
        System.out.println("\t\t\t\t\t\t\t\t     vvv ");
        System.out.println("\t\t\t\t\t\t\t\t      v  ");
        System.out.println("**************************************************************************************************************");
        System.out.println("\t\t\t\tOUR MOTO IS TO GET EVERY ELECTRONIC ITEM IN FAIR PRICE FOR YOU!!!");
        System.out.println("**************************************************************************************************************\n\n\n\n");

        System.out.println("P.ID\tCATEGORY\t\tNAME\t\t\tQTY \t\tCOST");
        System.out.println("____________________________________________________");
        int a=1;
        for(i=0;i<15;i++)
        {

            if(m_rmv[i]=='n' && m_cat[i]!=null)

            {

                System.out.println(a+"\t"+m_cat[i]+"\t\t||"+m_name[i]+"\t||"+m_qty[i]+"\t||"+m_cost[i]);
                a++;
            }
        } 
    }

    void buy()
    {

        int contibuy;
        register_user();
        do
        {
            int p_id;
            prod();
            System.out.println(" ___________");
            System.out.println("|ENTER 0 FOR GOING TO MAIN MENU |");
            System.out.println("|___________|");
            System.out.println("Which product you want........please enter product id...:::");
            try
            {
                p_id=Integer.parseInt(sc.next());
            }
            catch(Exception e)
            {
                System.out.println("wrong input!! ");
                System.out.println("ENTER  your choice again");
                p_id=Integer.parseInt(sc.next());
            }
            boolean flag =false;

            for(int i=0;i<15;i++)
            {   
                if(p_id==0)
                {
                    System.out.println("\f");   
                    System.out.println("☺☺ Press 1 to return to  main menu any other key for ending shoping 😊😊😊😊😊😊");
                    break;
                }
                int qty;

                if(p_id==m_id[i])
                {
                    flag = true;
                    while(true)
                    {
                        System.out.print("Enter no. quantity : ");
                        try
                        {
                            qty = sc.nextInt();
                            break;
                        }
                        catch(Exception e)
                        {
                            System.out.println("Enter only Integer values..!! ");
                            dustbin = sc.nextLine();
                        }
                    }
                    if(qty <= m_qty[i] && qty>0)
                    {

                        c_m_id[a] = cid;
                        c_no[a] = cust_contact;
                        c_name[a]=cust_name;
                        c_email[a]=cust_email;

                        c_m_qty[a] = qty;
                        m_qty[i]-=c_m_qty[a];
                        c_m_cat[a]=m_cat[i];
                        c_m_name[a]=m_name[i];
                        c_m_cost[a]=m_cost[i];
                        a++;

                    }
                    else
                    {  System.out.println("Insufficient Qty..!!");

                    }
                }

            }

            if(flag==false)
            {
                System.out.println("WRONG PRODUCT ID");
            }
            System.out.print("Press 1 if you want to continue to Buy : ");
            contibuy = sc.nextInt();
        }while(contibuy == 1);
    }

    void bill()
    {
        if(c_m_qty[0]!=0)
        {    
            System.out.println("\f");  
            System.out.println(dft.format(now));
            System.out.println("\t\t\t\t\t\t\t\t      ^ ");
            System.out.println("\t\t\t\t\t\t\t\t     ^^^ ");
            System.out.println("\t\t\t\t\t\t\t\t   ^^^^^^^ ");
            System.out.println("\t\t\t\t\t\t\t\t ------------ ");
            System.out.println("\t\t\t\t\t\t\t\t $umeet sales ");
            System.out.println("\t\t\t\t\t\t\t\t ------------ ");
            System.out.println("\t\t\t\t\t\t\t\t   vvvvvvv ");
            System.out.println("\t\t\t\t\t\t\t\t     vvv ");
            System.out.println("\t\t\t\t\t\t\t\t      v  ");
            System.out.println("**************************************************************************************************************");
            System.out.println("\t\t\t\tOUR MOTTO IS TO GET EVERY ELECTRONIC ITEM IN FAIR PRICE FOR YOU!!!");
            System.out.println("**************************************************************************************************************\n\n\n\n");
            System.out.println("PLEASE ENTER YOUR CUSTOMER ID");
            try
            {
                id=Integer.parseInt(sc.next());
            }
            catch(Exception e)
            {
                System.out.println("wrong input!! ");
                System.out.println("ENTER ID again");
                id=Integer.parseInt(sc.next());
            }

            int b=1,c=0;
            double tc=0;
            int k=0;
            for(i=0;i<15;i++)
            {
                if (c_m_id[i]==id)
                { 
                    if(k==0)
                    {
                        System.out.println("||CUST. NAME:"+c_name[i]+"||\n||CONTACT NO.:"+c_no[i]+"||\n||CUST EMAIL ID:"+c_email[i]+"||\n");       
                        k++;
                        System.out.println("P.ID\tCATEGORY\t\tNAME\t\t\tQTY \t\t\tCOST \t\tAMOUNT");
                        System.out.println("____________________________________________________");
                    }
                    tot=tot+(c_m_cost[i]*c_m_qty[i]);
                    tc+=(c_m_cost[i]*c_m_qty[i]);
                    System.out.println(b+" ||\t  "+c_m_cat[i]+"||\t\t"+c_m_name[i]+"||\t\t"+c_m_qty[i]+"  ||\t\t  "+c_m_cost[i]+ "  ||\t  "+(c_m_cost[i]*c_m_qty[i]));
                    b++;
                }

            }
            double gst=(0.18*tc);
            total_cost=tc+gst;

            System.out.println("                                                                                G.S.T:18%||   "+gst);
            System.out.println("______________________________||_____");
            System.out.println("                                                                                             "+total_cost); 
        }
        else if(c_m_qty[0]==0)
        {
            System.out.println("\t\t\t||☻☻☻☻PLEASE SHOP FOR HAVING A BILL☻☻☻☻||");
            System.out.println("___________________________");
            for(int i=0;i<=1000;i++)
            {

            }
        }
    }

    void add()
    {
        System.out.println(" ___________");
        System.out.println("|ENTER 0 FOR GOING TO MAIN MENU |");
        System.out.println("|___________|");
        System.out.println("PRODUCT ID: "+(++added1));
        sc.nextLine();
        System.out.println("ENTER PRODUCT CATEGORY: ");
        m_cat[added]=sc.nextLine();

        for(int i=m_cat[added].length();i<10;i++)
        {
            m_cat[added]=m_cat[added]+" ";
        }
        if(m_cat[added]!="0")
        {

            System.out.println("ENTER PRODUCT NAME: ");
            m_name[added]=sc.nextLine();

            for(int i=m_name[added].length();i<21;i++)
            {
                m_name[added]=m_name[added]+" ";
            }

            try
            {
                System.out.println("ENTER QUANTITY OF PRODUCT (limit of 50 product) : ");
                int qty=Integer.parseInt(sc.next());
                if(qty<=50)
                    m_qty[added]=qty;
                else
                {
                    System.out.println("please select less than or equals to 50");
                    m_qty[added]=Integer.parseInt(sc.next());
                }
            }

            catch(Exception e)
            {
                System.out.println("wrong input!! ");
                System.out.println("ENTER  cost again");
                m_qty[added]=Integer.parseInt(sc.next());
            }

            try
            {
                System.out.println("ENTER PRODUCT COST : ");
                m_cost[added]=Integer.parseInt(sc.next());
            }
            catch(Exception e)
            {
                System.out.println("wrong input!! ");
                System.out.println("ENTER  cost again");
                m_cost[added]=Integer.parseInt(sc.next());
            }

            m_rmv[added]='n';
            added++;

        }
    }

    void remove()
    {
        prod();
        System.out.println(" ___________");
        System.out.println("|ENTER 0 FOR GOING TO MAIN MENU |");
        System.out.println("|___________|");

        int rvm;
        System.out.println("ENTER PRODUCT ID: ");
        try
        {
            rvm=Integer.parseInt(sc.next());

        }
        catch(Exception e)
        {
            System.out.println("wrong input!! ");
            System.out.println("ENTER product id again");
            rvm=Integer.parseInt(sc.next());
        }

        if(rvm!=0)
        {
            //--rvm;
            m_cat[rvm-1]="";
            /*m_name[rvm-1]="";
            m_cost[rvm-1]=0;
            m_qty[rvm-1]=0;*/
            m_rmv[rvm-1]='Y';

        }
    }

    void modify_price()
    {
        System.out.println(" ___________");
        System.out.println("|ENTER 0 FOR GOING TO MAIN MENU |");
        System.out.println("|___________|");

        prod();
        int mod;
        System.out.println("ENTER PRODUCT ID: ");
        try
        {
            mod=Integer.parseInt(sc.next());
        }
        catch(Exception e)
        {
            System.out.println("wrong input!! ");
            System.out.println("ENTER PRODUCT ID again");
            mod=Integer.parseInt(sc.next());
        }

        if(mod!=0)
        {
            int new_price;
            mod--;
            m_cost[mod]=0;
            System.out.println("ENTER THE NEW PRICE: ");
            try
            {
                new_price =Integer.parseInt(sc.next());
            }
            catch(Exception e)
            {
                System.out.println("wrong input!! ");
                System.out.println("ENTER new cost again");
                new_price =Integer.parseInt(sc.next());
            }

            m_cost[mod]=new_price;
            mod=0;
        }
    }

    void earning()
    {
        System.out.println("\t       TOTAL EARNINGS");
        System.out.println("\t__________");
        int cust=0;
        int prod=0;
        int c_id=0;
        for(int i =0;i<15;i++) 
        {
            if(c_m_id[i]!=0)
            {
                if(c_m_id[i]!=c_id)
                { 
                    cust++;
                    c_id=c_m_id[i];
                }   
            }
        }
        for(int i=0;i<15;i++)
        {
            prod=c_m_qty[i]+prod;
        }
        System.out.println("NO. OF CUSTOMERS:-"+cust);
        System.out.println("NO. OF PRODUCTS SOLD:-"+prod);
        System.out.println("TOTAL EARNING:"+tot);
    }

    void register_user() 
    {
        System.out.println(dft.format(now));
        System.out.println("\t\t\t\t\t\t\t\t         ^");
        System.out.println("\t\t\t\t\t\t\t\t        ^^^ ");
        System.out.println("\t\t\t\t\t\t\t\t      ^^^^^^^ ");
        System.out.println("\t\t\t\t\t\t\t\t ------------------    ");
        System.out.println("\t\t\t\t\t\t\t\t    $umeet sales      ");
        System.out.println("\t\t\t\t\t\t\t\t ------------------     ");
        System.out.println("\t\t\t\t\t\t\t\t      vvvvvvv ");
        System.out.println("\t\t\t\t\t\t\t\t        vvv ");
        System.out.println("\t\t\t\t\t\t\t\t         v  ");
        System.out.println("**************************************************************************************************************");
        System.out.println("\t\t\t\tOUR MOTTO IS TO GET EVERY ELECTRONIC ITEM IN FAIR PRICE FOR YOU!!!");
        System.out.println("**************************************************************************************************************\n\n\n\n");
        cid++;
        System.out.println("Your customer ID is : "+ cid);

        System.out.println("Enter your name");
        cust_name=sc.next();

        String dustbin1=sc.nextLine();
        while(true)
        {
            try
            {
                System.out.println("Enter your contact no.");
                cust_contact=Long.parseLong(sc.next());
                long b=Long.toString(cust_contact).length();
                if(b!=10)
                {
                    System.out.println("PLEASE ENTER A VALID CONTACT NO.");                    
                }
                else
                    break;
            }
            catch(Exception e)
            {
                System.out.println("ENTER Only Integer Values.");            
            }
        }
        String dustbin=sc.nextLine();

        System.out.println("Enter your email address ");
        cust_email=sc.nextLine();

    }

    void loading()
    {
        String s="loading..........⤠⤞⤞⤞⤞⤞⤞⤞.....redirecting....⤠⤞⤞⤞⤞⤞⤞⤞";

        for(int i7=0;i7<1000;i7++)
        {
            for(int i=0;i<s.length();i++)
            {
                System.out.print(s.charAt(i));
            }
            System.out.print("\f");
        }
        System.out.print("\f");       
    }

    void exit()
    {
        loading();

        String s2= "EXITING ........-------";

        System.out.println(dft.format(now));
        System.out.println("\t\t\t\t\t\t\t\t      ^ ");
        System.out.println("\t\t\t\t\t\t\t\t     ^^^ ");
        System.out.println("\t\t\t\t\t\t\t\t   ^^^^^^^ ");
        System.out.println("\t\t\t\t\t\t\t\t ------------ ");
        System.out.println("\t\t\t\t\t\t\t\t $umeet sales ");
        System.out.println("\t\t\t\t\t\t\t\t ------------ ");
        System.out.println("\t\t\t\t\t\t\t\t   vvvvvvv ");
        System.out.println("\t\t\t\t\t\t\t\t     vvv ");
        System.out.println("\t\t\t\t\t\t\t\t      v  ");
        System.out.println("**************************************************************************************************************");
        System.out.println("\t\t\t\t\tOUR MOTTO IS TO GET EVERY ELECTRONIC ITEM IN FAIR PRICE FOR YOU!!!");
        System.out.println("**************************************************************************************************************\n\n\n\n");            
        System.out.println("tttttttttttttttttttt      hhhhh        hhhhh      aaaaaaaa      nnnnn nn       nnnnn      kkkkk     kkkkk      uuuu    uuuu");   
        System.out.println("      tttttt              hhhhh hhhhhh hhhhh      aaa  aaa      nnnnn  nnnn    nnnnn      kkkkk kk k           uuuu    uuuu"); 
        System.out.println("      tttttt              hhhhh hhhhhh hhhhh      aaaaaaaa      nnnnn      nn nnnnnn      kkkkk kk k            uuuuuuuuuu ");
        System.out.println("      tttttt              hhhhh        hhhhh      aaa  aaa      nnnnn         nnnnnn      kkkkk     kkkkk        uuuuuuuu  ");       
        System.exit(0);

    }

}
