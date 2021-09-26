package at.htl.eventmanager.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HostTest {

    @Test
    void toStringTest() {
        final Host host = new Host("Herr Huber", 2222222, 1);
        //System.out.print(host.toString());
        assertThat(host.toString()).isEqualTo("Host{name='Herr Huber', ssn=2222222, id=1}");
    }
}