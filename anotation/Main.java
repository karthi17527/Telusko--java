import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.*;
import java.lang.*;
// import org.w3c.dom.Element;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@interface cricketplayer {
    int age()

    default 34;

    String country() default "india";
}

// @cricketplayer(age = 24, country = "india")
@cricketplayer
class virat {
    @cricketplayer
    int runs;
    int innings;

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public int getInnings() {
        return innings;
    }
}

public class Main {
    public static void main(String[] args) {
        virat v = new virat();
        v.setRuns(123);
        v.setInnings(490);
        System.out.println(v.getInnings());
        System.out.println(v.getRuns());
        Class c = v.getClass();
        Annotation an = c.getAnnotation(cricketplayer.class);
        cricketplayer cp = (cricketplayer) an;
        System.out.println("age" + cp.age());

    }
}