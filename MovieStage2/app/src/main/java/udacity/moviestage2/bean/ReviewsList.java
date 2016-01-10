package udacity.moviestage2.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pawankumar on 12/12/15.
 */
public class ReviewsList {

    @SerializedName("results")
    List<ReviewData> reviewDatas;


    public List<ReviewData> getReviewDatas() {
        return reviewDatas;
    }

    public void setReviewDatas(List<ReviewData> reviewDatas) {
        this.reviewDatas = reviewDatas;
    }
}

