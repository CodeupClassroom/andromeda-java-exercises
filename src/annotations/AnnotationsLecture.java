package annotations;

import java.util.ArrayList;
import java.util.List;

public class AnnotationsLecture {

    /*

        Annotations are meta instructions for the Java compiler and JVM.
            - do not effect code execution
            - can be used to create additional Java code
            - will be used frequently in Spring
            - custom annotations are possible; we will focus on using predefined annotations

        Three compile-time annotations to cover...
            1. Deprecated
            2. Override
            3. SuppressWarnings

     */

    private List<Integer> stats;


    public AnnotationsLecture(String name) {
        this.stats = new ArrayList();
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        p.newWay();
        p.oldWay();

        Child c = new Child();
        c.newWay();

    }

}
