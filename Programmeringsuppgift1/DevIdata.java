package Programmeringsuppgift1;

/*
 * Class representing the development department, specifying work type.
 */
public class DevIdata extends BaseIdata {
    @Override
    public MainWork getMainWork() {
        return MainWork.Digital;
    }
    @Override
    public String GetDepartment() {
        return "Development";
    }
}