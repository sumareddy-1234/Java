import java.util.*;
class Binary{
public static void main(String agrs[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int key = sc.nextInt();
int lw=0,up=n-1;
int mid;
boolean f=false;
while(lw<up){
mid=(lw+up)/2;
if(arr[mid]==key){
System.out.print("element found at index"+mid);
f=true;
break;
}
else if(arr[mid]<key){
lw=mid+1;
}
else{
up=mid-1;
}
}
if(f==false){
System.out.print("Not found");
}
}
}
