package arraylists;

import java.util.ArrayList;

public class C {

    private ArrayList<MusicTrack> tracks;

    C(ArrayList<MusicTrack> tracks){
        this.tracks = tracks;
    }

    ArrayList<MusicTrack> getTracks(){
        return tracks;
    }

    void setTracks(ArrayList<MusicTrack> x){
        tracks = x;
    }
    
}

class MusicTrack {

    MusicTrack(){
        // from worksheet
    }
}
