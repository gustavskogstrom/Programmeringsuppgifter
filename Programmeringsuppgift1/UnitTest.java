package Programmeringsuppgift1;

/*
 * Verify the functionality of ProductionIdata and DevIdata.
 */
public class UnitTest {
    public static void runTest() {
        ProductionIdata production = new ProductionIdata();
        DevIdata dev = new DevIdata();

        // Testing ProductionIdata
        if (production.getMainWork() != MainWork.Paper) {
            throw new RuntimeException("Test failed: ProductionIdata.getMainWork() should return MainWork.Paper");
        }
        if (!production.GetDepartment().equals("Production")) {
            throw new RuntimeException("Test failed: ProductionIdata.GetDepartment() should return 'Production'");
        }

        // Testing DevIdata
        if (dev.getMainWork() != MainWork.Digital) {
            throw new RuntimeException("Test failed: DevIdata.getMainWork() should return MainWork.Digital");
        }
        if (!dev.GetDepartment().equals("Development")) {
            throw new RuntimeException("Test failed: DevIdata.GetDepartment() should return 'Development'");
        }

        // If all the tests are valid return this message
        System.out.println("All tests passed successfully!");
    }
}
