package com.modiface.mfemakeupkit;

import android.graphics.Bitmap;
import com.modiface.mfemakeupkit.MFEMakeupEngine;

/* loaded from: classes7.dex */
public final class k implements MFEMakeupEngine.ApplyMakeupToPhotoCompletionHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f34513a;

    public k(l lVar) {
        this.f34513a = lVar;
    }

    @Override // com.modiface.mfemakeupkit.MFEMakeupEngine.ApplyMakeupToPhotoCompletionHandler
    public void onMakeupAppliedToPhoto(Bitmap bitmap, Bitmap bitmap2, Throwable th3) {
        if (th3 != null) {
            this.f34513a.f34523b.onTakePictureFromCameraDone(bitmap, null, th3);
        } else if (bitmap2 != null) {
            this.f34513a.f34523b.onTakePictureFromCameraDone(bitmap, bitmap2, null);
        } else {
            this.f34513a.f34523b.onTakePictureFromCameraDone(bitmap, null, new Exception("failed to apply makeup to photo taken from camera"));
        }
    }
}
