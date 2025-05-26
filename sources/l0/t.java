package l0;

import a.z0;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.j0;
import c0.f1;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import kh2.m0;

/* loaded from: classes2.dex */
public final class t implements f1 {

    /* renamed from: b, reason: collision with root package name */
    public final Surface f81283b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81284c;

    /* renamed from: d, reason: collision with root package name */
    public final Size f81285d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f81286e;

    /* renamed from: f, reason: collision with root package name */
    public p5.a f81287f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f81288g;

    /* renamed from: j, reason: collision with root package name */
    public final r4.l f81291j;

    /* renamed from: k, reason: collision with root package name */
    public r4.i f81292k;

    /* renamed from: a, reason: collision with root package name */
    public final Object f81282a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f81289h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f81290i = false;

    public t(Surface surface, int i13, Size size, c0.h hVar, c0.h hVar2) {
        float[] fArr = new float[16];
        this.f81286e = fArr;
        this.f81283b = surface;
        this.f81284c = i13;
        this.f81285d = size;
        a(fArr, new float[16], hVar);
        a(new float[16], new float[16], hVar2);
        this.f81291j = com.bumptech.glide.d.L(new z0(this, 14));
    }

    public static void a(float[] fArr, float[] fArr2, c0.h hVar) {
        Matrix.setIdentityM(fArr, 0);
        if (hVar == null) {
            return;
        }
        gh0.b.n0(fArr);
        int i13 = hVar.f24245d;
        gh0.b.m0(fArr, i13);
        boolean z13 = hVar.f24246e;
        if (z13) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size g13 = e0.u.g(i13, hVar.f24242a);
        float f13 = 0;
        android.graphics.Matrix a13 = e0.u.a(i13, new RectF(f13, f13, r6.getWidth(), r6.getHeight()), new RectF(f13, f13, g13.getWidth(), g13.getHeight()), z13);
        RectF rectF = new RectF(hVar.f24243b);
        a13.mapRect(rectF);
        float width = rectF.left / g13.getWidth();
        float height = ((g13.getHeight() - rectF.height()) - rectF.top) / g13.getHeight();
        float width2 = rectF.width() / g13.getWidth();
        float height2 = rectF.height() / g13.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, width2, height2, 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        gh0.b.n0(fArr2);
        j0 j0Var = hVar.f24244c;
        if (j0Var != null) {
            com.bumptech.glide.d.v("Camera has no transform.", j0Var.m());
            gh0.b.m0(fArr2, j0Var.g().b());
            if (j0Var.g().d() == 0) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final Surface c(f0.g gVar, h0.d dVar) {
        boolean z13;
        synchronized (this.f81282a) {
            this.f81288g = gVar;
            this.f81287f = dVar;
            z13 = this.f81289h;
        }
        if (z13) {
            d();
        }
        return this.f81283b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f81282a) {
            try {
                if (!this.f81290i) {
                    this.f81290i = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f81292k.b(null);
    }

    public final void d() {
        Executor executor;
        p5.a aVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f81282a) {
            try {
                if (this.f81288g != null && (aVar = this.f81287f) != null) {
                    if (!this.f81290i) {
                        atomicReference.set(aVar);
                        executor = this.f81288g;
                        this.f81289h = false;
                    }
                    executor = null;
                }
                this.f81289h = true;
                executor = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new e(3, this, atomicReference));
            } catch (RejectedExecutionException e13) {
                if (m0.G0(3, "SurfaceOutputImpl")) {
                    Log.d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e13);
                }
            }
        }
    }
}
