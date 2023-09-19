import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColaGenericaTest {
    @Test
    public void TestFilter() {
        ColaGenerica<Integer> cola = new ColaGenerica<>();
        for (int i = 0; i < 5; i++) {
            cola.add(i);
        }
        assertEquals("[4]", cola.filter(s -> s > 3).toString());
    }

    @Test
    public void TestMap() {
        ColaGenerica<Integer> cola = new ColaGenerica<>();
        for (int i = 0; i < 5; i++) {
            cola.add(i);
        }
        assertEquals("[0, 2, 4, 6, 8]", cola.map(s -> s * 2).toString());
    }

    @Test
    public void TestFind() {
        ColaGenerica<Integer> cola = new ColaGenerica<>();
        for (int i = 0; i < 5; i++) {
            cola.add(i);
        }
        assertEquals(3, cola.find(s -> s == 3));
    }

    @Test
    public void TestFindIndex() {
        ColaGenerica<Integer> cola = new ColaGenerica<>();
        for (int i = 0; i < 5; i++) {
            cola.add(i);
        }
        assertEquals(2, cola.findIndex(s -> s == 2));
    }

    @Test
    public void TestFindLast() {
        ColaGenerica<Integer> cola = new ColaGenerica<>();
        for (int i = 0; i < 5; i++) {
            cola.add(i);
        }
        assertEquals(4, cola.findLast(s -> s == 4));
    }

    @Test
    public void TestFindLastIndex() {
        ColaGenerica<Integer> cola = new ColaGenerica<>();
        for (int i = 0; i < 5; i++) {
            cola.add(i * 2);
        }
        assertEquals(2, cola.findLastIndex(s -> s == 4));
    }

    @Test
    public void TestForEach() {
        ColaGenerica<Integer> cola = new ColaGenerica<>();
        for (int i = 0; i < 5; i++) {
            cola.add(i * 2);
        }
        List<Integer> cola2 = new ArrayList<>();
        cola.forEach(s -> {
            cola2.add(s);
            return null;
        });
        assertAll(
                () -> assertEquals(0, cola2.get(0)),
                () -> assertEquals(2, cola2.get(1)),
                () -> assertEquals(4, cola2.get(2)),
                () -> assertEquals(6, cola2.get(3)),
                () -> assertEquals(8, cola2.get(4))
        );
    }
}
