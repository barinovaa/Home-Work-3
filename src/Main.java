public class Main {
    public static void main(String[] args) {
        System.out.println("Home Worke 3");


    // Задание 1
    byte celoechisloOne = 1;
    short celoechisloTu = 3000;
    int cch = -250;
    long celchL = 2525L;
    float stochkoi = 0.5555555555f;
    double stjchkoi2 = 256.1;
    char simvol = 10;
    boolean logik = true;

    // Задание 2
    double boxer1 = 78.2;
    double boxer2 = 82.7;
    double summarn = boxer1 + boxer2;
    double raznica = boxer1 - boxer2;
            System.out.println("Суммарный вес боксеров " + summarn + " кг");
            System.out.println("разница в весе " + raznica);

            // Задание 3
        byte banana = 5;
        byte vesBanana = 80;
        int banan = banana * vesBanana;
        int milk = 2;
        byte vesMilkPolovina = 105;
        int milks = vesMilkPolovina * milk;
        byte aiscrem = 2;
        byte aiscremVes = 100;
        int aiscreme = aiscremVes * aiscrem;
        byte agg = 4;
        byte aggVes = 70;
        int agge = agg * aggVes;
        int vesGr = banan + milks + aiscreme + agge;

        System.out.println("Общий вес продуктов " + vesGr + " грамм" );

        float Kg = 1000f;
        float vesKg = vesGr / Kg;
        System.out.println("Вес продуктов " + vesKg + " кг" );

        // Задание 4
        byte ves = 7;
        float kg = 1000f;
        double vesG = ves * kg;
        float shudnut = 250f;
        float chudnut2 = 500f;
        double d = vesG/shudnut;
        double d2 = vesG/chudnut2;
        double t = d + d2;
        double Ves = t /2;
        System.out.println("В среднем потребуется " + Ves + " Дней" );

        // Задание 5
        int Macha = 67760;
        int Den = 83690;
        int Kris = 76230;
        double pov = 1.1;
        byte god = 12;
        int dohodDoMasha = Macha * god;
        int dohodDoDen = Den * god;
        int dohodDoKris = Kris * god;
        double mesDoxodMasha = Macha * pov;
        double mesDoxodDen = Den * pov;
        double mesDoxodKris = Kris * pov;
        double gdppM = dohodDoMasha * pov;
        double gdppD = dohodDoDen * pov;
        double gdppK = dohodDoKris *pov;
        double raznicaM = gdppM - dohodDoMasha;
        double raznicaD = gdppD - dohodDoDen;
        double raznicaK = gdppK - dohodDoKris;
        System.out.println("Маша тепер получает " + mesDoxodMasha + "руб. повышение составило " + raznicaM );
        System.out.println("Денис тепер получает " + mesDoxodDen + "руб. повышение составило " + raznicaD );
        System.out.println("Кристина тепер получает " + mesDoxodKris + "руб. повышение составило " + raznicaK );
// мне очень понравилось!
}

}
