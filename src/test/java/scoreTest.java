import org.junit.Assert;
import org.junit.Test;


public class scoreTest {

    @Test
    public void calculateScore() {
        score score = new score();
        int result  = score.calculateScore("Cabbage");
        Assert.assertEquals(14, result);
    }
    @Test
    public void calculateScore2() {
        score score = new score();
        int result  = score.calculateScore("Creamy");
        Assert.assertEquals(13, result);
    }
    @Test
    public void calculateScore3() {
        score score = new score();
        int result  = score.calculateScore("Impedimenta");
        Assert.assertEquals(18, result);
    }
    @Test
    public void calculateScore4() {
        score score = new score();
        int result  = score.calculateScore("The");
        Assert.assertEquals(6, result);
    }
    @Test
    public void calculateScore5() {
        score score = new score();
        int result  = score.calculateScore("A");
        Assert.assertEquals(1, result);
    }
    @Test
    public void calculateScore6() {
        score score = new score();
        int result  = score.calculateScore("A$AP");
        Assert.assertEquals(5, result);
    }
    @Test
    public void calculateScore7() {
        score score = new score();
        int result  = score.calculateScore("helloworld");
        Assert.assertEquals(17, result);
    }
}