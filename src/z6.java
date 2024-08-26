public class z6 {
    public static void main(String[] args) {
   short banan = 80;
   short moloko = 105;
   short morogenoe = 100;
   short eggs = 70;
   int weightGr = banan * 5 + moloko * 2 + morogenoe * 2 + eggs * 4;
   System.out.println("Вес завтрака " + weightGr + " грамм");
        int grPerKg = 1000;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println("Вес завтрака " + weightKg + " кг");
    }
}
