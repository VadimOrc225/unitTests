package seminars.finish;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class FinalFileTest {
FinalFile finalFile = new FinalFile();
    @Test
    void evaluatesExpression() {
        ArrayList<Integer> mockArr1 = new ArrayList<>(); // подготовка данных
        mockArr1.add(1);
        mockArr1.add(2);
        ArrayList<Integer> mockArr2 = new ArrayList<>();
        mockArr2.add(3);
        mockArr2.add(4);
        double x1 = (double)(1+2)/2;
        double x2 = (double)(3+4)/2;

        assertThat(finalFile.averNumber(mockArr1)).isEqualTo(x1);// блок ассертинга
        assertThat(finalFile.averNumber(mockArr2)).isEqualTo(x2);

        assertEquals("Второй список имеет большее среднее значение", finalFile.printer(1,2));
        assertEquals("Первый список имеет большее среднее значение", finalFile.printer(3,2));
        assertEquals("Средние значения равны", finalFile.printer(3,3));
    }

}
