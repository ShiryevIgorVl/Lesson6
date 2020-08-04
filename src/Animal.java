public class Animal {
    String name;
    int run;
    int sail;
    int runMax;
    // private int runCatMax;
    int sailMax;
    // private int sailCatMax;

    public Animal (String name, int run, int sail, int runMax, int sailMax) {
        this.name = name;
        this.run = run;
        this.sail = sail;
        this.runMax = runMax;
        this.sailMax = sailMax;
       }

    public void run (String name, int run, int runMax){
        if (run < runMax) {
            System.out.printf("%s пробежал %s м.\n", name, run);
        }
        if (run >= runMax || run <= 0){
            System.out.printf("%s %s м пробежать не может.\n", name, run);
        }
    }

    public void sail (String name, int sail, int sailMax){
        if (sail < sailMax) {
            System.out.printf("%s проплыл %s м.\n", name, sail);
        }
        if (sail >= sailMax || sail <= 0){
            System.out.printf("%s %s м проплыть не может.\n", name, sail);
        }
        if (sailMax == 0) {
            System.out.printf("%s плавать не умеет.\n", name);
        }
    }
}
