import java.io.*;
import java.util.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
class Customer
{
    private int cus_id;
    private String name;
    private String address ;
    private String email;
    private long phone_no ;
    private int age ;
    private float discounts;
    private String encryptedPassword;
	public static String key="12345";

    

    public void getCustomer()
    {
       return this.cus_id;
    }
    public void newCustomers(String name,String address,String email,long phone_no,int age)
    {
        this.name=name;
        this.address=address;
        this.email=email;
        this.phone_no=phone_no;
        this.age=age;
    }
    public void changePhoneno(long phone_no)
    {
        this.phone_no=phone_no;
    }
    public void discounts(float discounts)
    {
        this.discounts=discounts;
    }
    public String getEmail() 
    {
		return this.email;
	}
    //parameterised constructor
	public Customer(int cus_id, String name,String address, String email,String phone_no,String age,String plainPassword){

		// constructor chaining
		this(cus_id, name, email);

		this.phone_no=phone_no;
		this.encryptedPassword=securePassword(plainPassword);

		System.out.println("Constructor Chained:"+this.cus_id);
	}
    // Constructor overloading
	public Customer(int id, String name, String email){
		// constructor chaining
		this();

		this.cus_id=cus_id;
		this.name="Mr. "+name;
		this.email=email;
		this.encryptedPassword=securePassword("1234");

		System.out.println("customer Created: "+cus_id);
	}
	public Customer(){
		System.out.println("customer object created.");
	}


	public void resetPassword(String plainPassword){
		this.encryptedPassword=securePassword(plainPassword);
	}
	private String securePassword(String plainPassword){
		return "SECURE"+plainPassword+key;
	}
	public Boolean validateUser(String plainPassword){
		return this.encryptedPassword.equals(securePassword(plainPassword));
	}


}
class Bookings
{
    
        public String bookings_id;
        public Date date;
        public String source;
        public String destination;
        public String status;
    
    public void newBookings(String bookings_id,Date date,String source,String description)
    {
    this.bookings_id=bookings_id;
    this.date=date;
    this.source=source;
    this.destination=destination;
    }
    public void getId(String bookings_id)
    {
     this.bookings_id=bookings_id;
    }
    public void cancelBookings(String bookings_id)
    {
        this.bookings_id=bookings_id;
        this.date=date;
    }
    public void bookingStatus(String status)
    {
        this.status=status;
    }
    public void verifyBookings(String bookings_id,Date date,String source,String description)
    {
        this.bookings_id=bookings_id;
        this.date=date;
        this.source=source;
        this.destination=destination;
    }
}
class Hotel
{
       public int hotel_id;
       public String hotel_name;
       public String place;
       public String type;
       
    public void get_hotel(int hotel_id,String hotel_name,String place,String type)
    {
       this.hotel_id=hotel_id;
       this.hotel_name=hotel_name;
       this.place=place;
       this.type=type; 
    }
    public void changeHotelid(String hotel_id)
    {
        this.hotel_id=hotel_id;
    }
    public void advance_booking(int hotel_id,String hotel_name,String place,String type)
    {
        this.hotel_id=hotel_id;
        this.hotel_name=hotel_name;
        this.place=place;
        this.type=type;
    }
    public void changeType(String type)
    {
        this.type=type;
    }

}

class Transport
{
    public int T_id;
    public String mode;
    public String source;
    public String destination ;
    public Date date;
    public String venue;
    public String status;

    public void changeVenue(String venue)
    {
      this.venue=venue; 
    }
    public void report(int T_id,String mode,String source,String destination,Date date)
    {
      this.T_id=T_id;
      this.mode=mode;
      this.source=source;
      this.destination=destination;
      this.date=date;
    }
    public void status(String status)
    {
        this.status=status;
    }
}

class Place
{
    public String name;
    public String reviews;
    public String description;
    public String total_places;
    public int charges;

