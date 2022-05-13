package pl.vistula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplecalculaterTest {

    @Test
    void add() {
        Calculator calculator=new Simplecalculater();
        double result= calculator.add( 1,2);
        assertTrue(result==3);
    }

    @Test
    void sub() {
        Calculator calculator=new Simplecalculater();
        double result= calculator.sub( 2,1);
        assertTrue(result==1);
    }

    @Test
    void mul() {
        Calculator calculator=new Simplecalculater();
        double result= calculator.mul( 2,1);
        assertTrue(result==2);
    }

    @Test
    void div() {
        Calculator calculator=new Simplecalculater();
        double result= calculator.div( 2,1);
        assertTrue(result==2);
    }
}
