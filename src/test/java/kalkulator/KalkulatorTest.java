package kalkulator;

import kalkulator.makro.Bialko;
import kalkulator.makro.Tluszcz;
import kalkulator.makro.Wegle;
import kalkulator.makro.Zapotrzebowanie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class KalkulatorTest {

    @Test
    public void shouldReturnCorrectZapotrzebowanie() {
        // arrange
        Kalkulator kalkulator = new Kalkulator(80, 3000,
                new BialeczkoCounter(), new TluszczeCounter(), new WegleCounter());

        // act
        Zapotrzebowanie zapotrzebowanie = kalkulator.count();

        // assert
        assertEquals(new Zapotrzebowanie.ZapotrzebowanieBuilder()
                .setBialko(new Bialko(80))
                .setTluszcz(new Tluszcz(1600))
                .setWegle(new Wegle(100))
                .build(), zapotrzebowanie);

    }

}