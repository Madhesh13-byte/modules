import java.util.*;
import java.io.*;
class alvinklintan
{
    int aa,bb,cc,dd,ee;
}
class customer extends alvinklintan
{
    int xx=0,yy=0,zz=0,ii=0,kk,cus=0,im;
    String jj;
}
class alvin extends customer
{
    int a,b,c,pd;
    String x,y,z;
}
class klintan
{
    static int tomatto=100,onion=100,potato=100,oil=100;
    static int to=100,on=35,po=50,oi=80,cas=0;
    
    
}


public class Main extends klintan
{
    static int al=0;
   static int adminpass=000,adminid=111;
    static int  av=1;
	public static void main(String[] args) throws IOException{
	    File xyz=new File("alvin.txt");
	    File ijk=new File("klintan.txt");
	    File mno=new File("alvinklintan.txt");
	    PrintWriter kji=new PrintWriter(ijk);
	    PrintWriter zyx=new PrintWriter(xyz);
	    PrintWriter onm=new PrintWriter(mno);
	    Scanner sc = new Scanner(System.in);
	    int vi,no,vin,i;
	    klintan hen = new klintan();
		alvin v[]=new alvin[1000];
		alvin s[]=new alvin[100];
		onm.printf("Total Tomatto is:%d",tomatto);
        onm.println();
        onm.printf("Total Onion is:%d",onion);
        onm.println();
        onm.printf("Total Potato is:%d",potato);
        onm.println();
        onm.printf("Total Oil is:%d",oil);
        onm.println();
        onm.close();
		while(true)
		{
		    System.out.print("\n1.owner\n2.chashier\n3.exit");
		    System.out.print("\nenter your choice:");
		    int n=sc.nextInt();
		    if(n==1)
		    {
		        System.out.print("\nEnter admin id:");
		        int admin=sc.nextInt();
		        System.out.print("\nEnter admin password:");
		        int password=sc.nextInt();
		        if(admin==adminid&&adminpass==password)
		        {
            		        while(true)
            		        {
            		            System.out.print("\n1.add chashier\n2.view chashier\n3.exit");
            		            System.out.print("\nenter your choice:");
            		            vi=sc.nextInt();
            		            if(vi==1)
            		            {
                    		        System.out.print("\nhow many person you are added:");
                    		        int all=sc.nextInt();
                    		        al=all;
                    		        for(i=1;i<=al;i++)
                    		        {
                    		            v[i]=new alvin();
                    		            System.out.print("\nenter your name:");
                    		            v[i].x=sc.next();
                    		            System.out.print("\nenter your nick  name:");
                    		            v[i].y=sc.next();
                    		            System.out.print("\nenter your password is:");
                    		            v[i].pd=sc.nextInt();
                    		        }
            		            }
            		            else if(vi==2)
            		            {
            		                for(i=1;i<=al;i++)
            		                {
            		                    System.out.print(v[i].x+"-----"+v[i].y+"-----"+v[i].pd);
            		                    System.out.println();
            		                    zyx.printf("Cashier Name:%s",v[i].x);
            		                    zyx.println();
            		                    zyx.printf("Cashier Nick Name:%s",v[i].y);
            		                     zyx.println();
            		                    zyx.printf("Cashier Password:%d",v[i].pd);
            		                     zyx.println();
            		                }
            		                zyx.close();
            		            }
            		            else
            		            break;
            		        
            		        }
		        }
		        else
		        System.out.print("\nInvalid id and password....please check...");
		    }
		    else if(n==2)
		    {
		        int j=0;
		        while(true)
		        {
    		        System.out.print("\n1.signin\n2.total customer\n3.logout");
    		        System.out.print("\nenter your choice:");
    		        vin=sc.nextInt();
    		        if(vin==1)
    		        {
    		            System.out.print("\nwhich chashier add the stock please enter their password:");
    		            int pass=sc.nextInt();
    		            for(i=1;i<=al;i++)
    		            {
    		                if(v[i].pd==pass)
    		                {
    		                    System.out.println(".....vanga Mr."+v[i].y+".......");
    		                    while(true)
    		                    {
    		                        System.out.print("\n1.view over all stock\n2.add stock\n3.view stock\n4.delete stock\n5.add bill\n6.view bill\n7.exit");
    		                        System.out.print("\nenter your choice:");
    		                        int ab=sc.nextInt();
    		                        if(ab==1)
    		                        {
    
                                        System.out.print("\n........your overall stock..........");
                                        System.out.print("\ntomatto......."+tomatto);
                                        System.out.print("\nonion......."+onion);
                                        System.out.print("\npotato......."+potato);
                                        System.out.print("\noil......."+oil);
                                        
    
    		                        }
    		                        else if(ab==2)
    		                        {
    		                            System.out.print("\nhow many tomatto you want to  add:");
    		                            
    		                                v[i].aa=sc.nextInt();
    		                                if(v[i].aa<=tomatto)
    		                                tomatto-=v[i].aa;
    		                            System.out.print("\nhow many onion you want to add:");
    		                            v[i].bb=sc.nextInt();
    		                            if(v[i].bb<=onion)
    		                            onion-=v[i].bb;
    		                            System.out.print("\nhow many potato you want to add:");
    		                            v[i].cc=sc.nextInt();
    		                            if(v[i].cc<=potato)
    		                            potato-=v[i].cc;
    		                            System.out.print("\nhow many liter oil you are add:");
    		                            v[i].dd=sc.nextInt();
    		                            if(v[i].dd<=oil)
    		                            oil-=v[i].dd;
    		                            
    		                        }
    		                        else if(ab==3)
    		                        {
    		                            System.out.print("\n.......your total stock.........");
    		                            if(v[i].aa>=0)
    		                            System.out.print("\ntomatto-----"+v[i].aa);
    		                            if(v[i].bb>=0)
    		                            System.out.print("\nonion-------"+v[i].bb);
    		                            if(v[i].cc>=0)
    		                            System.out.print("\npotato------"+v[i].cc);
    		                            if(v[i].dd>=0)
    		                            System.out.print("\noil---------"+v[i].dd);
    		                        }
    		                        else if(ab==4)
    		                        {
    		                            System.out.print("\nwhich one you are delete....");
    		                            System.out.print("\n1.tomatto\n2.onion\n3.potato\n4.oil");
    		                            System.out.print("\nenter your choice:");
    		                            int op=sc.nextInt();
    		                            if(op==1)
    		                            {
    		                                tomatto+=v[i].aa;
    		                            v[i].aa=-1;
    		                            }
    		                            else if(op==2)
    		                            {
    		                                onion+=v[i].bb;
    		                            v[i].bb=-1;
    		                            }
    		                            else if(op==3)
    		                            {
    		                                potato+=v[i].cc;
    		                            v[i].cc=-1;
    		                            }
    		                            
    		                            else if(op==4)
    		                            {
    		                                oil+=v[i].dd;
    		                            v[i].dd=-1;
    		                            }
    		                        }
    		                        else if(ab==5)
    		                        {
    		                            
    		                            
    		                            System.out.print("\nhow many customer your handle:");
    		                            int in=sc.nextInt();
    		                            v[i].cus=in;
    		                            
    		                            for(;in!=0;--in)
    		                            {
    		                                s[av]=new alvin();
    		                                s[av].im=v[i].pd;
    		                                System.out.print("\nenter customer name:");
    		                                s[av].jj=sc.next();
    		                                System.out.print("\nenter customer password:");
    		                                s[av].kk=sc.nextInt();
    		                                System.out.print("\n\t...Welcome customer...Mr."+s[av].jj);
    		                                System.out.print("\n...............yes..what do you want....?");
    		                                while(true)
    		                                {
            		                                System.out.print("\n1.tomatto\n2.onion\n3.potato\n4.oil\n5.enough");
            		                                System.out.print("\nenter your choice:");
            		                                int pi=sc.nextInt();
            		                                if(pi==1)
            		                                {
            		                                    System.out.print("\nhow many kg tomatto you want to buy....:");
            		                                    int abi=sc.nextInt();
            		                                    s[av].xx+=abi*to;
            		                                }
            		                                else if(pi==2)
            		                                {
            		                                    System.out.print("\nhow many kg onion you want to buy....:");
            		                                    int abi=sc.nextInt();
            		                                    s[av].yy+=abi*on;
            		                                }
            		                                else if(pi==3)
            		                                {
            		                                    System.out.print("\nhow many kg potato you want to buy....:");
            		                                    int abi=sc.nextInt();
            		                                    s[av].zz+=abi*po;
            		                                }
            		                                else if(pi==4)
            		                                {
            		                                    System.out.print("\nhow many kg oil you want to buy....:");
            		                                    int abi=sc.nextInt();
            		                                    s[av].ii+=abi*oi;
            		                                }
            		                                else
            		                                break;
    		                                }
    		                                av++;
    		                            }
    		                            
    		                        }
    		                        else if(ab==6)
    		                        {
    		                            System.out.print("\nwhich chashier added the bill.....?");
    		                            System.out.print("\nenter the password:");
    		                            int ik=sc.nextInt();
    		                            int jk=0,kl=0,flag=0;
    		                         
    		                            for(i=1;i<=al;i++)
    		                            {
    		                                
    		                                if(ik==v[i].pd)
    		                                {
    		                                    int mi=1;
    		                                    kl=v[i].cus;jk+=i;
    		                                    System.out.print("\n................ customers of...........Mr."+v[i].x);
    		                                    for(;mi<av;mi++)
    		                                    {
    		                                        if(v[i].pd==s[mi].im)
    		                                        {
    		                                        System.out.print("\ncustomer name is........."+s[mi].jj);
    		                                        System.out.print("\ncustomer password is....."+s[mi].kk);
    		                                        }
    		                                    }
    		                                    while(flag==0)
    		                                    {
            		                                    System.out.print("\n...which one customer you are put in bill...:");
            		                                    int  vii=sc.nextInt();
            		                                    jk=1;
            		                                    kl=v[i].cus;
            		                                    for(;jk<av;jk++)
            		                                    {
            		                                        if(vii==s[jk].kk)
            		                                        {
            		                                            System.out.print("\ntomatto total is...."+s[jk].xx);
            		                                            System.out.print("\nonion total is......"+s[jk].yy);
            		                                            System.out.print("\npotato total is....."+s[jk].zz);
            		                                            System.out.print("\noil total is........"+s[jk].ii);
            		                                            System.out.print("\n---------------------------");
            		                                            System.out.print("\ngrand total is------"+(s[jk].xx+s[jk].yy+s[jk].zz+s[jk].ii));
            		                                            System.out.print("\n---------------------------");
            		                                            kji.printf("---------vanga Mr/Mrs:%s",s[jk].jj);
            		                                            kji.println();
            		                                            kji.println();
            		                                            kji.printf("total tomatto:%d",s[jk].xx);
            		                                            kji.println();
            		                                            kji.printf("total onion:%d",s[jk].yy);
            		                                            kji.println();
            		                                            kji.printf("total potato:%d",s[jk].zz);
            		                                            kji.println();
            		                                            kji.printf("total oil:%d",s[jk].ii);
            		                                            kji.println();
            		                                            kji.print("----------");
            		                                            kji.println();
            		                                            kji.printf("your grand total is:%d",(s[jk].xx+s[jk].yy+s[jk].zz+s[jk].ii));
            		                                            kji.println();
            		                                            kji.print("----------");
            		                                            kji.println();
            		                                            kji.print("---------------------------------------------------------------------------");
            		                                            kji.println();
            		                                        }
            		                                    }
            		                                    System.out.print("\ndo you want to continue:");
            		                                    int klin=sc.nextInt();
            		                                    if(klin==0)
            		                                    flag=1;
            		                                    
    		                                    }
    		                                    
    		                                    
    		                                    
    		                                }
    		                            }
    		                            
    		                        }
    		                        else
    		                        break;
    		                    }
    		                }
    		            }
    		            
    		        }
    		        else if(vin==2)
    		        {
    		            int mi=1,f=1;
    		            for(;mi<av;mi++)
    		            {
    		                f=0;
    		                System.out.print("\ncustomer name is........."+s[mi].jj);
    		                System.out.print("\ncustomer password is....."+s[mi].kk);
    		                
    		            }
    		           
    		            if(f==1)
    		            System.out.print("\n.....mothalla poi customer ahh add pannitu.. apram vaa inga....");
    		        }
    		        else
    		        break;
		        }
		        kji.close();
		    }
		    else
		    {
		    System.out.print("-----------\nTHANKS FOR COMMING....LET'S SEE YOU SOON.....");
		    break;
		    }
		}
	}
}










