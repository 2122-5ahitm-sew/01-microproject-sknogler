package at.htl.eventmanager.entity;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EventTest {

    @Test
    void toStringTest() {
        final Event event = new Event("KonzertXY", "22.August.2021", 1);
        assertThat(event.toString()).isEqualTo("Event{name='KonzertXY', date='22.August.2021', id=1}");
    }
}
