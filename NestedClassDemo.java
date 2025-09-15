  class University
  {
    private String name;
    private String location;
    University(String name,String location)
    {
        this.name=name;
        this.location=location;
    }
    class Department
    {
        private String depName;
        private int noOfCourses;
        Department(String depName,int noOfCourses)
        {
            this.depName=depName;
            this.noOfCourses=noOfCourses;
        }
        public String getDepName()
        {
            return depName;
        }
        public void setDepName(String depName)
        {
            this.depName=depName;
        }
        public int getNoOfCourses()
        {
            return noOfCourses;
        }
        public void setNoOfCourses(int noOfCourses)
        {
            this.noOfCourses=noOfCourses;
        }
        public void displayDepInfo()
        {
            System.out.println("Department name:"+depName);
            System.out.println("Number Of Courses:"+noOfCourses);
        }
    }
    public void displayUniversityInfo()
    {
        System.out.println("Name of the University:"+name);
        System.out.println("Location:"+location);
    }
  }
  class NestedClassDemo{
    public static void main(String args[])
    {
        University u=new University("Aditya","Surampalem");
        University.Department dep=u.new Department("CSE",12);
        u.displayUniversityInfo();
        System.out.println("-----------------------");
        dep.displayDepInfo();
        dep.setDepName("AIML");
        System.out.println("After Updation");
        dep.displayDepInfo();
    }
  }
