package model;

public class Bill {
	private int billid;
    private String customer;
    private String date;
    private String medicine;
    private double qty;
    private double totalprice;
    private String qty1;
    private String totalPrice1;
    

    public int getBillid() {
        return billid;
    }

    public void setBillid(int billid) {
        this.billid= billid;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine= medicine;
    }
    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty= qty;
    }
    public double getTotalPrice() {
        return totalprice;
    }

    public void setTotalPrice(double totalprice) {
        this.totalprice= totalprice;
    }
   
    public String getCustomer() {
        return customer;
    }
    
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }



    public Bill() {}
    public Bill(String customer, String date, String totalPrice1, String qty1) {
    	 this.customer=customer;
         this.date=date;
         this.totalPrice1=totalPrice1;
         this.qty1=qty1;
    }

    public Bill(int billid, String customer,String date,double totalprice,double qty,String medicine){
        this.billid=billid;
        this.customer=customer;
        this.date=date;
        this.totalprice=totalprice;
        this.qty=qty;
        this.medicine=medicine;
         
    }
    public Bill(String customer,String date,double totalprice,double qty,String medicine){
        this.customer=customer;
        this.date=date;
        this.totalprice=totalprice;
        this.qty=qty;
        this.medicine=medicine;
         
    }
    public Bill(String customer,String date,double qty,String medicine){
        this.customer=customer;
        this.date=date;
        this.qty=qty;
        this.medicine=medicine;
         
    }


  

}
