package com.modiface.mfemakeupkit.data;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.utils.MFEFaceBox;
import com.modiface.mfecommon.utils.MFEImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class MFETrackingData {
    private static final String TAG = "MFETrackingData";

    @NonNull
    private final MFEImage mImage;
    private boolean mIsTrackedAfterReset = false;

    @NonNull
    private final ArrayList<MFEFacePoints> mFacePointsList = new ArrayList<>();
    private boolean mHasFaceMask = false;

    public MFETrackingData(@NonNull MFEImage mFEImage) {
        this.mImage = mFEImage;
    }

    private long addNewFacePoints() {
        MFEFacePoints mFEFacePoints = new MFEFacePoints();
        this.mFacePointsList.add(mFEFacePoints);
        return mFEFacePoints.getNativeState();
    }

    private long[] getFacePointsNatives() {
        ArrayList arrayList = new ArrayList();
        Iterator<MFEFacePoints> it = this.mFacePointsList.iterator();
        while (it.hasNext()) {
            MFEFacePoints next = it.next();
            if (next != null) {
                arrayList.add(Long.valueOf(next.getNativeState()));
            }
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i13 = 0; i13 < size; i13++) {
            jArr[i13] = ((Long) arrayList.get(i13)).longValue();
        }
        return jArr;
    }

    private int getFrameID() {
        return this.mImage.getFrameID();
    }

    private Bitmap getImageBitmap() {
        return this.mImage.getBitmap();
    }

    public void copyFacePointsFrom(MFETrackingData mFETrackingData) {
        if (mFETrackingData != null) {
            this.mFacePointsList.clear();
            this.mFacePointsList.addAll(mFETrackingData.mFacePointsList);
        }
    }

    public List<MFEFaceBox> getFaceBoxList() {
        ArrayList arrayList = new ArrayList();
        Iterator<MFEFacePoints> it = this.mFacePointsList.iterator();
        while (it.hasNext()) {
            MFEFacePoints next = it.next();
            if (next != null) {
                arrayList.add(next.getFaceBox());
            }
        }
        return arrayList;
    }

    public MFEFacePoints getFirstFacePoints() {
        if (this.mFacePointsList.isEmpty()) {
            return null;
        }
        return this.mFacePointsList.get(0);
    }

    public boolean getHasFaceMask() {
        return this.mHasFaceMask;
    }

    @NonNull
    public MFEImage getImage() {
        return this.mImage;
    }

    public boolean hasFacePoints() {
        return !this.mFacePointsList.isEmpty();
    }

    public void setHasFaceMask(boolean z13) {
        this.mHasFaceMask = z13;
    }
}
