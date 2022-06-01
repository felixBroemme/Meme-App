package model.swipe;

import javafx.scene.image.Image;

public class CustomImage extends Image
{
    private int positiveRating;
    private int negativeRating;

    public CustomImage(String url)
    {
        super(url);
        positiveRating=0;
        negativeRating=0;

    }

    public int getPositiveRating()
    {
        return positiveRating;
    }

    public int getNegativeRating()
    {
        return negativeRating;
    }

    public void plusRating()
    {
        positiveRating++;
    }
    public void minusRating()
    {
        negativeRating++;
    }
}
