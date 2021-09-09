package jubair.Lsp;
import java.util.ArrayList;
import java.util.List;

public class LSP {
    public static void main(String arg[]){
        List < VideoMediaPlayer > allPlayers = new ArrayList< VideoMediaPlayer >();
        allPlayers.add(new VlcMediaPlayer());
        allPlayers.add(new DivMediaPlayer());

        playVideoInAllMediaPlayers(allPlayers);

        //allPlayers.add(new WinampMediaPlayer());
        System.out.println("---------------------------");

    }

    /**
     * This method is playing video in all players
     *
     * @param allPlayers
     */
    public static void playVideoInAllMediaPlayers(List< VideoMediaPlayer > allPlayers) {

        for (VideoMediaPlayer player: allPlayers) {
            player.playVideo();
        }
    }
}