    public void totalPlaces(String total_places)
    {
       this.total_places=total_places; 
    }
    public void reviewReport(String reviews)
    {
      this.reviews=reviews;
    }
    public void visitingCharges(int charges)
    {
      this.charges=charges;
    }
}
class Guide extends Place
{
        public int g_id;
        public String Name;
        public String gender;
        public Long Phone_no;
        public String email;
        public String place;
        public String description;
        public float fee;
        public String guidelist;

    public void newGuide(int g_id,String Name,String gender,Long Phone_no,String email,String place,String description)
    {
       this.g_id=g_id;
       this.Name=Name;
       this.gender=gender;
       this.Phone_no=Phone_no;
       this.email=email;
       this.place=place;
       this.description=description;
    }
     public void changeGuide(int g_id,String Name)
    {
      this.g_id=g_id;
      this.Name=Name;
    }
    public void guideFee(float fee)
    {
      this.fee=fee;
    }
    public void guideList(String Name,String guidelist)
    {
      this.Name=Name;
      this.guidelist=guidelist;
    }
}


class EmployeeDetails
{
        public String name ;
        public String type ;
        public Long phone ;
        public String gender ;
        public int emp_id ;
        public int experience ;
        public int age;
        public Boolean status;//if he is working
        public String achievements;
        public Date date;
        public String promote;
        public String performance;


    public void get_employee(String name,String type,Long phone,String gender,int emp_id,int experience,int age,Boolean status,String achievements,Date date)
    {
        this.name=name;
        this.type=type;
        this.phone=phone;
        this.gender=gender;
        this.emp_id=emp_id;
        this.experience=experience;
        this.age=age;
        this.status=status;
        this.achievements=achievements;
        this.date=date;
    }
    public void promote(String promote)
    {
      this.promote=promote;
    }
    public void bestEmployee(String performance)
    {
       this.performance=performance;
    }
    public void workingStatus(Boolean status)
    {
       this.status=status;
    }
    public void cancelEmployee(int emp_id)
    {
      this.emp_id=emp_id;
    }
}


class Payments extends Bookings
{
        public int payment_id;
        public String customer_name;
        public String mode;
        public Date date;
        public Time time;
        public float total;


    public void newPayment(int payment_id,String customer_name,String mode,Date date,Time time)
    {
        this.payment_id=payment_id;
        this.customer_name=customer_name;
        this.mode=mode;
        this.date=date;
        this.time=time;
    }
    public void changeMode(String mode)
    {
      this.mode=mode;
    
    }
    public void totalAmount(float total)
    {
       this.total=total;
    }
    public void cancelPayment(int payment_id)
    {
       this.payment_id=payment_id;
    }

    
}
public class TourismManagement
{
    static class console{
        static{
            console.print("this is a ststic block");
        }
        //ststic variable
        static String name;
        //ststic method
        staticvoid print(String text){
            sysytem.out.println(text);
        }
        //overloading of ststic methods
        ststic void print(){
            System.out.println(name);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Lab4");

		// static variable
		//static class
		Console.print("Ststic user variable key:-----"+User.key);
		TourismManagement.Console.name="Trishna";
        // static function
		Table.setReserved(true);
		Table table = new Table();
		table.setId(21);
		table.setCapacity(6);


	
		System.out.println("Table "+table.getId()+"   "+table.isReserved());


		System.out.println("Lab 2 & 3");
		// initialize object
		User user1 = new User(1,"Trishna",987654,"trishnasirvi123@gmail.com","PASSWORD");
		System.out.println("Check Password:- "+user1.validateUser("PASSWORD"));

		//reference variable
		//shallow copy
		User user2 = user1;
		System.out.println("Check Password:- "+user1.validateUser("PASSWORD"));


		// static methods
		TourismManagement.Console.print();
		// overriding
		TourismManagement.Console.print("Hiii");
        Customer c=new Customer();
        c.name= "nikit";
        Customer c1=c;
        int cus_id;
        int a=5; 
        Customer c3=new Customer();
        c3.newCustomers("nikit");
        Bookings B=new Bookings();
        Hotel H=new Hotel();
        Transport T=new Transport();
        Employee_details E=new Employee_details();
        Place P=new Place();
        Payments Pay=new Payments();
        Guide G=new Guide();
    }
}