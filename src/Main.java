public class Main {
    public static void main(String[] args) {
        System.out.println("=== Task 1 ===");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("=== Task 2 ===");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("=== Task 3 ===");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("=== Task 4 ===");
        var friend = 19;
        System.out.println(friend);
        friend = friend - 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("=== Task 5 ===");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("=== Task 6 ===");
        var boxer1Mass = 78.2;
        var boxer2Mass = 82.7;
        var totalBoxerMass = boxer1Mass + boxer2Mass;
        System.out.println(totalBoxerMass);
        var boxerMassDiff = Math.abs(boxer1Mass - boxer2Mass);
        System.out.println(boxerMassDiff);

        System.out.println("=== Task 7 ===");
        boxerMassDiff = boxer2Mass - boxer1Mass;
        var boxerMassRem = boxer2Mass % boxer1Mass;
        System.out.println(boxerMassDiff);
        System.out.println(boxerMassRem);

        System.out.println("=== Task 8 ===");
        var worktimeTotal = 640;
        var worktimePerEmp = 8;
        var employeeTotal = worktimeTotal / worktimePerEmp;
        System.out.println("Всего работников в компании: " + employeeTotal + " человек");

        var employeeTotalNew = employeeTotal + 94;
        var worktimeTotalNew = employeeTotalNew * worktimePerEmp;
        System.out.println("Если в компании работает " + employeeTotalNew + " человек, то всего " + worktimeTotalNew + " часов работы может быть поделено между сотрудниками");

    }
}