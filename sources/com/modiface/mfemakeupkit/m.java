package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFETrackingData;

/* loaded from: classes7.dex */
public final class m implements MFEMakeupEngine.MFEMakeupEngineImageProcessedCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f34526a;

    public m(n nVar) {
        this.f34526a = nVar;
    }

    @Override // com.modiface.mfemakeupkit.MFEMakeupEngine.MFEMakeupEngineImageProcessedCallback
    public void onMFEMakeupFinishedProcessingImage(MFETrackingData mFETrackingData) {
        n nVar = this.f34526a;
        nVar.f34532b.f34534b.onRunningWithPictureDone(nVar.f34531a, mFETrackingData, null);
    }
}
