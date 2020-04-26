package udemy.example_39_junit_part1;

import org.junit.Test;
import udemy.example_39_junit_part1.NetworkUtils;

public class NetworkUtilsTest {
    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanOneSecond() {
        NetworkUtils.getConnection();
    }
}
