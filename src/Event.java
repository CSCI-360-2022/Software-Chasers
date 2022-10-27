public class Event {
    int eid;
    public static boolean test(String description, boolean assertion){
        if (assertion){
            System.out.println("[ OK ]" + description);

        } else{
            System.out.println("[FAIL]" + description);
        }
        return assertion;
    }
    public static void main(String[] args) {
        boolean vint;
        Event event = new Event();
        event.eid = -30;
        test("Event should have an event ID", event.eid > 0);

    }
}
