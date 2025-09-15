class ScopeOfVariables
{
int InstanceVar;
public static void main(String args[])
{
ScopeOfVariables obj1=new ScopeOfVariables();
ScopeOfVariables obj2=new ScopeOfVariables();
obj1.InstanceVar=100;
obj2.InstanceVar=54;
System.out.println("The variable value from object 1: "+obj1.InstanceVar);
System.out.println("The variable value from object 2: "+obj2.InstanceVar);
}
}
