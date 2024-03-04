public class Main {
    public static void main(String[] args) {
        
        MusicBox mbox1 = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox1.playSong(mbox1.getSongID(), mbox1.getPremiumSong(), 2);
        
        MusicBox mbox2 = new MusicBox("A12BC34", 'N', "Sunshine", "Sunny", "Bright Days Ahead", "Pop", "Melody Records", "Sunny Beats");

        System.out.println("Now playing another song");
        mbox2.playSong(mbox2.getSongID(), mbox2.getPremiumSong(), 1);
    }
}
        // --- TODO

        /* Repeat the above code to create another object  
         * Pass different parameters to the MusicBox constructor, but initialise premiumSong to N and when calling the
         * playSong method, pass ads parameter as just 1
         * 
         * 
        */
    




