package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
