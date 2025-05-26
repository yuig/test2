package com.modiface.mfemakeupkit;

import java.io.File;

/* loaded from: classes7.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ File f34537a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f34538b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MFEMakeupEngine f34539c;

    public p(MFEMakeupEngine mFEMakeupEngine, File file, boolean z13) {
        this.f34539c = mFEMakeupEngine;
        this.f34537a = file;
        this.f34538b = z13;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.video.e eVar;
        com.modiface.mfemakeupkit.video.e eVar2;
        com.modiface.mfemakeupkit.video.e eVar3;
        eVar = this.f34539c.mVideoRecorder;
        if (eVar != null) {
            eVar2 = this.f34539c.mVideoRecorder;
            eVar2.i();
            eVar3 = this.f34539c.mVideoRecorder;
            eVar3.e().f();
            this.f34539c.mVideoRecorder = null;
        }
        this.f34539c.mVideoRecorder = new com.modiface.mfemakeupkit.video.e(this.f34537a, this.f34538b);
    }
}
