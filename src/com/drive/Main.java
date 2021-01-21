package com.drive;
import java.util.*;
class Library{
    Scanner sc =new Scanner(System.in);
    List book_name = new ArrayList();
    List book_author= new ArrayList();
    List book_Subject = new ArrayList();
    List page_nuber = new ArrayList();
    List price = new ArrayList();

    String str ;
    int page_no,choice;
    float Price;
    int a,b;
    void checkLibrary(){
        System.out.println("Are you a Librarian or Student? If Student then press 1 orelse 2");

        a=sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("1 : Search a book \n 2 : Loan a book "  );
                break;
            case 2:
                System.out.println("Please Enter the choice \n 1: Add new book \n 2: See all books \n 3: See the books loaned out to students ");
                choice=sc.nextInt();
                if(choice==1){
                    System.out.println("Enter book name");
                    str = sc.nextLine();
                    book_name.add(str);
                    System.out.println("Enter book author name");
                    str= sc.nextLine();
                    book_author.add(str);
                    System.out.println("Enter page number");
                    b=sc.nextInt();
                    page_nuber.add(b);
                    System.out.println("Enter Price");
                    Price=sc.nextFloat();
                    price.add(Price);
                }
                else if(choice == 2){
                    System.out.println(book_name);
                }
                break;
        }


    }

}
public class Main {

    public static void main(String[] args) {
        Library r =new Library();

    }
}
