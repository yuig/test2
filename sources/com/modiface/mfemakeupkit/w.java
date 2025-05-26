package com.modiface.mfemakeupkit;

import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.facetracking.a;

/* loaded from: classes7.dex */
public final class w implements a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine.MFEMakeupEngineLoadResourcesCallback f34763a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34764b;

    public w(MFEMakeupEngine mFEMakeupEngine, MFEMakeupEngine.MFEMakeupEngineLoadResourcesCallback mFEMakeupEngineLoadResourcesCallback) {
        this.f34764b = mFEMakeupEngine;
        this.f34763a = mFEMakeupEngineLoadResourcesCallback;
    }

    @Override // com.modiface.mfemakeupkit.facetracking.a.p
    public void a() {
        MFEMakeupEngine.MFEMakeupEngineLoadResourcesCallback mFEMakeupEngineLoadResourcesCallback = this.f34763a;
        if (mFEMakeupEngineLoadResourcesCallback != null) {
            mFEMakeupEngineLoadResourcesCallback.onMFEMakeupFinishedLoadResources();
        }
    }
}
