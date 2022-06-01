package model.swipe;

import javafx.scene.image.Image;
import java.util.LinkedList;

public class Swipe
{
    private LinkedList<CustomImage> memes;

    private CustomImage currentImage = new CustomImage("File:D:/Kolleg/PRE/6ACIF/BilderMeme/meme1.jpg");
    private CustomImage nextImage = new CustomImage("File:D:/Kolleg/PRE/6ACIF/BilderMeme/meme2.jpg");
    private CustomImage image3 = new CustomImage("File:D:/Kolleg/PRE/6ACIF/BilderMeme/meme3.jpg");
    private int indexCounter;


    public Swipe(Image currentImmage)
    {

        memes= new LinkedList<>();
        memes.add(currentImage);
        memes.add(nextImage);
        memes.add(image3);
        setCurrentImmage( memes.getFirst());
    }

    public LinkedList<CustomImage> getMemes()
    {
        return memes;
    }

    public void setMemes(LinkedList<CustomImage> memes)
    {
        this.memes = memes;
    }

    public Image getCurrentImmage()
    {
        return currentImage;
    }

    public void setCurrentImmage(CustomImage currentImmage)
    {
        this.currentImage = currentImmage;
    }

    public Image getNextImmage()
    {
        return nextImage;
    }

    public void setNextImmage(CustomImage nextImmage)
    {
        this.nextImage = nextImmage;
    }

    public void swipeLeft()
    {
        indexCounter++;
        if (indexCounter == memes.size())
        {
            indexCounter=0;
        }
            setCurrentImmage(memes.get(indexCounter));
            currentImage.minusRating();
    }

    public void swipeRight()
    {
        indexCounter++;
        if (indexCounter == memes.size())
        {
            indexCounter=0;
        }
            setCurrentImmage(memes.get(indexCounter));
            currentImage.plusRating();
    }

}
