import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringBuilderAndStringTest {

    StringBuilder sb = new StringBuilder();

    String example = "2007000100000000";

    Runtime runtime = Runtime.getRuntime();

    long minFreeMemoryString = 999999999;

    long minFreeMemorySB = 999999999;


    @Test
    public void freeJvmMemoryShouldBeBiggerWhenUsingStringBuilder(){

        for(int i = 0; i < 15; i++) {
            example += example;
            long currentFreeMemory = runtime.freeMemory();
            if(currentFreeMemory < minFreeMemoryString) {
                minFreeMemoryString = currentFreeMemory;
            }
        }
        sb.append("2007000100000000");
        for(int i = 0; i < 15; i++) {
            sb.append("2007000100000000");
            long currentFreeMemory = runtime.freeMemory();
            if(currentFreeMemory < minFreeMemorySB) {
                minFreeMemorySB = currentFreeMemory;
            }
        }
        Assertions.assertTrue(minFreeMemorySB > minFreeMemoryString);
    }
}
