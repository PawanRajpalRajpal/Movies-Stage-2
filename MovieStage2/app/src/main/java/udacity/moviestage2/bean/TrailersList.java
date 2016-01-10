package udacity.moviestage2.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pawankumar on 12/12/15.
 */
public class TrailersList {

    @SerializedName("results")
    List<TrailersData> trailersDatas;


    public List<TrailersData> getTrailersDatas() {
        return trailersDatas;
    }

    public void setTrailersDatas(List<TrailersData> trailersDatas) {
        this.trailersDatas = trailersDatas;
    }
}

