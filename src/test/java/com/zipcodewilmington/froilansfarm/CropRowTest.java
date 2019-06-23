package com.zipcodewilmington.froilansfarm;



import com.zipcodewilmington.froilansfarm.FieldRelated.CornStalk;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropRowTest {
    CropRow cropRow1 = new CropRow();

    @Before

    public void setUp() throws Exception {
        cropRow1.add(new CornStalk());



    }

    @Test
    public void add() {
        cropRow1.add(new CornStalk());
        cropRow1.add(new CornStalk());
        cropRow1.add(new CornStalk());
        cropRow1.add(new CornStalk());
        Integer actual = cropRow1.count();
        Integer expected = 5;
        Assert.assertEquals(expected, actual);



    }

    @Test
    public void getCropRow() {


       Integer actual = cropRow1.getCropRow().size();;
        Integer expected = 1;
       Assert.assertEquals(expected, actual);
    }

    @Test
    public void count() {
        Integer actual = cropRow1.count();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fertilize() {
        cropRow1.fertilize();

        Boolean actual = cropRow1.getHasBeenFertilized();
        Boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        cropRow1.remove();
        Integer actual = cropRow1.count();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);

    }
}