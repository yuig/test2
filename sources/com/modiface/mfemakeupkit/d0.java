package com.modiface.mfemakeupkit;

/* loaded from: classes7.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34420a;

    public d0(MFEMakeupEngine mFEMakeupEngine) {
        this.f34420a = mFEMakeupEngine;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.video.e eVar;
        com.modiface.mfemakeupkit.data.a aVar;
        com.modiface.mfemakeupkit.video.e eVar2;
        com.modiface.mfemakeupkit.video.e eVar3;
        com.modiface.mfemakeupkit.video.e eVar4;
        eVar = this.f34420a.mVideoRecorder;
        if (eVar != null) {
            eVar2 = this.f34420a.mVideoRecorder;
            eVar2.e().d();
            eVar3 = this.f34420a.mVideoRecorder;
            eVar3.f();
            eVar4 = this.f34420a.mVideoRecorder;
            eVar4.e().b();
        }
        aVar = this.f34420a.mFrameSynchronizer;
        aVar.a();
    }
}