// 1.owner
// 2.chashier
// 3.exit
// enter your choice:1

// Enter admin id:111 

// Enter admin password:000

// 1.add chashier
// 2.view chashier
// 3.exit
// enter your choice:1

// how many person you are added:2

// enter your name:abc

// enter your nick  name:a

// enter your password is:123

// enter your name:def

// enter your nick  name:f

// enter your password is:123

// 1.add chashier
// 2.view chashier
// 3.exit
// enter your choice:2
// abc-----a-----123
// def-----f-----123

// 1.add chashier
// 2.view chashier
// 3.exit
// enter your choice:3

// 1.owner
// 2.chashier
// 3.exit
// enter your choice:2

// 1.signin
// 2.total customer
// 3.logout
// enter your choice:1

// which chashier add the stock please enter their password:123
// .....vanga Mr.a.......

// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:1

// ........your overall stock..........
// tomatto.......100
// onion.......100
// potato.......100
// oil.......100
// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:3

// .......your total stock.........
// tomatto-----0
// onion-------0
// potato------0
// oil---------0
// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:2

// how many tomatto you want to  add:10

// how many onion you want to add:5

// how many potato you want to add:3

// how many liter oil you are add:2

// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:1

// ........your overall stock..........
// tomatto.......90
// onion.......95
// potato.......97
// oil.......98
// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:3

