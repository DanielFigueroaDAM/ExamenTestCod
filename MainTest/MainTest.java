import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    @DisplayName("Test para comprobar si es correcta la letra del DNI")
    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "53818040, H",
            "00000000, T",
            "99999999, R",
            "00000001, R",
            "12345678, Z",
            "53818040, H",
            "00000000, T",
            "99999999, R",
            "00000001, R",
            "00000002, W",
            "00000003, A",
            "00000004, G",
            "00000005, M",
            "00000006, Y",
            "00000007, F",
            "00000008, P",
            "00000009, D",
            "00000010, X",
            "00000011, B",
            "00000012, N",
            "00000013, J",
            "00000014, Z",
            "00000015, Q",// aquí está el error
            "00000016, S", // aquí está el error
            "00000017, V",
            "00000018, H",
            "00000019, L",
            "00000020, C",
            "00000021, K",
            "00000022, E"


    })
    void calcularLetraDNI(String dni, char letra) {
        assertEquals(letra, Main.calcularLetraDNI(dni));
    }
    @DisplayName("Test donde se comparan las letras")
    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "53818040, H",
            "00000000, T",
            "99999999, R",
            "00000001, R",
            "12345678, Z",
            "53818040, H",
            "00000000, T",
            "99999999, R",
            "00000001, R",
            "00000002, W",
            "00000003, A",
            "00000004, G",
            "00000005, M",
            "00000006, Y",
            "00000007, F",
            "00000008, P",
            "00000009, D",
            "00000010, X",
            "00000011, B",
            "00000012, N",
            "00000013, J",
            "00000014, Z",
            "00000015, Q", //aquí está el error
            "00000016, S", // aquí está el error
            "00000017, V",
            "00000018, H",
            "00000019, L",
            "00000020, C",
            "00000021, K",
            "00000022, E"


    })
    void comrpobacionDNi(String dni, char letra) {
        assertTrue(Main.comprobarDNI(dni, letra));
    }
    @DisplayName("Test donde se comparan las letras ahora con false")
    @ParameterizedTest
    @CsvSource({
            "12345678, J",
            "53818040, R",
            "00000000, P",


    })
    void comrpobacionDNiF(String dni, char letra) {
        assertFalse(Main.comprobarDNI(dni, letra));
    }


}