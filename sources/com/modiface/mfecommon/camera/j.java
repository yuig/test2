package com.modiface.mfecommon.camera;

import com.modiface.mfecommon.utils.MFEGLFramebuffer;

/* loaded from: classes7.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f34234a;

    public j(k kVar) {
        this.f34234a = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        MFEGLFramebuffer mFEGLFramebuffer;
        com.modiface.mfecommon.mfea.d dVar;
        MFEGLFramebuffer mFEGLFramebuffer2;
        MFEGLFramebuffer mFEGLFramebuffer3;
        mFEGLFramebuffer = this.f34234a.f34235a.f34174i;
        if (mFEGLFramebuffer != null) {
            mFEGLFramebuffer2 = this.f34234a.f34235a.f34174i;
            mFEGLFramebuffer2.close();
            mFEGLFramebuffer3 = this.f34234a.f34235a.f34174i;
            if (mFEGLFramebuffer3.hasError()) {
                this.f34234a.f34235a.f34174i = null;
            }
        }
        dVar = this.f34234a.f34235a.f34177l;
        dVar.e();
    }
}
