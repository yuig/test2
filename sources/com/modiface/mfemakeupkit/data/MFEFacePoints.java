package com.modiface.mfemakeupkit.data;

import androidx.annotation.NonNull;
import com.modiface.mfecommon.utils.MFEFaceBox;
import com.modiface.mfecommon.utils.MFEFaceRotation;
import com.modiface.mfecommon.utils.MFEFaceTranslation;
import com.modiface.mfecommon.utils.MFEPoint;
import com.modiface.mfecommon.utils.k;

/* loaded from: classes7.dex */
public class MFEFacePoints {
    private long mNativeState;

    static {
        k.a("MFEMakeupKit");
        registerNatives();
    }

    public MFEFacePoints() {
        this.mNativeState = 0L;
        this.mNativeState = jniInit();
    }

    private native void jniDestroy();

    private native void jniGetAllPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniGetContourPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniGetFaceBox(@NonNull MFEFaceBox mFEFaceBox);

    private native void jniGetFaceRotation(@NonNull MFEFaceRotation mFEFaceRotation);

    private native void jniGetFaceTranslation(@NonNull MFEFaceTranslation mFEFaceTranslation);

    private native void jniGetForeheadPoint(@NonNull MFEPoint mFEPoint);

    private native void jniGetInnerMouthPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniGetLeftBrowPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniGetLeftEyePoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniGetModelMatrix(@NonNull float[] fArr);

    private native void jniGetModelViewProjectionMatrix(@NonNull float[] fArr);

    private native void jniGetNosePoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniGetOuterMouthPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniGetProjectionViewMatrix(@NonNull float[] fArr);

    private native void jniGetRightBrowPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniGetRightEyePoints(@NonNull MFEPoint[] mFEPointArr);

    private native long jniInit();

    private native void jniSetContourPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniSetFaceBox(@NonNull MFEFaceBox mFEFaceBox);

    private native void jniSetFaceRotation(@NonNull MFEFaceRotation mFEFaceRotation);

    private native void jniSetFaceTranslation(@NonNull MFEFaceTranslation mFEFaceTranslation);

    private native void jniSetForeheadPoint(@NonNull MFEPoint mFEPoint);

    private native void jniSetInnerMouthPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniSetLeftBrowPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniSetLeftEyePoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniSetModelMatrix(@NonNull float[] fArr);

    private native void jniSetModelViewProjectionMatrix(@NonNull float[] fArr);

    private native void jniSetNosePoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniSetOuterMouthPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniSetProjectionViewMatrix(@NonNull float[] fArr);

    private native void jniSetRightBrowPoints(@NonNull MFEPoint[] mFEPointArr);

    private native void jniSetRightEyePoints(@NonNull MFEPoint[] mFEPointArr);

    private static MFEPoint[] newPointArray(int i13) {
        MFEPoint[] mFEPointArr = new MFEPoint[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            mFEPointArr[i14] = new MFEPoint();
        }
        return mFEPointArr;
    }

    private static native void registerNatives();

    public void close() {
        if (this.mNativeState != 0) {
            jniDestroy();
            this.mNativeState = 0L;
        }
    }

    public void finalize() {
        close();
        super.finalize();
    }

    @NonNull
    public MFEPoint[] getAllPoints() {
        MFEPoint[] newPointArray = newPointArray(66);
        jniGetAllPoints(newPointArray);
        return newPointArray;
    }

    @NonNull
    public MFEPoint[] getContourPoints() {
        MFEPoint[] newPointArray = newPointArray(3);
        jniGetContourPoints(newPointArray);
        return newPointArray;
    }

    @NonNull
    public MFEFaceBox getFaceBox() {
        MFEFaceBox mFEFaceBox = new MFEFaceBox();
        jniGetFaceBox(mFEFaceBox);
        return mFEFaceBox;
    }

    @NonNull
    public MFEFaceRotation getFaceRotation() {
        MFEFaceRotation mFEFaceRotation = new MFEFaceRotation();
        jniGetFaceRotation(mFEFaceRotation);
        return mFEFaceRotation;
    }

    @NonNull
    public MFEFaceTranslation getFaceTranslation() {
        MFEFaceTranslation mFEFaceTranslation = new MFEFaceTranslation();
        jniGetFaceTranslation(mFEFaceTranslation);
        return mFEFaceTranslation;
    }

    @NonNull
    public MFEPoint getForeheadPoint() {
        MFEPoint mFEPoint = new MFEPoint();
        jniGetForeheadPoint(mFEPoint);
        return mFEPoint;
    }

