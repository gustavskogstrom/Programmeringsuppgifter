package Programmeringsuppgift1;

/*
 * Main class to demonstrate the usage of ProductionIData and DevIData.
 */
public class Main {
    public static void main(String[] args) {
    IIdata production = new ProductionIdata();
    IIdata dev = new DevIdata();
    // Testar ProductionIdata
    System.out.println("ProductionIdata - Main Work: " + production.getMainWork());
    System.out.println("ProductionIdata - Department: " + production.GetDepartment());
    // Testar DevIdata
    System.out.println("DevIdata - Main Work: " + dev.getMainWork());
    System.out.println("DevIdata - Department: " + dev.GetDepartment());
    }
}
