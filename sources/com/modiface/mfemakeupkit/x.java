package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class x implements a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.MFEMakeupEngineLoadResourcesCallback f34772a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34773b;

    public x(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.MFEMakeupEngineLoadResourcesCallback mFEMakeupEngineLoadResourcesCallback) {
        this.f34773b = mFEMakeupEngine;
        this.f34772a = mFEMakeupEngineLoadResourcesCallback;
    }

    @Override // com.modiface.mfemakeupkit.facetracking.a.p
    public void a() {
        MFEMakeupEngine.MFEMakeupEngineLoadResourcesCallback mFEMakeupEngineLoadResourcesCallback = this.f34772a;
        if (mFEMakeupEngineLoadResourcesCallback != null) {
            mFEMakeupEngineLoadResourcesCallback.onMFEMakeupFinishedLoadResources();
        }
    }
}
