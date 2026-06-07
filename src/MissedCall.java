import java.util.*;
import java.time.LocalTime;

public class MissedCall {
    LocalTime time;
    String name;
    long number;

    MissedCall(LocalTime t, String n, long num) {
        time = t;
        name = n;
        number = num;
    }

    public String toString() {
        return "Name : " + name + " Number : " + number + " Time : " + time;
    }
}
