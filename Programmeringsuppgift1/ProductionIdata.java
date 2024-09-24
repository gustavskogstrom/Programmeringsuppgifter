package Programmeringsuppgift1;

/*
 * Class representing the production department, specifying work type.
 */
public class ProductionIdata extends BaseIdata {
    @Override
    public MainWork getMainWork(){
        return MainWork.Paper;
    }

    @Override
    public String GetDepartment(){
        return("Production");
    }
    
}