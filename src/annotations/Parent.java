package annotations;

public class Parent {
        @Deprecated
        public void oldWay() {
            System.out.println("Greetings and salutations!");
        }
        public void newWay() {
            System.out.println("What's up?");
        }
    }