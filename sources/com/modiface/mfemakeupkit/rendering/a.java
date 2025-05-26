package com.modiface.mfemakeupkit.rendering;

import android.content.Context;
import android.content.res.AssetManager;
import android.opengl.EGLContext;
import android.opengl.EGLSurface;
import android.util.Log;
import androidx.annotation.NonNull;
import com.modiface.mfecommon.utils.MFEDebugInfo;
import com.modiface.mfecommon.utils.MFEGLFramebuffer;
import com.modiface.mfecommon.utils.MFEImage;
import com.modiface.mfecommon.utils.MFENativeError;
import com.modiface.mfecommon.utils.MFESharedGLTexture;
import com.modiface.mfemakeupkit.MFEMakeupEngine;
import com.modiface.mfemakeupkit.data.MFEFoundationMatchStatus;
import com.modiface.mfemakeupkit.data.MFEMakeupRenderingParameters;
import com.modiface.mfemakeupkit.data.MFETrackingData;
import com.modiface.mfemakeupkit.effects.MFEMakeupLook;
import com.modiface.mfemakeupkit.effects.MFEMakeupTint;
import com.modiface.mfemakeupkit.effects.MFEParticleEffectsLayer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public class a {
    private static final float A = 0.06f;

    /* renamed from: o, reason: collision with root package name */
    private static final String f34542o = "MFEMakeupRenderEngine";

    /* renamed from: p, reason: collision with root package name */
    private static final String f34543p = "MFEMakeupRenderThread";

    /* renamed from: q, reason: collision with root package name */
    private static final String f34544q = "MFEMakeupBackgroundRenderThread";

    /* renamed from: r, reason: collision with root package name */
    private static final String f34545r = "Makeup Rendering";

    /* renamed from: s, reason: collision with root package name */
    private static final String f34546s = "Rendering Tracking Data";

    /* renamed from: t, reason: collision with root package name */
    private static final String f34547t = "MFE Makeup Rendering Engine";

    /* renamed from: u, reason: collision with root package name */
    private static final String f34548u = "default";

    /* renamed from: v, reason: collision with root package name */
    private static final String f34549v = "Tints";

    /* renamed from: w, reason: collision with root package name */
    private static final String f34550w = "Particles";

    /* renamed from: x, reason: collision with root package name */
    private static final Set<String> f34551x = new HashSet(Arrays.asList(f34548u, f34549v, f34550w));

    /* renamed from: y, reason: collision with root package name */
    private static final String f34552y = "makeup";

    /* renamed from: z, reason: collision with root package name */
    private static final String f34553z = "before";

    /* renamed from: c, reason: collision with root package name */
    private final com.modiface.mfecommon.utils.n f34556c;

    /* renamed from: d, reason: collision with root package name */
    private final com.modiface.mfecommon.utils.n f34557d;

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<q> f34554a = new WeakReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f34555b = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final com.modiface.mfemakeupkit.mfea.c f34558e = new com.modiface.mfemakeupkit.mfea.c();

    /* renamed from: f, reason: collision with root package name */
    private MFEGLFramebuffer f34559f = null;

    /* renamed from: g, reason: collision with root package name */
    private MFEGLFramebuffer f34560g = null;

    /* renamed from: h, reason: collision with root package name */
    private com.modiface.mfemakeupkit.utils.d f34561h = null;

    /* renamed from: i, reason: collision with root package name */
    private AtomicReference<MFEMakeupRenderingParameters> f34562i = new AtomicReference<>(new MFEMakeupRenderingParameters(false));

    /* renamed from: j, reason: collision with root package name */
    private AtomicReference<com.modiface.mfemakeupkit.rendering.r> f34563j = new AtomicReference<>(new com.modiface.mfemakeupkit.rendering.r(null, 0 == true ? 1 : 0));

    /* renamed from: k, reason: collision with root package name */
    private float f34564k = A;

    /* renamed from: l, reason: collision with root package name */
    private final Object f34565l = new Object();

    /* renamed from: m, reason: collision with root package name */
    private final Set<String> f34566m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    private MFEDebugInfo f34567n = new MFEDebugInfo(f34547t);

    public interface o {
        void a(boolean z13, ArrayList<Throwable> arrayList, com.modiface.mfemakeupkit.utils.d dVar, MFEGLFramebuffer mFEGLFramebuffer);
    }

    public interface q {
        void onApplyMakeupWithTrackingDataDone(boolean z13, @NonNull com.modiface.mfemakeupkit.utils.d dVar);

        void onMakeupApplied(boolean z13, ArrayList<Throwable> arrayList, MFEGLFramebuffer mFEGLFramebuffer, MFEGLFramebuffer mFEGLFramebuffer2, MFETrackingData mFETrackingData, @NonNull MFEFoundationMatchStatus mFEFoundationMatchStatus, boolean z14);

        void onRenderingEngineErrors(@NonNull ArrayList<Throwable> arrayList);
    }

    public interface r {
        void a(MFEGLFramebuffer mFEGLFramebuffer, MFEGLFramebuffer mFEGLFramebuffer2, MFETrackingData mFETrackingData);
    }

    public a(Context context, @NonNull MFEMakeupEngine.Region region) {
        AssetManager assets = context.getAssets();
        String[] strArr = new String[0];
        try {
            strArr = assets.list("");
        } catch (IOException e13) {
            Log.e(f34542o, "Failed to list available assets", e13);
        }
        for (String str : strArr) {
            if (f34551x.contains(str)) {
                this.f34566m.add(str);
            }
        }
        String packageName = context.getPackageName();
        com.modiface.mfecommon.utils.n nVar = new com.modiface.mfecommon.utils.n(f34543p);
        this.f34556c = nVar;
        this.f34557d = new com.modiface.mfecommon.utils.n(f34544q);
        nVar.d(new c(this, packageName, region, assets));
    }

    public void finalize() {
        b();
        super.finalize();
    }

    public void c(Runnable runnable) {
        this.f34556c.e(runnable);
    }

    public void d(float f13) {
        synchronized (this.f34565l) {
            this.f34564k = Math.min(1.0f, Math.max(0.0f, f13));
        }
    }

    public void e() {
        this.f34556c.e();
    }

    public void b() {
        this.f34556c.e(new i(this));
        this.f34556c.a();
    }

    public void c(float f13) {
        this.f34556c.d(new com.modiface.mfemakeupkit.rendering.o(this, f13));
    }

    public MFEDebugInfo c() {
        return this.f34567n;
    }

    public void b(float f13) {
        this.f34556c.b((EGLContext) null);
        this.f34555b.set(false);
        this.f34556c.d(new l(this, f13));
    }

    public float d() {
        float f13;
        synchronized (this.f34565l) {
            f13 = this.f34564k;
        }
        return f13;
    }

    public void a(Runnable runnable) {
        this.f34555b.set(true);
        this.f34556c.c(new j(this, runnable));
    }

    public void a(q qVar) {
        this.f34554a = new WeakReference<>(qVar);
    }

    public void b(Runnable runnable) {
        this.f34556c.d(runnable);
    }

    public void a(@NonNull String str) {
        this.f34556c.d(new m(this, str));
    }

    public void b(String str) {
        this.f34556c.d(new h(this, str));
    }

    public void a(Runnable runnable, Runnable runnable2) {
        if (this.f34556c.a(runnable, runnable2) || runnable2 == null) {
            return;
        }
        runnable2.run();
    }

    public boolean a(EGLSurface eGLSurface, boolean z13) {
        return this.f34556c.a(eGLSurface, z13);
    }

    public void a(long j13) {
        this.f34556c.a(j13);
    }

    public void a(MFEMakeupLook mFEMakeupLook, float f13) {
        MFEParticleEffectsLayer.Style style;
        MFEParticleEffectsLayer mFEParticleEffectsLayer = mFEMakeupLook.particleEffectsLayer;
        if (mFEParticleEffectsLayer != null && (style = mFEParticleEffectsLayer.style) != MFEParticleEffectsLayer.Style.None && style != MFEParticleEffectsLayer.Style.Custom && !this.f34566m.contains(f34550w)) {
            throw new FileNotFoundException("Cannot find particle effect assets. Did you forget to include the 'Particles' asset directory?");
        }
        this.f34563j.set(new com.modiface.mfemakeupkit.rendering.r(new com.modiface.mfemakeupkit.mfea.e(mFEMakeupLook), null));
        c(f13);
    }

    public void a() {
        this.f34563j.set(new com.modiface.mfemakeupkit.rendering.r(null, 0 == true ? 1 : 0));
        c(0.0f);
    }

    public void a(MFEMakeupRenderingParameters mFEMakeupRenderingParameters) {
        if (mFEMakeupRenderingParameters == null) {
            mFEMakeupRenderingParameters = new MFEMakeupRenderingParameters(false);
        }
        this.f34562i.set(mFEMakeupRenderingParameters);
        this.f34556c.d(new n(this));
    }

    public void a(@NonNull com.modiface.mfemakeupkit.utils.d dVar, float f13) {
        this.f34556c.a(new p(this, dVar, f13), new com.modiface.mfemakeupkit.rendering.q(this, dVar));
    }

    public void a(@NonNull com.modiface.mfemakeupkit.utils.d dVar, o oVar) {
        ArrayList arrayList = new ArrayList();
        a(new d(this, arrayList, oVar, dVar), new e(this, arrayList, oVar, dVar));
    }

    public com.modiface.mfecommon.utils.c a(@NonNull ArrayList<Throwable> arrayList) {
        com.modiface.mfecommon.utils.c cVar = new com.modiface.mfecommon.utils.c();
        MFEGLFramebuffer mFEGLFramebuffer = this.f34560g;
        if (mFEGLFramebuffer != null && !mFEGLFramebuffer.hasError()) {
            cVar.f34285a = this.f34560g.captureToBitmap();
            if (this.f34560g.hasError()) {
                arrayList.addAll(this.f34560g.getAndClearErrors());
                cVar.f34285a = null;
            }
        }
        MFEGLFramebuffer mFEGLFramebuffer2 = this.f34559f;
        if (mFEGLFramebuffer2 != null && !mFEGLFramebuffer2.hasError()) {
            cVar.f34286b = this.f34559f.captureToBitmap();
            if (this.f34559f.hasError()) {
                arrayList.addAll(this.f34559f.getAndClearErrors());
                cVar.f34286b = null;
            }
        }
        return cVar;
    }

    public void a(r rVar) {
        this.f34556c.d(new f(this, rVar));
    }

    public void a(MFEMakeupTint.Style style) {
        if (this.f34566m.contains(f34549v)) {
            this.f34556c.d(new g(this, style));
            return;
        }
        throw new FileNotFoundException("Cannot find tint effect assets. Did you forget to include the 'Tints' asset directory?");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(ArrayList<Throwable> arrayList, boolean z13, float f13) {
        boolean z14;
        boolean z15;
        float f14;
        com.modiface.mfemakeupkit.mfea.e eVar;
        MFEFoundationMatchStatus mFEFoundationMatchStatus = MFEFoundationMatchStatus.Unavailable;
        boolean z16 = false;
        if (this.f34561h == null) {
            q qVar = this.f34554a.get();
            if (qVar != null) {
                qVar.onMakeupApplied(false, arrayList, this.f34560g, this.f34559f, null, mFEFoundationMatchStatus, z13);
            }
            return false;
        }
        MFEDebugInfo mFEDebugInfo = new MFEDebugInfo(f34545r);
        com.modiface.mfecommon.utils.q qVar2 = new com.modiface.mfecommon.utils.q();
        MFEImage image = this.f34561h.f34672a.getImage();
        MFEGLFramebuffer mFEGLFramebuffer = this.f34559f;
        if (mFEGLFramebuffer == null || mFEGLFramebuffer.hasError()) {
            MFEGLFramebuffer mFEGLFramebuffer2 = this.f34559f;
            if (mFEGLFramebuffer2 != null) {
                mFEGLFramebuffer2.close();
            }
            this.f34559f = new MFEGLFramebuffer(f34552y);
        }
        if (!this.f34559f.hasError()) {
            this.f34559f.generateEmptyWithSize(image.getWidth(), image.getHeight());
        }
        if (this.f34559f.hasError() || !this.f34559f.isValid()) {
            arrayList.addAll(this.f34559f.getAndClearErrors());
            if (!this.f34559f.isValid()) {
                arrayList.add(new Throwable("after render framebuffer is invalid"));
            }
            this.f34559f.close();
            this.f34559f = null;
            z14 = false;
        } else {
            z14 = true;
        }
        MFEGLFramebuffer mFEGLFramebuffer3 = this.f34560g;
        if (mFEGLFramebuffer3 == null || mFEGLFramebuffer3.hasError()) {
            MFEGLFramebuffer mFEGLFramebuffer4 = this.f34560g;
            if (mFEGLFramebuffer4 != null) {
                mFEGLFramebuffer4.close();
            }
            this.f34560g = new MFEGLFramebuffer(f34553z);
        }
        if (!this.f34560g.hasError()) {
            this.f34560g.generateEmptyWithSize(image.getWidth(), image.getHeight());
        }
        if (this.f34560g.hasError() || !this.f34560g.isValid()) {
            arrayList.addAll(this.f34560g.getAndClearErrors());
            if (!this.f34560g.isValid()) {
                arrayList.add(new Throwable("before render framebuffer is invalid"));
            }
            this.f34560g.close();
            this.f34560g = null;
            z14 = false;
        }
        MFESharedGLTexture texture = image.getTexture();
        if (texture.isDeleted()) {
            texture.init(image.getBitmap());
        }
        mFEDebugInfo.addDetailedDebugInfo("initialize buffer time (ms)", qVar2.d());
        qVar2.c();
        if (z14 && this.f34558e.j()) {
            com.modiface.mfemakeupkit.rendering.r rVar = this.f34563j.get();
            MFENativeError mFENativeError = new MFENativeError();
            z15 = rVar.f34604b;
            if (!z15) {
                com.modiface.mfemakeupkit.mfea.c cVar = this.f34558e;
                eVar = rVar.f34603a;
                rVar.f34604b = cVar.d(eVar, this.f34567n, mFENativeError.getNativeState());
            }
            Throwable nativeError = mFENativeError.getNativeError();
            if (nativeError != null) {
                arrayList.add(nativeError);
            }
            MFENativeError mFENativeError2 = new MFENativeError();
            z16 = this.f34558e.f(this.f34559f, this.f34560g, texture.getTextureId(), null, this.f34562i.get(), f13, mFEDebugInfo, mFENativeError2.getNativeState());
            Throwable nativeError2 = mFENativeError2.getNativeError();
            if (nativeError2 != null) {
                arrayList.add(nativeError2);
            }
            if (z16) {
                synchronized (this.f34565l) {
                    f14 = this.f34564k;
                }
                mFEFoundationMatchStatus = this.f34558e.g(f14, mFEDebugInfo);
            }
        } else if (z14) {
            arrayList.add(new Throwable("invalid native state to apply makeup"));
        }
        mFEDebugInfo.addSimpleDebugInfo("makeup applied", z16);
        mFEDebugInfo.addSimpleDebugInfo("total apply makeup time (ms)", qVar2.d());
        this.f34567n.addSubDebugInfo(mFEDebugInfo);
        q qVar3 = this.f34554a.get();
        if (qVar3 != null) {
            qVar3.onMakeupApplied(z16, arrayList, this.f34560g, this.f34559f, this.f34561h.f34672a, mFEFoundationMatchStatus, z13);
        }
        return z16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f13) {
        if (this.f34555b.get()) {
            return;
        }
        a(new ArrayList<>(), true, f13);
    }
}
