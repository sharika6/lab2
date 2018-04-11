public class Date{

	int dd;
	int mm;
	int yyyy;

public Date(){
	int dd=0;
	int mm=0;
	int yyyy=0;
}
   public  Date(int dd, int mm, int yyyy) {
	   this.dd=dd;
	   this.mm=mm;
	   this.yyyy=yyyy;
   }
   public String getFormattedDate(){
	   String formattedDate = dd +"/" +mm + "/" +yyyy;
	   return formattedDate;
      
   }
   public String tostring(){
	   return getFormattedDate();
   
   }
}