// .......your total stock.........
// tomatto-----10
// onion-------5
// potato------3
// oil---------2
// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:4

// which one you are delete....
// 1.tomatto
// 2.onion
// 3.potato
// 4.oil
// enter your choice:1

// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:1

// ........your overall stock..........
// tomatto.......100
// onion.......95
// potato.......97
// oil.......98
// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:3

// .......your total stock.........
// onion-------5
// potato------3
// oil---------2
// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:5

// how many customer your handle:2

// enter customer name:k

// enter customer password:1223

//         ...Welcome customer...Mr.k
// ...............yes..what do you want....?
// 1.tomatto
// 2.onion
// 3.potato
// 4.oil
// 5.enough
// enter your choice:1

// how many kg tomatto you want to buy....:1

// 1.tomatto
// 2.onion
// 3.potato
// 4.oil
// 5.enough
// enter your choice:2

// how many kg onion you want to buy....:2

// 1.tomatto
// 2.onion
// 3.potato
// 4.oil
// 5.enough
// enter your choice:5

// enter customer name:b

// enter customer password:1223

//         ...Welcome customer...Mr.b
// ...............yes..what do you want....?
// 1.tomatto
// 2.onion
// 3.potato
// 4.oil
// 5.enough
// enter your choice:3

// how many kg potato you want to buy....:1

// 1.tomatto
// 2.onion
// 3.potato
// 4.oil
// 5.enough
// enter your choice:5

// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:6

// which chashier added the bill.....?
// enter the password:123

// ................ customers of...........Mr.abc
// customer name is.........k
// customer password is.....1223
// customer name is.........b
// customer password is.....1223
// ...which one customer you are put in bill...:1

// do you want to continue:0

// ................ customers of...........Mr.def
// customer name is.........k
// customer password is.....1223
// customer name is.........b
// customer password is.....1223
// 1.view over all stock
// 2.add stock
// 3.view stock
// 4.delete stock
// 5.add bill
// 6.view bill
// 7.exit
// enter your choice:7

// 1.signin
// 2.total customer
// 3.logout
// enter your choice:2

// customer name is.........k
// customer password is.....1223
// customer name is.........b
// customer password is.....1223
// 1.signin
// 2.total customer
// 3.logout
// enter your choice:3

// 1.owner
// 2.chashier
// 3.exit
// enter your choice:3
// -----------
// THANKS FOR COMMING....LET'S SEE YOU SOON.....













