package com.modiface.mfemakeupkit;

/* loaded from: classes7.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34609a;

    public u(MFEMakeupEngine mFEMakeupEngine) {
        this.f34609a = mFEMakeupEngine;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.video.e eVar;
        com.modiface.mfemakeupkit.video.e eVar2;
        com.modiface.mfemakeupkit.video.e eVar3;
        eVar = this.f34609a.mVideoRecorder;
        if (eVar != null) {
            eVar2 = this.f34609a.mVideoRecorder;
            eVar2.i();
            eVar3 = this.f34609a.mVideoRecorder;
            eVar3.e().f();
            this.f34609a.mVideoRecorder = null;
        }
    }
}
