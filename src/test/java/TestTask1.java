import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTask1 {

    @Test
    public void testFirstElementIsGreater() {
        int result = Task1.findMaxElement(10, 5);
        Assert.assertEquals(result, 10, String.format("Ожидалось, что %d будет максимальным", 10));
    }

    @Test
    public void testSecondElementIsGreater() {
        int result = Task1.findMaxElement(3, 7);
        Assert.assertEquals(result, 7, String.format("Ожидалось, что %d будет максимальным", 7));
    }

    @Test
    public void testElementsAreEqual() {
        int result = Task1.findMaxElement(8, 8);
        Assert.assertEquals(result, 8, String.format("Ожидалось, что %d будет максимальным, так как оба элемента равны", 8));
    }

    @Test
    public void testNegativeNumbers() {
        int result = Task1.findMaxElement(-3, -7);
        Assert.assertEquals(result, -3, String.format("Ожидалось, что %d будет максимальным среди отрицательных чисел", -3));
    }

    @Test
    public void testZeroAndPositiveNumber() {
        int result = Task1.findMaxElement(0, 5);
        Assert.assertEquals(result, 5, String.format("Ожидалось, что %d будет максимальным", 5));
    }

    @Test
    public void testZeroAndNegativeNumber() {
        int result = Task1.findMaxElement(0, -5);
        Assert.assertEquals(result, 0, String.format("Ожидалось, что %d будет максимальным", 0));
    }

    @Test
    public void testFirstFromThreeElementIsGreater() {
        int result = Task1.findMaxElement(10, 5, 3);
        Assert.assertEquals(result, 10, String.format("Ожидалось, что %d будет максимальным", 10));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNoElements() {
        Task1.findMaxElement();
    }

}
