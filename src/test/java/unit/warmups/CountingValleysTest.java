package unit.warmups;


import org.junit.*;

import warmups.CountingValleys;

import static org.assertj.core.api.Assertions.*;


public class CountingValleysTest {
  @Test public void count() {
    assertThat(new CountingValleys().count(2, "DU")).isEqualTo(1);
    assertThat(new CountingValleys().count(12, "DDUUUDDDDUUU")).isEqualTo(2);
    assertThat(new CountingValleys().count(8, "UDDDUDUU")).isEqualTo(1);
    assertThat(new CountingValleys().count(12, "DDUUDDUDUUUD")).isEqualTo(2);
    assertThat(new CountingValleys().count(100, "DUDUUUUUUUUDUDDUUDUUDDDUUDDDDDUUDUUUUDDDUUUUUUUDDUDUDUUUDDDDUUDDDUDDDDUUDDUDDUUUDUUUDUUDUDUDDDDDDDDD")).isEqualTo(2);
  }
}
