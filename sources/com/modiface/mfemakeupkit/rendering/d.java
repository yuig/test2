package com.modiface.mfemakeupkit.rendering;

import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfecommon.utils.MFEImage;
import com.modiface.mfecommon.utils.MFENativeError;
import com.modiface.mfemakeupkit.data.MFEMakeupRenderingParameters;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.rendering.a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f34573a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.o f34574b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.modiface.mfemakeupkit.utils.d f34575c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ a f34576d;

    public d(a aVar, ArrayList arrayList, a.o oVar, com.modiface.mfemakeupkit.utils.d dVar) {
        this.f34576d = aVar;
        this.f34573a = arrayList;
        this.f34574b = oVar;
        this.f34575c = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicBoolean atomicBoolean;
        com.modiface.mfemakeupkit.mfea.c cVar;
        com.modiface.mfemakeupkit.mfea.c cVar2;
        AtomicReference atomicReference;
        atomicBoolean = this.f34576d.f34555b;
        boolean z13 = false;
        if (atomicBoolean.get()) {
            this.f34573a.add(new Throwable("cannot apply makeup in background when we are on paused"));
            this.f34574b.a(false, this.f34573a, this.f34575c, null);
            return;
        }
        MFEImage image = this.f34575c.f34672a.getImage();
        MFEGLFramebuffer mFEGLFramebuffer = new MFEGLFramebuffer("before_background");
        MFEGLFramebuffer mFEGLFramebuffer2 = new MFEGLFramebuffer("output_background");
        mFEGLFramebuffer2.generateEmptyWithSize(image.getWidth(), image.getHeight());
        mFEGLFramebuffer.generateEmptyWithSize(image.getWidth(), image.getHeight());
        if (mFEGLFramebuffer2.hasError() || !mFEGLFramebuffer2.isValid() || mFEGLFramebuffer.hasError() || !mFEGLFramebuffer.isValid()) {
            this.f34573a.addAll(mFEGLFramebuffer.getAndClearErrors());
            this.f34573a.addAll(mFEGLFramebuffer2.getAndClearErrors());
            if (!mFEGLFramebuffer2.isValid()) {
                this.f34573a.add(new Throwable("output framebuffer for applying makeup in background is invalid"));
            }
            if (!mFEGLFramebuffer.isValid()) {
                this.f34573a.add(new Throwable("before framebuffer for applying makeup in background is invalid"));
            }
            this.f34573a.add(new Throwable("failed to initialize framebuffers to apply makeup in background"));
            this.f34574b.a(false, this.f34573a, this.f34575c, null);
            mFEGLFramebuffer.close();
            mFEGLFramebuffer2.close();
            return;
        }
        cVar = this.f34576d.f34558e;
        if (cVar.j()) {
            MFENativeError mFENativeError = new MFENativeError();
            cVar2 = this.f34576d.f34558e;
            int textureId = image.getTexture().getTextureId();
            MFETrackingData mFETrackingData = this.f34575c.f34672a;
            atomicReference = this.f34576d.f34562i;
            z13 = cVar2.f(mFEGLFramebuffer2, mFEGLFramebuffer, textureId, mFETrackingData, (MFEMakeupRenderingParameters) atomicReference.get(), 0.0f, new MFEDebugInfo("background render"), mFENativeError.getNativeState());
            Throwable nativeError = mFENativeError.getNativeError();
            if (nativeError != null) {
                this.f34573a.add(nativeError);
            }
        } else {
            this.f34573a.add(new Throwable("native state is invalid when applying makeup in background"));
        }
        this.f34574b.a(z13, this.f34573a, this.f34575c, mFEGLFramebuffer2);
        mFEGLFramebuffer.close();
        mFEGLFramebuffer2.close();
    }
}
