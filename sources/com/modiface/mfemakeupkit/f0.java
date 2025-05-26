package com.modiface.mfemakeupkit;

import androidx.annotation.NonNull;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.facetracking.a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class f0 implements a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.MFEMakeupEngineDetectionCallback f34444a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.MFEMakeupEngineImageProcessedCallback f34445b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34446c;

    public f0(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.MFEMakeupEngineDetectionCallback mFEMakeupEngineDetectionCallback, MFEMakeupEngine.MFEMakeupEngineImageProcessedCallback mFEMakeupEngineImageProcessedCallback) {
        this.f34446c = mFEMakeupEngine;
        this.f34444a = mFEMakeupEngineDetectionCallback;
        this.f34445b = mFEMakeupEngineImageProcessedCallback;
    }

    @Override // com.modiface.mfemakeupkit.facetracking.a.r
    public void a(@NonNull MFETrackingData mFETrackingData) {
        AtomicBoolean atomicBoolean;
        AtomicReference atomicReference;
        atomicBoolean = this.f34446c.mIsPaused;
        if (!atomicBoolean.get()) {
            atomicReference = this.f34446c.mCurrentInputState;
            if (atomicReference.get() == g0.STATIC_IMAGE) {
                this.f34446c.onFaceTrackedOnImage(new com.modiface.mfemakeupkit.utils.d(mFETrackingData, new MFEMakeupEngine.y(MFEMakeupEngine.z.STATIC, this.f34444a, this.f34445b)), false);
                return;
            }
        }
        mFETrackingData.getImage().close();
    }
}
