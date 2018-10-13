package entity;

public class Performance {
   private String id;
   private String account;
   private String performance;
   private String object;
   private String date;
   
   public Performance() {
   }
   
   public void setId(String id) {
	   this.id=id;
   }
   
   public void setAccount(String account) {
	   this.account=account;
   }
   
   public void setPerformance(String performance) {
	   this.performance=performance;
   }
   
   public void setObject(String object) {
	   this.object=object;
   }
   
   public void setDate(String date) {
	   this.date=date;
   }
   
   public String getId() {
	   return id;
   }
   
   public String getAccount() {
	   return account;
   }
   
   public String getPerformance() {
	   return performance;
   }
   
   public String getObject() {
	   return object;
   }
   
   public String getDate() {
	   return date;
   }
}
