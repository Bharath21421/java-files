class Author
  {
    String authorname;
	int age;
	String place;
	  Author(String name , int age , String place)
	   {
	     this.authorname= name;
		 this.age= age;
		 this.place=place;
		 }
		 }
		 
class Publisher
    {
       String name;
        int id;
       String city;
          Publisher(String na , int id , String city)
     {
         this.name= na;
         this.id= id;
          this.city= city;
          }
          }
class Book
   {
       String name;
        int price;
        Publisher publisher;
        Author author;
         Book(String n , int p , Publisher publisher , Author author)
        {
          this.name= n;
          this.price= p;
          this.publisher= publisher;
          this.author= author;
         }
         

public static void main(String args[])
    {
       Author author = new Author("Bharath" , 20 , "Kadapa");
       Publisher publisher= new Publisher("Bharath publishers" , 21421 , "chennai");
       Book b=new Book("Java" , 200 , publisher , author);
	    System.out.println("Book name: " + b.name);
        System.out.println("Book price: " + b.price);
		System.out.println("-------------Publisher details------------");
		System.out.println("Publisher name: " + b.publisher.name);
	    System.out.println("Publisher id: " + b.publisher.id);
	    System.out.println("Publisher place: " + b.publisher.city);
	    System.out.println("--------------Author details-------------");
	    System.out.println("Author name: " + b.author.authorname);
		System.out.println("Author age: " + b.author.age);
		System.out.println("Author place: " + b.author.place);
	}
   }








      














	  