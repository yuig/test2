package com.modiface.mfemakeupkit;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class j implements a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.FaceTrackedOnPhotoCompletionHandler f34509a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bitmap f34510b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34511c;

    public j(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.FaceTrackedOnPhotoCompletionHandler faceTrackedOnPhotoCompletionHandler, Bitmap bitmap) {
        this.f34511c = mFEMakeupEngine;
        this.f34509a = faceTrackedOnPhotoCompletionHandler;
        this.f34510b = bitmap;
    }

    @Override // com.modiface.mfemakeupkit.facetracking.a.r
    public void a(@NonNull MFETrackingData mFETrackingData) {
        this.f34509a.onFaceTrackedOnPhoto(this.f34510b, mFETrackingData);
    }
}
