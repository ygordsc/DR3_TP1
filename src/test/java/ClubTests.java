import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClubTests {

    @Test
    public void test1() {

        Club a = new Club();
        a.setNome("Comercial");
        a.setCores("Alvirrubro");
        a.setTorcida(-5);
        a.setRenda(0);
        Assertions.assertEquals(0, a.getTorcida());

    }

    @Test
    public void test2() {

        Club b = new Club();
        b.setNome("Operário");
        b.setCores("Alvinegro");
        b.setTorcida(20000);
        b.setRenda(50000);
        Assertions.assertEquals(600000, b.rendaAnual());

    }

}
