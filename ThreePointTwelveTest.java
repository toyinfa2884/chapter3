package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreePointTwelveTest {
    @Test
    public void getInvoiceAmount(){
        ThreePointTwelve invoice = new ThreePointTwelve("Part number", "Part description", 20, 500);
        invoice.amount(10000);
        invoice.getAmount();
         assertEquals(10000, invoice.getAmount());


    }

}