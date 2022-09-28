public class NotenDemo {

    public static void main(String[] args) {
        //System.out.println("HelloWorld");

        //Aufruf + Input Parameter
        // System.out.println(String(getNotentext(50)));
        getNotentext(6);
        getNotentext(77);
        getNotentext(83);
        getNotentext(100);
        getNotentext(347);

    }

    public static String getNotentext(int punkte) {

        if (punkte <= 50) {
            System.out.println("Ungenügend");
        } else if (punkte > 50 && punkte <= 64) {
            System.out.println("Genügend");
        } else if (punkte > 65 && punkte <= 77) {
            System.out.println("Befriedigend");
        } else if (punkte > 77 && punkte <= 89) {
            System.out.println("Gut");
        } else if (punkte > 89) {
            System.out.println("Sehr Gut");
        }

        return null;
    }
}