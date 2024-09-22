
public class Volcano {
	 private String name ;
	 private int[]degrees ;
	 private int count; 
	  
	 public Volcano (String name, int size){
		  this.name=name;
		  degress=new int[size];
		  this.count=0; 
	 }
	 public Volcano (Volcano v){
		  this.name=v.name;
		  this.degress=new int[v.degrees.length];
		  for (int i=0; i<v.count;i++) {
			  degress[i]=v.degrees[i];
		  }
		  this.count=v.count; 
	 }
	 
	 public int getCount(){
		 return count;
	 }
	 
	 public String getName(){
		 return name;
	 }
	 
	 public int[] getDegress(){
		 return degrees;
	 }
	 public boolean add(int d){
		 if (this.count<this.degrees.length){
			 degress[count+1]+=d;
			 count++;
			 return true;
		 }
		 return false;
	 }
	 public void delete (int o){
		 for (int i = o;i<degrees.length;i++) {
			 if (i!=degrees.length) {
				 degrees[i]=degrees[i+1];
			 }else {
				 degrees[i]=0;
			 }
		 }
	 }
	 public void deleteall (){
		 for (int i = 0;i<degrees.length;i++) {
				 degrees[i]=0;
		 }
		 count=0;
	 }
	 public void fix (int index ,int temp){
		 degrees[index]=temp;
		 count=0;
	 }
	 public double average(){
		 int sum=0
		 for (int i = 0;i<count;i++) {
			 sum+=i
		}
		return sum/count;
	 }
	 public int maxUnder (int x){
		 int max=-10000;
		 for (int i = 0;i<count;i++) {
			 if (i>max && i<x)
				max = i;
		}
		 return max;
	 }
	 public void print (){
		 for (int i = 0;i<count;i++) {
			 System.out.println(degrees[i]);
		}
	 }
	 public String toString(){
	       return "NAME: "+name+" COUNT: "+count;
	 }
	 
	 
	 
}
