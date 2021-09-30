package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreePointThirteenTest {
    @Test
    public void createEmployee(){
        ThreePointThirteen employee1 = new ThreePointThirteen("", "",  700000);
        employee1.yearlySalary(8400000);
        employee1.getYearlySalary();
        assertEquals(8400000, employee1.getYearlySalary());
        ThreePointThirteen employee2 = new ThreePointThirteen("", "", 500000);
        employee2.yearlySalary(6000000);
        employee2.getYearlySalary();
        assertEquals(6000000, employee2.getYearlySalary());

    }
    @Test
    public void salaryIncrement(){
        ThreePointThirteen employee1 = new ThreePointThirteen("","", 700000);
        employee1.newYearlySalary(84000000);
        employee1.getYearlySalary();
        assertEquals(84000000, employee1.getYearlySalary());
        ThreePointThirteen employee2 = new ThreePointThirteen("", "", 500000);
        employee2.newYearlySalary(60000000);
        employee2.getYearlySalary();
        assertEquals(60000000, employee2.getYearlySalary());

    }

}