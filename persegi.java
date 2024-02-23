
    public class persegi {
        private double sisi;
    
        // Constructor to initialize sisi
        public persegi(double sisi) {
            this.sisi = sisi;
        }
    
        // Method to set the side length
        public void setSisi(double sisi) {
            this.sisi = sisi;
        }
    
        // Method to calculate and return the area
        public double getLuas() {
            return sisi * sisi;
        }
    
        // Method to calculate and return the perimeter
        public double getKeliling() {
            return 4 * sisi;
        }
        public static void main(String[] args) {
            persegi persegi1 = new persegi(5);
            System.out.println("nilai luas persegi: " + persegi1.getLuas());
            System.out.println("Keliling Persegi: " + persegi1.getKeliling());
    
            // Changing the side of the square
            persegi1.setSisi(7);
            System.out.println("New Luas Persegi: " + persegi1.getLuas());
            System.out.println("New Keliling Persegi: " + persegi1.getKeliling());
        };
}


