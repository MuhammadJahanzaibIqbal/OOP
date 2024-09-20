public class Run {
    public static void main(String[] args) {
        
        Artist artist1 = new Artist("Leonardo da Vinci");

        
        Artwork artwork1 = new Artwork("Mona Lisa", 1503, artist1);

        
        Artwork artwork2 = new Artwork("Unknown Masterpiece", 2023);

        
        artwork2.setTitle("Modern Art");
        artwork2.setYear(2022);

        
        System.out.println("Original Artworks:");
        artwork1.displayInformation();
        artwork2.displayInformation();

        
        Artwork shallowCopyArtwork = artwork1.shallowCopy();
        Artwork deepCopyArtwork = artwork1.deepCopy();

        
        System.out.println("\nBefore modifying artist:");
        System.out.println("Original Artwork:");
        artwork1.displayInformation();
        System.out.println("Shallow Copy:");
        shallowCopyArtwork.displayInformation();
        System.out.println("Deep Copy:");
        deepCopyArtwork.displayInformation();

        
        artist1 = new Artist("Leonardo Updated");  

       
        System.out.println("\nAfter modifying artist:");
        System.out.println("Original Artwork:");
        artwork1.displayInformation();
        System.out.println("Shallow Copy:");
        shallowCopyArtwork.displayInformation();
        System.out.println("Deep Copy:");
        deepCopyArtwork.displayInformation();
    }
}
