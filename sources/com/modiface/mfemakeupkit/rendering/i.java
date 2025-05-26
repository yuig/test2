package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfemakeupkit.rendering.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f34587a;

    public i(a aVar) {
        this.f34587a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfecommon.utils.n nVar;
        MFEGLFramebuffer mFEGLFramebuffer;
        MFEGLFramebuffer mFEGLFramebuffer2;
        com.modiface.mfemakeupkit.mfea.c cVar;
        WeakReference weakReference;
        MFEGLFramebuffer mFEGLFramebuffer3;
        MFEGLFramebuffer mFEGLFramebuffer4;
        MFEGLFramebuffer mFEGLFramebuffer5;
        MFEGLFramebuffer mFEGLFramebuffer6;
        MFEGLFramebuffer mFEGLFramebuffer7;
        MFEGLFramebuffer mFEGLFramebuffer8;
        nVar = this.f34587a.f34557d;
        nVar.b(com.modiface.mfecommon.utils.h.f34316b);
        ArrayList<Throwable> arrayList = new ArrayList<>();
        mFEGLFramebuffer = this.f34587a.f34559f;
        if (mFEGLFramebuffer != null) {
            mFEGLFramebuffer6 = this.f34587a.f34559f;
            mFEGLFramebuffer6.close();
            mFEGLFramebuffer7 = this.f34587a.f34559f;
            arrayList.addAll(mFEGLFramebuffer7.getAndClearErrors());
            mFEGLFramebuffer8 = this.f34587a.f34559f;
            mFEGLFramebuffer8.close();
            this.f34587a.f34559f = null;
        }
        mFEGLFramebuffer2 = this.f34587a.f34560g;
        if (mFEGLFramebuffer2 != null) {
            mFEGLFramebuffer3 = this.f34587a.f34560g;
            mFEGLFramebuffer3.close();
            mFEGLFramebuffer4 = this.f34587a.f34560g;
            arrayList.addAll(mFEGLFramebuffer4.getAndClearErrors());
            mFEGLFramebuffer5 = this.f34587a.f34560g;
            mFEGLFramebuffer5.close();
            this.f34587a.f34560g = null;
        }
        cVar = this.f34587a.f34558e;
        cVar.i();
        if (arrayList.isEmpty()) {
            return;
        }
        weakReference = this.f34587a.f34554a;
        a.q qVar = (a.q) weakReference.get();
        if (qVar != null) {
            qVar.onRenderingEngineErrors(arrayList);
        }
    }
}
