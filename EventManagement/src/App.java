import java.util.ArrayList;
import java.util.Scanner;

public class App {
    //Tạo 1 phương thức nhập ngoài cho tiện (1)
    Scanner sc=new Scanner(System.in);
    
    public void Menu(){
        //Tạo 1 mảng arraylist để lưu giá trị của menu (2)
        ArrayList<String> menu=new ArrayList<>();
        menu.add("1.Create a new event");
        menu.add("2.Check if an event exists");
        menu.add("3.Search for event information by location");
        menu.add("4.Update event :"+"\n"+"4.1. Update event details"+"\n"+"4.2.Delete event");
        menu.add("5.Save events to a file");
        menu.add("6.Print the list of events from the file");
        menu.add("7.Others-Quit");

        

        
        //Tạo vòng lặp vô hạn chạy bảng menu
        while(true){
            //In mảng ra (3)
            System.out.println("=========================MENU===========================");
            for (String inra:menu){
                System.out.println(inra);
            }
            System.out.println("========================================================");

            //Nhập
            int nhapswitch=nhapCheck(menu);

            switch(nhapswitch) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    System.exit(0);;
                    break;
            }
        }
    }

    //Tạo 1 phương thức chỉ cho người dùng nhập trong khoảng 1=>7 , nếu sai sẽ bắt người dùng nhập lại (4)
    public int nhapCheck(ArrayList<String> menu){//(5)
        System.out.println("Mời bạn chọn");
        int nhap=sc.nextInt();
        boolean dk=true;
        while(true){//Vòng này tác dụng bắt nhập tới khi đúng
            if (nhap>=1 && nhap<=7){
                dk=false;
                return nhap;
            } else {
                //In lại menu cho người dùng xem
                for (String inra2 : menu){//Tại đây nếu ko truyền mảng menu vào nó sẽ ko biết đang gọi tới đối tượng nào 
                    System.out.println(inra2);
                }
                dk=true;
                //bắt người dùng nhập lại
                System.out.println("Mời bạn nhập lại");
                nhap=sc.nextInt();
            }
        }
        
    }
    
    public static void main(String[] args) throws Exception {
        App menu=new App();
        menu.Menu();    
        
    }
}
