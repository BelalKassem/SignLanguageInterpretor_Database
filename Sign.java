package com.example.belal.signlanguageproject;

public class Sign {
    /** Name of the sign */
    private String mSignName;

    /** Encoded hand data for the sign
     Thumb, Index, Middle, Ring, Little, Palm
     **/
    private String mEncodedStatus;

    /** Audio resource ID for the sign */
    private int mAudioResourceId;

    /** Image resource ID for the sign */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Sign object.
     *
     * @param name is the name of the sign
     * @param encodedStatus represents the encoded hand data for the sign
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Sign(String name, String encodedStatus, int audioResourceId) {
        mSignName = name;
        mEncodedStatus = encodedStatus;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Sign object.
     *
     * @param name is the name of the sign
     * @param encodedStatus represents the encoded hand data for the sign
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Sign(String name, String encodedStatus, int imageResourceId,
                int audioResourceId) {
        mSignName = name;
        mEncodedStatus = encodedStatus;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the name of the sign.
     */
    public String getSignName() {
        return mSignName;
    }

    /**
     * Get the encoded status of the sign.
     */
    public String getEncodedStatus() {
        return mEncodedStatus;
    }

    /**
     * Return the image resource ID of the sign.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