    @NonNull
    public MFEPoint[] getInnerrMouthPoints() {
        MFEPoint[] newPointArray = newPointArray(8);
        jniGetInnerMouthPoints(newPointArray);
        return newPointArray;
    }

    @NonNull
    public MFEPoint[] getLeftBrowPoints() {
        MFEPoint[] newPointArray = newPointArray(7);
        jniGetLeftBrowPoints(newPointArray);
        return newPointArray;
    }

    @NonNull
    public MFEPoint[] getLeftEyePoints() {
        MFEPoint[] newPointArray = newPointArray(10);
        jniGetLeftEyePoints(newPointArray);
        return newPointArray;
    }

    @NonNull
    public float[] getModelMatrix() {
        float[] fArr = new float[16];
        jniGetModelMatrix(fArr);
        return fArr;
    }

    @NonNull
    public float[] getModelViewProjectionMatrix() {
        float[] fArr = new float[12];
        jniGetModelViewProjectionMatrix(fArr);
        return fArr;
    }

    public long getNativeState() {
        return this.mNativeState;
    }

    @NonNull
    public MFEPoint[] getNosePoints() {
        MFEPoint[] newPointArray = newPointArray(7);
        jniGetNosePoints(newPointArray);
        return newPointArray;
    }

    @NonNull
    public MFEPoint[] getOuterMouthPoints() {
        MFEPoint[] newPointArray = newPointArray(13);
        jniGetOuterMouthPoints(newPointArray);
        return newPointArray;
    }

    @NonNull
    public float[] getProjectionViewMatrix() {
        float[] fArr = new float[12];
        jniGetProjectionViewMatrix(fArr);
        return fArr;
    }

    @NonNull
    public MFEPoint[] getRightBrowPoints() {
        MFEPoint[] newPointArray = newPointArray(7);
        jniGetRightBrowPoints(newPointArray);
        return newPointArray;
    }

    @NonNull
    public MFEPoint[] getRightEyePoints() {
        MFEPoint[] newPointArray = newPointArray(10);
        jniGetRightEyePoints(newPointArray);
        return newPointArray;
    }

    public void setContourPoints(@NonNull MFEPoint[] mFEPointArr) {
        jniSetContourPoints(mFEPointArr);
    }

    public void setFaceBox(@NonNull MFEFaceBox mFEFaceBox) {
        jniSetFaceBox(mFEFaceBox);
    }

    public void setFaceRotation(@NonNull MFEFaceRotation mFEFaceRotation) {
        jniSetFaceRotation(mFEFaceRotation);
    }

    public void setFaceTranslation(@NonNull MFEFaceTranslation mFEFaceTranslation) {
        jniSetFaceTranslation(mFEFaceTranslation);
    }

    public void setForeheadPoint(@NonNull MFEPoint mFEPoint) {
        jniSetForeheadPoint(mFEPoint);
    }

    public void setInnerMouthPoints(@NonNull MFEPoint[] mFEPointArr) {
        jniSetInnerMouthPoints(mFEPointArr);
    }

    public void setLeftBrowPoints(@NonNull MFEPoint[] mFEPointArr) {
        jniSetLeftBrowPoints(mFEPointArr);
    }

    public void setLeftEyePoints(@NonNull MFEPoint[] mFEPointArr) {
        jniSetLeftEyePoints(mFEPointArr);
    }

    public void setModelMatrix(@NonNull float[] fArr) {
        jniSetModelMatrix(fArr);
    }

    public void setModelViewProjectionMatrix(@NonNull float[] fArr) {
        jniSetModelViewProjectionMatrix(fArr);
    }

    public void setNosePoints(@NonNull MFEPoint[] mFEPointArr) {
        jniSetNosePoints(mFEPointArr);
    }

    public void setOuterMouthPoints(@NonNull MFEPoint[] mFEPointArr) {
        jniSetOuterMouthPoints(mFEPointArr);
    }

    public void setProjectionViewMatrix(@NonNull float[] fArr) {
        jniSetProjectionViewMatrix(fArr);
    }

    public void setRightBrowPoints(@NonNull MFEPoint[] mFEPointArr) {
        jniSetRightBrowPoints(mFEPointArr);
    }

    public void setRightEyePoints(@NonNull MFEPoint[] mFEPointArr) {
        jniSetRightEyePoints(mFEPointArr);
    }
}
