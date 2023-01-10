package model;

public class AddMedicine {
	private int medicineid;
    private String name;
    private String cost;
    

    public int getMedicineid() {
        return medicineid;
    }

    public void setMedicineid(int medicineid) {
        this.medicineid = medicineid;
    }


    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }


    public void setCost(String cost) {
        this.cost = cost;
    }



    
    public AddMedicine() {}

    public AddMedicine(int medicineid, String name,String cost){
        this.medicineid=medicineid;
        this.name=name;
        this.cost=cost;
         
    }

    public AddMedicine(String name,String cost){
        this.name=name;
        this.cost=cost;          
    }

  

}
