package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreePointFourteenTest  {
    @Test
    public void displayDate(){
        ThreePointFourteen date = new ThreePointFourteen(9, 25, 2021);
        date.todayDate("9/25/2021");
        date.getDate();
        assertEquals("9/25/2021", date.getDate());

    }

}