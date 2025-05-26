package com.modiface.mfemakeupkit;

/* loaded from: classes7.dex */
public final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34440a;

    public e0(MFEMakeupEngine mFEMakeupEngine) {
        this.f34440a = mFEMakeupEngine;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.video.e eVar;
        com.modiface.mfemakeupkit.video.e eVar2;
        com.modiface.mfemakeupkit.video.e eVar3;
        eVar = this.f34440a.mVideoRecorder;
        if (eVar != null) {
            eVar2 = this.f34440a.mVideoRecorder;
            eVar2.e().e();
            eVar3 = this.f34440a.mVideoRecorder;
            eVar3.h();
        }
    }
}
