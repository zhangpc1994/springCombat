package soundsystem;

public class BlankDisc2 implements CompactDisc {

  private String title;
  private String artist;

  public BlankDisc2(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  public void play() {
    System.out.println("BlankDisc2 Playing " + title + " by " + artist);
  }

}
