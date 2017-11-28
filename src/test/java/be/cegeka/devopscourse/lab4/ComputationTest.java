package be.cegeka.devopscourse.lab4;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;

public class ComputationTest {

    @Test
    public void plusInputOneAndTwoReturnsThree() throws Exception {
        assertThat(new Computation().plus(2, 2)).isEqualTo(4);
    }

}