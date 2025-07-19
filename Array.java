class Array{
public static void main(String args[]){
int ans=0;
int a[]={1,3,4,5,6,7,8,9,};
for(int i=0;i<a.length;i++){
if(a[i]>ans){
ans=a[i];
}
}
System.out.println(ans);
}}