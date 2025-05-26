package l7;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import pk.c1;
import pk.v2;

/* loaded from: classes3.dex */
public final class k implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81790a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.l f81791b;

    /* renamed from: c, reason: collision with root package name */
    public m f81792c;

    /* renamed from: d, reason: collision with root package name */
    public final a7.j f81793d;

    /* renamed from: i, reason: collision with root package name */
    public EGLDisplay f81798i;

    /* renamed from: j, reason: collision with root package name */
    public int f81799j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f81800k = -1;

    /* renamed from: e, reason: collision with root package name */
    public g0 f81794e = new g4.u();

    /* renamed from: f, reason: collision with root package name */
    public h0 f81795f = new t5.e(this, 6);

    /* renamed from: g, reason: collision with root package name */
    public f0 f81796g = new a.e(10);

    /* renamed from: h, reason: collision with root package name */
    public Executor f81797h = com.google.common.util.concurrent.r.INSTANCE;

    public k(Context context, a7.l lVar, a7.j jVar) {
        this.f81790a = context;
        this.f81791b = lVar;
        this.f81793d = jVar;
    }

    @Override // l7.i0
    public final void a() {
        m mVar = this.f81792c;
        if (mVar != null) {
            mVar.a();
        }
        try {
            d7.n.d();
        } catch (GlUtil$GlException e13) {
            throw new VideoFrameProcessingException((Throwable) e13);
        }
    }

    @Override // l7.i0
    public final void b(sp2.i iVar, a7.t tVar, long j13) {
        try {
            h(tVar.f1204c, tVar.f1205d);
            this.f81792c.getClass();
            throw null;
        } catch (VideoFrameProcessingException | GlUtil$GlException e13) {
            this.f81797h.execute(new j(this, e13, j13, 0));
        }
    }

    @Override // l7.i0
    public final void c() {
        this.f81795f.m();
    }

    @Override // l7.i0
    public final void d(Executor executor, n nVar) {
        this.f81796g = nVar;
        this.f81797h = executor;
    }

    @Override // l7.i0
    public final void e(g0 g0Var) {
        this.f81794e = g0Var;
        g0Var.D();
    }

    @Override // l7.i0
    public final void f(a7.t tVar) {
        this.f81794e.z(tVar);
        this.f81794e.D();
    }

    @Override // l7.i0
    public final void flush() {
        m mVar = this.f81792c;
        if (mVar != null) {
            mVar.flush();
        }
        this.f81794e.n();
        this.f81794e.D();
    }

    @Override // l7.i0
    public final void g(f fVar) {
        this.f81795f = fVar;
    }

    public final void h(int i13, int i14) {
        if (this.f81798i == null) {
            this.f81798i = d7.n.o();
        }
        EGL14.eglGetCurrentContext();
        if (this.f81799j == -1 || this.f81800k == -1) {
            this.f81799j = i13;
            this.f81800k = i14;
        }
        this.f81791b.getClass();
        if (this.f81792c == null) {
            pk.a0.C(4, "initialCapacity");
            Object[] objArr = new Object[4];
            o0 f13 = o0.f(this.f81799j, this.f81800k);
            int d2 = pk.u0.d(4, 1);
            if (d2 > 4) {
                objArr = Arrays.copyOf(objArr, d2);
            }
            objArr[0] = f13;
            v2 l13 = c1.l(1, objArr);
            v2 v2Var = v2.f100502e;
            a7.j jVar = this.f81793d;
            this.f81792c = m.j(this.f81790a, l13, v2Var, jVar, jVar.f1084c == 1 ? 2 : 0);
        }
    }
}
