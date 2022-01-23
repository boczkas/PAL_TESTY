package kalkulator;

import kalkulator.makro.Bialko;
import kalkulator.makro.Tluszcz;
import kalkulator.makro.Wegle;
import kalkulator.makro.Zapotrzebowanie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class KalkulatorMockTest {

    @Mock
    BialeczkoCounter bialeczkoCounter;

    @Mock
    WegleCounter wegleCounter;

    @Mock
    TluszczeCounter tluszczeCounter;

    @Captor
    private ArgumentCaptor<Integer> argumentCaptor;

    @Test
    public void shouldReturnCorrectZapotrzebowanie() {
        // arrange
        when(bialeczkoCounter.count(anyInt())).thenReturn(new Bialko(5));
        when(tluszczeCounter.count(anyInt())).thenReturn(new Tluszcz(1600));
        when(wegleCounter.count(anyInt())).thenReturn(new Wegle(100));
//        when(wegleCounter.count(argumentCaptor.capture())).thenReturn(new Wegle(100));
        Kalkulator kalkulator = new Kalkulator(80, 3000,
                bialeczkoCounter, tluszczeCounter, wegleCounter);

        // act
        Zapotrzebowanie zapotrzebowanie = kalkulator.count();

        // assert
        assertEquals(2645, argumentCaptor.getValue());
        assertEquals(new Zapotrzebowanie.ZapotrzebowanieBuilder()
                .setBialko(new Bialko(80))
                .setTluszcz(new Tluszcz(1600))
                .setWegle(new Wegle(100))
                .build(), zapotrzebowanie);
    }

//    Dodać before na bialeczkoCountera
//    Jest Was 3, Ania - BialeczkoCounter testy, Michal - TluszczeCounter test, Daniel - WegleCounter testy
}
