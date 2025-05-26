package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.rendering.a;

/* loaded from: classes7.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a.r f34581a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34582b;

    public f(a aVar, a.r rVar) {
        this.f34582b = aVar;
        this.f34581a = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        MFEGLFramebuffer mFEGLFramebuffer;
        MFEGLFramebuffer mFEGLFramebuffer2;
        com.modiface.mfemakeupkit.utils.d dVar;
        MFETrackingData mFETrackingData;
        com.modiface.mfemakeupkit.utils.d dVar2;
        a.r rVar = this.f34581a;
        if (rVar != null) {
            mFEGLFramebuffer = this.f34582b.f34560g;
            mFEGLFramebuffer2 = this.f34582b.f34559f;
            dVar = this.f34582b.f34561h;
            if (dVar != null) {
                dVar2 = this.f34582b.f34561h;
                mFETrackingData = dVar2.f34672a;
            } else {
                mFETrackingData = null;
            }
            rVar.a(mFEGLFramebuffer, mFEGLFramebuffer2, mFETrackingData);
        }
    }
}
