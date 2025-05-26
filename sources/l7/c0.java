package l7;

import a7.l1;
import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class c0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81740a;

    /* renamed from: d, reason: collision with root package name */
    public final EGLDisplay f81743d;

    /* renamed from: e, reason: collision with root package name */
    public final EGLContext f81744e;

    /* renamed from: f, reason: collision with root package name */
    public final EGLSurface f81745f;

    /* renamed from: g, reason: collision with root package name */
    public final a7.j f81746g;

    /* renamed from: h, reason: collision with root package name */
    public final z0 f81747h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f81748i;

    /* renamed from: j, reason: collision with root package name */
    public final l1 f81749j;

    /* renamed from: l, reason: collision with root package name */
    public final v0 f81751l;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f81753n;

    /* renamed from: o, reason: collision with root package name */
    public int f81754o;

    /* renamed from: p, reason: collision with root package name */
    public int f81755p;

    /* renamed from: q, reason: collision with root package name */
    public m f81756q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f81757r;

    /* renamed from: t, reason: collision with root package name */
    public d7.f0 f81759t;

    /* renamed from: u, reason: collision with root package name */
    public r f81760u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f81761v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f81762w;

    /* renamed from: x, reason: collision with root package name */
    public a7.x0 f81763x;

    /* renamed from: y, reason: collision with root package name */
    public EGLSurface f81764y;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f81741b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f81742c = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final int f81752m = 0;

    /* renamed from: s, reason: collision with root package name */
    public g0 f81758s = new g4.u();

    /* renamed from: k, reason: collision with root package name */
    public final ConcurrentLinkedQueue f81750k = new ConcurrentLinkedQueue();

    public c0(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, a7.j jVar, z0 z0Var, Executor executor, l1 l1Var, boolean z13) {
        this.f81740a = context;
        this.f81743d = eGLDisplay;
        this.f81744e = eGLContext;
        this.f81745f = eGLSurface;
        this.f81746g = jVar;
        this.f81747h = z0Var;
        this.f81748i = executor;
        this.f81749j = l1Var;
        this.f81753n = z13;
        this.f81751l = new v0(a7.j.g(jVar), 0);
        int i13 = 0 ^ 1;
        long[] jArr = new long[Integer.bitCount(i13) != 1 ? Integer.highestOneBit(i13 - 1) << 1 : i13];
        int i14 = 0 ^ 1;
        long[] jArr2 = new long[Integer.bitCount(i14) != 1 ? Integer.highestOneBit(i14 - 1) << 1 : i14];
    }

    @Override // l7.i0
    public final void a() {
        this.f81747h.g();
        m mVar = this.f81756q;
        if (mVar != null) {
            mVar.a();
        }
        try {
            this.f81751l.b();
            d7.n.m(this.f81743d, this.f81764y);
            d7.n.d();
        } catch (GlUtil$GlException e13) {
            throw new VideoFrameProcessingException((Throwable) e13);
        }
    }

    @Override // l7.i0
    public final void b(sp2.i iVar, a7.t tVar, long j13) {
        this.f81747h.g();
        this.f81748i.execute(new b0(this, j13, 0));
        if (this.f81753n) {
            i(iVar, tVar, j13, j13 * 1000);
        } else {
            this.f81750k.add(Pair.create(tVar, Long.valueOf(j13)));
        }
        this.f81758s.D();
    }

    @Override // l7.i0
    public final void c() {
        this.f81747h.g();
        if (!this.f81750k.isEmpty()) {
            bf.b.t(!this.f81753n);
            this.f81757r = true;
        } else {
            r rVar = this.f81760u;
            rVar.getClass();
            rVar.f81849a.c();
            this.f81757r = false;
        }
    }

    @Override // l7.i0
    public final void d(Executor executor, n nVar) {
        throw new UnsupportedOperationException();
    }

    @Override // l7.i0
    public final void e(g0 g0Var) {
        this.f81747h.g();
        this.f81758s = g0Var;
        g0Var.D();
    }

    @Override // l7.i0
    public final void f(a7.t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // l7.i0
    public final void flush() {
        this.f81747h.g();
        this.f81750k.clear();
        this.f81757r = false;
        m mVar = this.f81756q;
        if (mVar != null) {
            mVar.flush();
        }
        this.f81758s.n();
        this.f81758s.D();
    }

    @Override // l7.i0
    public final void g(f fVar) {
        throw new UnsupportedOperationException();
    }

    public final boolean h(sp2.i iVar, int i13, int i14) {
        int[] iArr;
        int[] iArr2;
        boolean z13 = (this.f81754o == i13 && this.f81755p == i14 && this.f81759t != null) ? false : true;
        ArrayList arrayList = this.f81741b;
        if (z13) {
            this.f81754o = i13;
            this.f81755p = i14;
            d7.f0 c13 = n0.c(i13, i14, arrayList);
            if (!Objects.equals(this.f81759t, c13)) {
                this.f81759t = c13;
                this.f81748i.execute(new w2.c(11, this, c13));
            }
        }
        this.f81759t.getClass();
        a7.x0 x0Var = this.f81763x;
        if (x0Var == null) {
            bf.b.t(this.f81764y == null);
            m mVar = this.f81756q;
            if (mVar != null) {
                mVar.a();
                this.f81756q = null;
            }
            d7.u.g("FinalShaderWrapper", "Output surface and size not set, dropping frame.");
            return false;
        }
        EGLSurface eGLSurface = this.f81764y;
        a7.j jVar = this.f81746g;
        if (eGLSurface == null) {
            int i15 = jVar.f1084c;
            iVar.getClass();
            int[] iArr3 = d7.n.f53865e;
            if (i15 == 3 || i15 == 10) {
                iArr = iArr3;
                iArr2 = d7.n.f53861a;
            } else {
                if (i15 != 7 && i15 != 6) {
                    throw new IllegalArgumentException(a.a.d("Unsupported color transfer: ", i15));
                }
                iArr2 = d7.n.f53862b;
                if (i15 == 6) {
                    if (d7.n0.f53866a < 33 || !d7.n.q("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        throw new GlUtil$GlException("BT.2020 PQ OpenGL output isn't supported.");
                    }
                    iArr = d7.n.f53863c;
                } else {
                    if (!d7.n.q("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        throw new GlUtil$GlException("BT.2020 HLG OpenGL output isn't supported.");
                    }
                    iArr = d7.n.f53864d;
                }
            }
            EGLDisplay eGLDisplay = this.f81743d;
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, d7.n.p(eGLDisplay, iArr2), x0Var.f1240a, iArr, 0);
            d7.n.c("Error creating a new EGL surface");
            this.f81764y = eglCreateWindowSurface;
        }
        m mVar2 = this.f81756q;
        if (mVar2 != null && (this.f81762w || z13 || this.f81761v)) {
            mVar2.a();
            this.f81756q = null;
            this.f81762w = false;
            this.f81761v = false;
        }
        if (this.f81756q == null) {
            pk.x0 x0Var2 = new pk.x0(4);
            x0Var2.b(arrayList);
            x0Var2.e(o0.f(x0Var.f1241b, x0Var.f1242c));
            m j13 = m.j(this.f81740a, x0Var2.i(), this.f81742c, jVar, this.f81752m);
            d7.f0 c14 = n0.c(this.f81754o, this.f81755p, j13.f81821i);
            a7.x0 x0Var3 = this.f81763x;
            if (x0Var3 != null) {
                bf.b.t(c14.f53821a == x0Var3.f1241b);
                bf.b.t(c14.f53822b == x0Var3.f1242c);
            }
            this.f81756q = j13;
            this.f81762w = false;
        }
        return true;
    }

    public final void i(sp2.i iVar, a7.t tVar, long j13, long j14) {
        if (j14 != -2) {
            try {
            } catch (VideoFrameProcessingException e13) {
                e = e13;
                this.f81748i.execute(new j(this, e, j13, 1));
                this.f81758s.z(tVar);
                return;
            } catch (GlUtil$GlException e14) {
                e = e14;
                this.f81748i.execute(new j(this, e, j13, 1));
                this.f81758s.z(tVar);
                return;
            }
            if (h(iVar, tVar.f1204c, tVar.f1205d)) {
                if (this.f81763x != null) {
                    j(tVar, j13, j14);
                }
                this.f81758s.z(tVar);
                return;
            }
        }
        this.f81758s.z(tVar);
    }

    public final void j(a7.t tVar, long j13, long j14) {
        EGLSurface eGLSurface = this.f81764y;
        eGLSurface.getClass();
        a7.x0 x0Var = this.f81763x;
        x0Var.getClass();
        m mVar = this.f81756q;
        mVar.getClass();
        EGLDisplay eGLDisplay = this.f81743d;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f81744e);
        d7.n.c("Error making context current");
        d7.n.n(0, x0Var.f1241b, x0Var.f1242c);
        d7.n.f();
        mVar.h(tVar.f1202a, j13);
        if (j14 == -1) {
            j14 = System.nanoTime();
        } else if (j14 == -3) {
            bf.b.t(j13 != -9223372036854775807L);
            j14 = 1000 * j13;
        }
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j14);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        g.a();
    }
}
