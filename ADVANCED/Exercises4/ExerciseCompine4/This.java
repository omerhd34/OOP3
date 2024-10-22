package ADVANCED.Exercises4.ExerciseCompine4;

// this used implicitly and explicitly to refer to members of an object.
public class This {
    public static void main(String[] args) {
        // create and initialize a SimpleTime object
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

/*
this.toUniversalString(): 15:30:19
     toUniversalString(): 15:30:19

+---------------------------+
|         ThisTest          |
+---------------------------+
| + main(args: String[]): void |
+---------------------------+

+---------------------------+
|        SimpleTime         |
+---------------------------+
| - hour: int               |
| - minute: int             |
| - second: int             |
+---------------------------+
| + SimpleTime(hour: int, minute: int, second: int)         |
| + buildString(): String                                   |
| + toUniversalString(): String                             |
+---------------------------+
*/