package be.cegeka.devopscourse.lab4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ComputationIntegrationTest {

    @Test
    public void plusInputOneAndTwoReturnsThree() throws Exception {
        assertThat(new Computation().plus(2, 2)).isEqualTo(4);
    }

}