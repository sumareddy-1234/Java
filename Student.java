class Details{
String name;
int rollno;
String branch;
char gender;
double cgpa;
void get(){
name = "Suma Satti";
rollno = 4454;
branch = "Data Science";
 gender = 'f';
cgpa = 8.36;
}
void display(){
System.out.println("Student name :"+name);
System.out.println("Roll number:"+rollno);
System.out.println("Branch:"+branch);
System.out.println("Gender:"+gender);
System.out.println("CGPA:"+cgpa);
}
}
class Student{
public static void main(String args[]){
Details det = new Details();
det.get();
det.display();
}
}