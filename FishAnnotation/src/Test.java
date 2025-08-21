import java.lang.classfile.Annotation;

public class Test {
    public static void main(String[] args) {
    Fish []fish = new Fish[2];
    fish[0] = new Carp();
    fish[1] = new Perch();

    System.out.println("Рыбу нельзя ловить в определенные месяцы ");
    for (Fish f : fish) {
        Class<?> c = f.getClass();
        FishingBan ann = c.getAnnotation(FishingBan.class);
        if (ann != null) {
            System.out.println(c.getSimpleName() + " : ");

            for (Month m : ann.months()) {
                System.out.println(m);

            }
        }

    }


    }
}
