package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfemakeupkit.rendering.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f34588a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34589b;

    public j(a aVar, Runnable runnable) {
        this.f34589b = aVar;
        this.f34588a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfecommon.utils.n nVar;
        MFEGLFramebuffer mFEGLFramebuffer;
        MFEGLFramebuffer mFEGLFramebuffer2;
        com.modiface.mfemakeupkit.mfea.c cVar;
        WeakReference weakReference;
        com.modiface.mfemakeupkit.mfea.c cVar2;
        MFEGLFramebuffer mFEGLFramebuffer3;
        MFEGLFramebuffer mFEGLFramebuffer4;
        MFEGLFramebuffer mFEGLFramebuffer5;
        MFEGLFramebuffer mFEGLFramebuffer6;
        MFEGLFramebuffer mFEGLFramebuffer7;
        MFEGLFramebuffer mFEGLFramebuffer8;
        nVar = this.f34589b.f34557d;
        nVar.e(com.modiface.mfecommon.utils.h.f34316b);
        Runnable runnable = this.f34588a;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList<Throwable> arrayList = new ArrayList<>();
        mFEGLFramebuffer = this.f34589b.f34559f;
        if (mFEGLFramebuffer != null) {
            mFEGLFramebuffer6 = this.f34589b.f34559f;
            mFEGLFramebuffer6.close();
            mFEGLFramebuffer7 = this.f34589b.f34559f;
            arrayList.addAll(mFEGLFramebuffer7.getAndClearErrors());
            mFEGLFramebuffer8 = this.f34589b.f34559f;
            mFEGLFramebuffer8.close();
            this.f34589b.f34559f = null;
        }
        mFEGLFramebuffer2 = this.f34589b.f34560g;
        if (mFEGLFramebuffer2 != null) {
            mFEGLFramebuffer3 = this.f34589b.f34560g;
            mFEGLFramebuffer3.close();
            mFEGLFramebuffer4 = this.f34589b.f34560g;
            arrayList.addAll(mFEGLFramebuffer4.getAndClearErrors());
            mFEGLFramebuffer5 = this.f34589b.f34560g;
            mFEGLFramebuffer5.close();
            this.f34589b.f34560g = null;
        }
        cVar = this.f34589b.f34558e;
        if (cVar.j()) {
            cVar2 = this.f34589b.f34558e;
            cVar2.c();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        weakReference = this.f34589b.f34554a;
        a.q qVar = (a.q) weakReference.get();
        if (qVar != null) {
            qVar.onRenderingEngineErrors(arrayList);
        }
    }
}
