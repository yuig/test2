package com.modiface.mfemakeupkit;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class i implements a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.ApplyMakeupToPhotoCompletionHandler f34505a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bitmap f34506b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34507c;

    public i(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.ApplyMakeupToPhotoCompletionHandler applyMakeupToPhotoCompletionHandler, Bitmap bitmap) {
        this.f34507c = mFEMakeupEngine;
        this.f34505a = applyMakeupToPhotoCompletionHandler;
        this.f34506b = bitmap;
    }

    @Override // com.modiface.mfemakeupkit.facetracking.a.r
    public void a(@NonNull MFETrackingData mFETrackingData) {
        com.modiface.mfemakeupkit.rendering.a aVar;
        com.modiface.mfemakeupkit.utils.d dVar = new com.modiface.mfemakeupkit.utils.d(mFETrackingData, new MFEMakeupEngine.y(MFEMakeupEngine.z.STATIC, null, null));
        aVar = this.f34507c.mMakeupRenderingEngine;
        aVar.a(dVar, new h(this));
    }
}
