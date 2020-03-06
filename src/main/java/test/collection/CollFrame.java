package test.collection;
import java.util.*;
import java.io.*;

public class CollFrame {

	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        data d = new data();
	        d.dataentry();
	        int c;
	        do{
	         System.out.println("\n 1. Display all data \n 2. Fetch a data from list\n 3. Add a data to the list\n 4.Remove a data from list\n Enter your choice :");
	        int choice=sc.nextInt();
	         switch(choice)
	            {
	            case 1: d.display();
	            break;
	            case 2: d.fetch();
	            break;
	            case 3: d.add();
	            break;
	            case 4: d.delete();
	            break;
	            default:
	            System.out.println("PLease enter vallid data");
	            } 
	            System.out.println("\ndo you want to continue\n Enter    1     to continue the operation\n Enter    0     to Exit the operation ");
	            c = sc.nextInt();
	          } while(c==1);  
	          }

	}

interface collist {
	  public void dataentry();
	  public void fetch(); 
	  public void display();
	  public void add();
	  LinkedHashSet<String> adddata=new LinkedHashSet<String>();
	  Scanner sc=new Scanner(System.in); 
	}
	class data implements collist {
	  public void dataentry() {
	    adddata.add("Raju");
	    adddata.add("Arbind");
	    adddata.add("Sarita");
	    adddata.add("Shanthan");
	    adddata.add("Mohan");
	    adddata.add("Binod");
	    adddata.add("Saymon");
	    adddata.add("Chandan");
	    adddata.add("Nisha");
	    adddata.add("Madhan");
	    }
	    public void display() {  
	        Iterator<String> itr=adddata.iterator();  
	        while(itr.hasNext()){  
	            System.out.println(itr.next());
	         }
	    }
	    public void fetch() { 
	        ArrayList<String> list=new ArrayList<String>(adddata);
	        System.out.println("Enter the number of which you want to fetch\n");
	        int n=sc.nextInt();
	        System.out.println("\nelement of the ArrayList you fetched is  : "+ list.get(n-1));
	    }
	    public void add() { 
	        System.out.println("\nEnter the data to be entered");
	        String str=sc.nextLine();
	        adddata.add(str);
	    }
	    public void delete() { 
	        System.out.println("\nEnter the data to be entered");
	        String str=sc.nextLine();
	        adddata.remove(str);
	        Iterator<String> itr=adddata.iterator();  
	        while(itr.hasNext()){  
	            System.out.println(itr.next());
	        }
	    }
	}
