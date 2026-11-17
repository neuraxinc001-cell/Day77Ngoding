public class Day77 {
    public static void main(String[] args) {
        String nama = "  Freya Furry  ";
        System.out.println("Nama: " + nama);
        System.out.println(nama.length());
        System.out.println(nama.toUpperCase());
        System.out.println(nama.toLowerCase());
        System.out.println(nama.equals("Freya"));
        System.out.println(nama.contains("Freya"));
        System.out.println(nama.isEmpty());
        System.out.println(nama.substring(2, 7));
        System.out.println(nama.replace("Freya", "Franco"));
        System.out.println(nama.trim());
    }
}
