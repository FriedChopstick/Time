//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TimeRunner {
    public static void main(String[] args) {
        Time time1 = new Time(8, 9, 58); // New Time object starting at time 08:09:58
        System.out.println("Expected result: 08:09:58");
        System.out.println("Actual result " + time1);
        System.out.println();
        time1.tick();
        System.out.println("Expected result: 08:09:59");
        System.out.println("Actual result " + time1);
        System.out.println();
        time1.tick();
        System.out.println("Expected result: 08:10:00");
        System.out.println("Actual result " + time1);
        System.out.println();
        time1.tick();
        System.out.println("Expected result: 08:10:01");
        System.out.println("Actual result " + time1);
        System.out.println();
        time1.tick();
        System.out.println("Expected result: 08:10:02");
        System.out.println("Actual result " + time1);
        System.out.println();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        System.out.println("Expected result: 08:10:10");
        System.out.println("Actual result " + time1);
        System.out.println();
        Time time2 = new Time(15, 59, 58);
        System.out.println("Expected result: 15:59:58");
        System.out.println("Actual result " + time2);
        System.out.println();
        time2.tick();
        System.out.println("Expected result: 15:59:59");
        System.out.println("Actual result " + time2);
        System.out.println();
        time2.tick();
        System.out.println("Expected result: 16:00:00");
        System.out.println("Actual result " + time2);
        System.out.println();
        time2.tick();
        System.out.println("Expected result: 16:00:01");
        System.out.println("Actual result " + time2);
        System.out.println();
        Time time3 = new Time(23, 59, 58);
        System.out.println("Expected result: 23:59:58");
        System.out.println("Actual result " + time3);
        System.out.println();
        time3.tick();
        System.out.println("Expected result: 23:59:59");
        System.out.println("Actual result " + time3);
        System.out.println();
        time3.tick();
        System.out.println("Expected result: 00:00:00");
        System.out.println("Actual result " + time3);
        System.out.println();
        time3.tick();
        System.out.println("Expected result: 00:00:01");
        System.out.println("Actual result " + time3);
        System.out.println();
        Time time4 = new Time(10, 14, 43);
        System.out.println("Expected result: 10:14:43");
        System.out.println("Actual result " + time4);
        System.out.println();
        Time time5 = new Time(8, 30, 29);
        time4.add(time5);
        System.out.println("Expected result: 18:45:12");
        System.out.println("Actual result " + time4);
        System.out.println();
        System.out.println("Expected result: 08:30:29");
        System.out.println("Actual result " + time5);
        System.out.println();
        Time time6 = new Time(7, 20, 0);
        time4.add(time6);
        System.out.println("Expected result: 02:05:12"); // 18:45:12 + 07:20:00 = 02:05:12
        System.out.println("Actual result " + time4);
        System.out.println();
        
        System.out.println("Current hours: " + time4.getHours());
        System.out.println("Current minutes: " + time4.getMinutes());
        System.out.println("Current seconds: " + time4.getSeconds());






    }
}