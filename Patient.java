package info;


//public enum BedType {ECONOMICAL , SPECIAL, EXECUTIVE}


public class Patient{
 
  
private int patientId;
    private String patientName;
    private BedType bedType;
    private int noOfDays;


 public Patient(int patientId, String patientName, BedType economical, int noOfDays) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.bedType = economical;
        this.noOfDays = noOfDays;
 }      


    


public int getPatientId(){
return patientId;
}
public String getpatientName(){
return patientName;
}
public BedType getBedType(){
return bedType;
}
public int getnoOfDays(){
return noOfDays;
}

public double getPricePerDay() {
    switch (bedType) {
        case ECONOMICAL:
            return 500;
        case SPECIAL:
            return 350;
        case EXECUTIVE:
            return 200;
        default:
            return 0; 
    }
}


public double getBillAmount(){
 return noOfDays * getPricePerDay();
 }


}



