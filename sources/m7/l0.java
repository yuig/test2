package m7;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import pk.v2;

/* loaded from: classes.dex */
public final class l0 extends a7.h implements ExoPlayer {

    /* renamed from: p0, reason: collision with root package name */
    public static int f86250p0;
    public final i0 A;
    public final j0 B;
    public final c C;
    public final c2 D;
    public final c2 E;
    public final long F;
    public final d7.d G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f86251J;
    public int K;
    public boolean L;
    public boolean M;
    public x1 N;
    public g8.e1 O;
    public y P;
    public a7.r0 Q;
    public a7.l0 R;
    public androidx.media3.common.b S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public SphericalGLSurfaceView W;
    public boolean X;
    public TextureView Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public d7.f0 f86252a0;

    /* renamed from: b, reason: collision with root package name */
    public final int f86253b;

    /* renamed from: b0, reason: collision with root package name */
    public a7.f f86254b0;

    /* renamed from: c, reason: collision with root package name */
    public final k8.z f86255c;

    /* renamed from: c0, reason: collision with root package name */
    public float f86256c0;

    /* renamed from: d, reason: collision with root package name */
    public final a7.r0 f86257d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f86258d0;

    /* renamed from: e, reason: collision with root package name */
    public final a7.o f86259e;

    /* renamed from: e0, reason: collision with root package name */
    public c7.c f86260e0;

    /* renamed from: f, reason: collision with root package name */
    public final Context f86261f;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f86262f0;

    /* renamed from: g, reason: collision with root package name */
    public final a7.v0 f86263g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f86264g0;

    /* renamed from: h, reason: collision with root package name */
    public final h[] f86265h;

    /* renamed from: h0, reason: collision with root package name */
    public final int f86266h0;

    /* renamed from: i, reason: collision with root package name */
    public final h[] f86267i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f86268i0;

    /* renamed from: j, reason: collision with root package name */
    public final k8.y f86269j;

    /* renamed from: j0, reason: collision with root package name */
    public a7.o1 f86270j0;

    /* renamed from: k, reason: collision with root package name */
    public final d7.i0 f86271k;

    /* renamed from: k0, reason: collision with root package name */
    public g7.e f86272k0;

    /* renamed from: l, reason: collision with root package name */
    public final f0 f86273l;

    /* renamed from: l0, reason: collision with root package name */
    public a7.l0 f86274l0;

    /* renamed from: m, reason: collision with root package name */
    public final u0 f86275m;

    /* renamed from: m0, reason: collision with root package name */
    public o1 f86276m0;

    /* renamed from: n, reason: collision with root package name */
    public final v4.f f86277n;

    /* renamed from: n0, reason: collision with root package name */
    public int f86278n0;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArraySet f86279o;

    /* renamed from: o0, reason: collision with root package name */
    public long f86280o0;

    /* renamed from: p, reason: collision with root package name */
    public final a7.z0 f86281p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f86282q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f86283r;

    /* renamed from: s, reason: collision with root package name */
    public final g8.d0 f86284s;

    /* renamed from: t, reason: collision with root package name */
    public final n7.a f86285t;

    /* renamed from: u, reason: collision with root package name */
    public final Looper f86286u;

    /* renamed from: v, reason: collision with root package name */
    public final l8.e f86287v;

    /* renamed from: w, reason: collision with root package name */
    public final long f86288w;

    /* renamed from: x, reason: collision with root package name */
    public final long f86289x;

    /* renamed from: y, reason: collision with root package name */
    public final long f86290y;

    /* renamed from: z, reason: collision with root package name */
    public final d7.g0 f86291z;

    static {
        a7.j0.a("media3.exoplayer");
        f86250p0 = 0;
    }

    public l0(x xVar) {
        int i13 = f86250p0;
        f86250p0 = i13 + 1;
        this.f86253b = i13;
        this.f86259e = new a7.o(1);
        try {
            d7.u.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + d7.n0.f53867b + "]");
            Context context = xVar.f86452a;
            Looper looper = xVar.f86460i;
            this.f86261f = context.getApplicationContext();
            ok.t tVar = xVar.f86459h;
            d7.g0 g0Var = xVar.f86453b;
            this.f86285t = (n7.a) tVar.apply(g0Var);
            this.f86266h0 = xVar.f86461j;
            this.f86254b0 = xVar.f86462k;
            this.Z = xVar.f86463l;
            this.f86258d0 = false;
            this.F = xVar.f86471t;
            i0 i0Var = new i0(this);
            this.A = i0Var;
            this.B = new j0();
            h[] a13 = ((q) xVar.f86454c.get()).a(new Handler(looper), i0Var, i0Var, i0Var, i0Var);
            this.f86265h = a13;
            bf.b.t(a13.length > 0);
            this.f86267i = new h[a13.length];
            int i14 = 0;
            while (true) {
                h[] hVarArr = this.f86267i;
                if (i14 >= hVarArr.length) {
                    break;
                }
                int i15 = this.f86265h[i14].f86171b;
                hVarArr[i14] = null;
                i14++;
            }
            this.f86269j = (k8.y) xVar.f86456e.get();
            this.f86284s = (g8.d0) xVar.f86455d.get();
            this.f86287v = (l8.e) xVar.f86458g.get();
            this.f86283r = xVar.f86464m;
            this.N = xVar.f86465n;
            this.f86288w = xVar.f86466o;
            this.f86289x = xVar.f86467p;
            this.f86290y = xVar.f86468q;
            this.f86286u = looper;
            this.f86291z = g0Var;
            this.f86263g = this;
            this.f86277n = new v4.f(looper, g0Var, new f0(this));
            this.f86279o = new CopyOnWriteArraySet();
            this.f86282q = new ArrayList();
            this.O = new g8.e1();
            this.P = y.f86484b;
            h[] hVarArr2 = this.f86265h;
            this.f86255c = new k8.z(new v1[hVarArr2.length], new k8.t[hVarArr2.length], a7.i1.f1078b, null);
            this.f86281p = new a7.z0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i16 = 0; i16 < 20; i16++) {
                int i17 = iArr[i16];
                bf.b.t(!false);
                sparseBooleanArray.append(i17, true);
            }
            if (this.f86269j.d()) {
                bf.b.t(!false);
                sparseBooleanArray.append(29, true);
            }
            bf.b.t(!false);
            a7.p pVar = new a7.p(sparseBooleanArray);
            this.f86257d = new a7.r0(pVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i18 = 0; i18 < pVar.f1162a.size(); i18++) {
                int a14 = pVar.a(i18);
                bf.b.t(!false);
                sparseBooleanArray2.append(a14, true);
            }
            bf.b.t(!false);
            sparseBooleanArray2.append(4, true);
            bf.b.t(!false);
            sparseBooleanArray2.append(10, true);
            bf.b.t(!false);
            this.Q = new a7.r0(new a7.p(sparseBooleanArray2));
            this.f86271k = this.f86291z.a(this.f86286u, null);
            f0 f0Var = new f0(this);
            this.f86273l = f0Var;
            h1.b bVar = new h1.b(this, 16);
            this.f86276m0 = o1.k(this.f86255c);
            ((n7.c0) this.f86285t).y(this.f86263g, this.f86286u);
            n7.q0 q0Var = new n7.q0(xVar.f86474w);
            u0 u0Var = new u0(this.f86261f, this.f86265h, this.f86267i, this.f86269j, this.f86255c, (w0) xVar.f86457f.get(), this.f86287v, this.H, this.I, this.f86285t, this.N, xVar.f86469r, xVar.f86470s, false, xVar.f86475x, this.f86286u, this.f86291z, f0Var, q0Var, this.P, bVar);
            this.f86275m = u0Var;
            Looper looper2 = u0Var.f86419j;
            this.f86256c0 = 1.0f;
            this.H = 0;
            a7.l0 l0Var = a7.l0.I;
            this.R = l0Var;
            this.f86274l0 = l0Var;
            this.f86278n0 = -1;
            this.f86260e0 = c7.c.f26701b;
            boolean z13 = xVar.f86476y;
            this.f86262f0 = z13;
            this.f86277n.f123982b = z13;
            n7.a aVar = this.f86285t;
            if (aVar instanceof n7.c0) {
                ((n7.c0) aVar).f89399f.f123982b = z13;
            }
            M(aVar);
            this.f86287v.h(new Handler(this.f86286u), this.f86285t);
            this.f86279o.add(this.A);
            if (d7.n0.f53866a >= 31) {
                this.f86291z.a(u0Var.f86419j, null).d(new androidx.fragment.app.e(this.f86261f, this, q0Var, xVar.f86472u));
            }
            d7.d dVar = new d7.d(0, looper2, this.f86286u, this.f86291z, new f0(this));
            this.G = dVar;
            dVar.a(new androidx.activity.d(this, 10));
            c cVar = new c(xVar.f86452a, looper2, xVar.f86460i, this.A, this.f86291z);
            this.C = cVar;
            cVar.d();
            c2 c2Var = new c2(context, looper2, this.f86291z, 0);
            this.D = c2Var;
            c2Var.a();
            c2 c2Var2 = new c2(context, looper2, this.f86291z, 1);
            this.E = c2Var2;
            c2Var2.a();
            a7.n nVar = a7.n.f1147e;
            this.f86270j0 = a7.o1.f1158d;
            this.f86252a0 = d7.f0.f53820c;
            a7.f fVar = this.f86254b0;
            d7.i0 i0Var2 = u0Var.f86417h;
            i0Var2.getClass();
            d7.h0 c13 = d7.i0.c();
            c13.f53827a = i0Var2.f53829a.obtainMessage(31, 0, 0, fVar);
            c13.b();
            x0(1, this.f86254b0, 3);
            x0(2, Integer.valueOf(this.Z), 4);
            x0(2, 0, 5);
            x0(1, Boolean.valueOf(this.f86258d0), 9);
            x0(2, this.B, 7);
            x0(6, this.B, 8);
            x0(-1, Integer.valueOf(this.f86266h0), 16);
            this.f86259e.h();
        } catch (Throwable th3) {
            this.f86259e.h();
            throw th3;
        }
    }

    public static long p0(o1 o1Var) {
        a7.a1 a1Var = new a7.a1();
        a7.z0 z0Var = new a7.z0();
        o1Var.f86330a.h(o1Var.f86331b.f64233a, z0Var);
        long j13 = o1Var.f86332c;
        if (j13 != -9223372036854775807L) {
            return z0Var.f1255e + j13;
        }
        return o1Var.f86330a.n(z0Var.f1253c, a1Var, 0L).f940l;
    }

    public static o1 q0(o1 o1Var, int i13) {
        o1 h10 = o1Var.h(i13);
        return (i13 == 1 || i13 == 4) ? h10.b(false) : h10;
    }

    @Override // a7.v0
    public final void A(boolean z13) {
        L0();
        if (this.I != z13) {
            this.I = z13;
            this.f86275m.f86417h.a(12, z13 ? 1 : 0, 0).b();
            g0 g0Var = new g0(z13, 0);
            v4.f fVar = this.f86277n;
            fVar.j(9, g0Var);
            H0();
            fVar.g();
        }
    }

    public final void A0(SurfaceHolder surfaceHolder) {
        this.X = false;
        this.V = surfaceHolder;
        surfaceHolder.addCallback(this.A);
        Surface surface = this.V.getSurface();
        if (surface == null || !surface.isValid()) {
            t0(0, 0);
        } else {
            Rect surfaceFrame = this.V.getSurfaceFrame();
            t0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // a7.v0
    public final int B() {
        L0();
        if (this.f86276m0.f86330a.q()) {
            return 0;
        }
        o1 o1Var = this.f86276m0;
        return o1Var.f86330a.b(o1Var.f86331b.f64233a);
    }

    public final void B0(boolean z13) {
        L0();
        I0(1, z13);
    }

    @Override // a7.v0
    public final void C(TextureView textureView) {
        L0();
        if (textureView == null || textureView != this.Y) {
            return;
        }
        i0();
    }

    public final void C0(y yVar) {
        L0();
        if (this.P.equals(yVar)) {
            return;
        }
        this.P = yVar;
        this.f86275m.f86417h.b(28, yVar).b();
    }

    @Override // a7.v0
    public final a7.o1 D() {
        L0();
        return this.f86270j0;
    }

    public final void D0(Object obj) {
        Object obj2 = this.T;
        boolean z13 = true;
        boolean z14 = (obj2 == null || obj2 == obj) ? false : true;
        long j13 = z14 ? this.F : -9223372036854775807L;
        u0 u0Var = this.f86275m;
        synchronized (u0Var) {
            if (!u0Var.G && u0Var.f86419j.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                u0Var.f86417h.b(30, new Pair(obj, atomicBoolean)).b();
                if (j13 != -9223372036854775807L) {
                    u0Var.G0(new o0(atomicBoolean, 0), j13);
                    z13 = atomicBoolean.get();
                }
            }
        }
        if (z14) {
            Object obj3 = this.T;
            Surface surface = this.U;
            if (obj3 == surface) {
                surface.release();
                this.U = null;
            }
        }
        this.T = obj;
        if (z13) {
            return;
        }
        G0(ExoPlaybackException.b(new ExoTimeoutException(3), 1003));
    }

    @Override // a7.v0
    public final float E() {
        L0();
        return this.f86256c0;
    }

    public final void E0(SurfaceView surfaceView) {
        L0();
        if (surfaceView instanceof n8.u) {
            w0();
            D0(surfaceView);
            A0(surfaceView.getHolder());
            return;
        }
        boolean z13 = surfaceView instanceof SphericalGLSurfaceView;
        i0 i0Var = this.A;
        if (z13) {
            w0();
            this.W = (SphericalGLSurfaceView) surfaceView;
            r1 k03 = k0(this.B);
            bf.b.t(!k03.f86379f);
            k03.f86376c = 10000;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.W;
            bf.b.t(true ^ k03.f86379f);
            k03.f86377d = sphericalGLSurfaceView;
            k03.b();
            this.W.a(i0Var);
            D0(this.W.d());
            A0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        L0();
        if (holder == null) {
            i0();
            return;
        }
        w0();
        this.X = true;
        this.V = holder;
        holder.addCallback(i0Var);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            D0(null);
            t0(0, 0);
        } else {
            D0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            t0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void F0(TextureView textureView) {
        L0();
        if (textureView == null) {
            i0();
            return;
        }
        w0();
        this.Y = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            d7.u.g("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.A);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            D0(null);
            t0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            D0(surface);
            this.U = surface;
            t0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // a7.v0
    public final int G() {
        L0();
        if (g()) {
            return this.f86276m0.f86331b.f64235c;
        }
        return -1;
    }

    public final void G0(ExoPlaybackException exoPlaybackException) {
        this.f86277n.j(31, new c3.e(5));
        o1 o1Var = this.f86276m0;
        o1 c13 = o1Var.c(o1Var.f86331b);
        c13.f86346q = c13.f86348s;
        c13.f86347r = 0L;
        o1 q03 = q0(c13, 1);
        if (exoPlaybackException != null) {
            q03 = q03.f(exoPlaybackException);
        }
        o1 o1Var2 = q03;
        this.f86251J++;
        d7.i0 i0Var = this.f86275m.f86417h;
        i0Var.getClass();
        d7.h0 c14 = d7.i0.c();
        c14.f53827a = i0Var.f53829a.obtainMessage(6);
        c14.b();
        J0(o1Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // a7.v0
    public final void H(float f13) {
        L0();
        final float h10 = d7.n0.h(f13, 0.0f, 1.0f);
        if (this.f86256c0 == h10) {
            return;
        }
        this.f86256c0 = h10;
        this.f86275m.f86417h.b(32, Float.valueOf(h10)).b();
        this.f86277n.m(22, new d7.r() { // from class: m7.c0
            @Override // d7.r
            /* renamed from: invoke */
            public final void mo0invoke(Object obj) {
                ((a7.t0) obj).W3(h10);
            }
        });
    }

    public final void H0() {
        a7.r0 r0Var = this.Q;
        int i13 = d7.n0.f53866a;
        a7.v0 v0Var = this.f86263g;
        boolean g13 = v0Var.g();
        boolean K = v0Var.K();
        boolean F = v0Var.F();
        boolean p13 = v0Var.p();
        boolean Y = v0Var.Y();
        boolean t13 = v0Var.t();
        boolean q13 = v0Var.v().q();
        a7.q0 q0Var = new a7.q0();
        a7.p pVar = this.f86257d.f1197a;
        a7.o oVar = q0Var.f1194a;
        oVar.getClass();
        boolean z13 = false;
        for (int i14 = 0; i14 < pVar.f1162a.size(); i14++) {
            oVar.a(pVar.a(i14));
        }
        boolean z14 = !g13;
        q0Var.a(4, z14);
        q0Var.a(5, K && !g13);
        q0Var.a(6, F && !g13);
        q0Var.a(7, !q13 && (F || !Y || K) && !g13);
        q0Var.a(8, p13 && !g13);
        q0Var.a(9, !q13 && (p13 || (Y && t13)) && !g13);
        q0Var.a(10, z14);
        q0Var.a(11, K && !g13);
        if (K && !g13) {
            z13 = true;
        }
        q0Var.a(12, z13);
        a7.r0 r0Var2 = new a7.r0(oVar.e());
        this.Q = r0Var2;
        if (r0Var2.equals(r0Var)) {
            return;
        }
        this.f86277n.j(13, new f0(this));
    }

    @Override // a7.v0
    public final long I() {
        L0();
        return l0(this.f86276m0);
    }

    public final void I0(int i13, boolean z13) {
        o1 o1Var = this.f86276m0;
        int i14 = o1Var.f86343n;
        int i15 = (i14 != 1 || z13) ? 0 : 1;
        if (o1Var.f86341l == z13 && i14 == i15 && o1Var.f86342m == i13) {
            return;
        }
        this.f86251J++;
        if (o1Var.f86345p) {
            o1Var = o1Var.a();
        }
        o1 e13 = o1Var.e(i13, i15, z13);
        this.f86275m.f86417h.a(1, z13 ? 1 : 0, i13 | (i15 << 4)).b();
        J0(e13, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // a7.v0
    public final long J() {
        L0();
        if (!g()) {
            return S();
        }
        o1 o1Var = this.f86276m0;
        return o1Var.f86340k.equals(o1Var.f86331b) ? d7.n0.o0(this.f86276m0.f86346q) : getDuration();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J0(final m7.o1 r41, int r42, boolean r43, int r44, long r45, int r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.l0.J0(m7.o1, int, boolean, int, long, int, boolean):void");
    }

    public final void K0() {
        int L = L();
        c2 c2Var = this.E;
        c2 c2Var2 = this.D;
        if (L != 1) {
            if (L == 2 || L == 3) {
                L0();
                c2Var2.b(z() && !this.f86276m0.f86345p);
                c2Var.b(z());
                return;
            } else if (L != 4) {
                throw new IllegalStateException();
            }
        }
        c2Var2.b(false);
        c2Var.b(false);
    }

    @Override // a7.v0
    public final int L() {
        L0();
        return this.f86276m0.f86334e;
    }

    public final void L0() {
        this.f86259e.d();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f86286u;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i13 = d7.n0.f53866a;
            Locale locale = Locale.US;
            String m13 = a.a.m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f86262f0) {
                throw new IllegalStateException(m13);
            }
            d7.u.h("ExoPlayerImpl", m13, this.f86264g0 ? null : new IllegalStateException());
            this.f86264g0 = true;
        }
    }

    @Override // a7.v0
    public final void M(a7.t0 t0Var) {
        t0Var.getClass();
        this.f86277n.a(t0Var);
    }

    @Override // a7.v0
    public final int N() {
        L0();
        int n03 = n0(this.f86276m0);
        if (n03 == -1) {
            return 0;
        }
        return n03;
    }

    @Override // a7.v0
    public final void O(int i13) {
        L0();
        if (this.H != i13) {
            this.H = i13;
            this.f86275m.f86417h.a(11, i13, 0).b();
            e0 e0Var = new e0(i13, 0);
            v4.f fVar = this.f86277n;
            fVar.j(8, e0Var);
            H0();
            fVar.g();
        }
    }

    @Override // a7.v0
    public final void P(SurfaceView surfaceView) {
        L0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        L0();
        if (holder == null || holder != this.V) {
            return;
        }
        i0();
    }

    @Override // a7.v0
    public final int Q() {
        L0();
        return this.H;
    }

    @Override // a7.v0
    public final boolean R() {
        L0();
        return this.I;
    }

    @Override // a7.v0
    public final long S() {
        L0();
        if (this.f86276m0.f86330a.q()) {
            return this.f86280o0;
        }
        o1 o1Var = this.f86276m0;
        if (o1Var.f86340k.f64236d != o1Var.f86331b.f64236d) {
            return d7.n0.o0(o1Var.f86330a.n(N(), this.f1053a, 0L).f941m);
        }
        long j13 = o1Var.f86346q;
        if (this.f86276m0.f86340k.b()) {
            o1 o1Var2 = this.f86276m0;
            a7.z0 h10 = o1Var2.f86330a.h(o1Var2.f86340k.f64233a, this.f86281p);
            long d2 = h10.d(this.f86276m0.f86340k.f64234b);
            j13 = d2 == Long.MIN_VALUE ? h10.f1254d : d2;
        }
        o1 o1Var3 = this.f86276m0;
        a7.b1 b1Var = o1Var3.f86330a;
        Object obj = o1Var3.f86340k.f64233a;
        a7.z0 z0Var = this.f86281p;
        b1Var.h(obj, z0Var);
        return d7.n0.o0(j13 + z0Var.f1255e);
    }

    @Override // a7.v0
    public final a7.l0 V() {
        L0();
        return this.R;
    }

    @Override // a7.v0
    public final long X() {
        L0();
        return d7.n0.o0(m0(this.f86276m0));
    }

    @Override // a7.v0
    public final void a() {
        String str;
        StringBuilder sb3 = new StringBuilder("Release ");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" [AndroidXMedia3/1.6.1] [");
        sb3.append(d7.n0.f53867b);
        sb3.append("] [");
        HashSet hashSet = a7.j0.f1089a;
        synchronized (a7.j0.class) {
            str = a7.j0.f1090b;
        }
        sb3.append(str);
        sb3.append("]");
        d7.u.f("ExoPlayerImpl", sb3.toString());
        L0();
        this.C.d();
        this.D.b(false);
        this.E.b(false);
        final u0 u0Var = this.f86275m;
        synchronized (u0Var) {
            if (!u0Var.G && u0Var.f86419j.getThread().isAlive()) {
                u0Var.f86417h.f(7);
                u0Var.G0(new ok.g0() { // from class: m7.m0
                    @Override // ok.g0
                    public final Object get() {
                        return Boolean.valueOf(u0.this.G);
                    }
                }, u0Var.f86432w);
                boolean z13 = u0Var.G;
                if (!z13) {
                    this.f86277n.m(10, new a.e(11));
                }
            }
        }
        this.f86277n.k();
        this.f86271k.f53829a.removeCallbacksAndMessages(null);
        this.f86287v.b(this.f86285t);
        o1 o1Var = this.f86276m0;
        if (o1Var.f86345p) {
            this.f86276m0 = o1Var.a();
        }
        o1 q03 = q0(this.f86276m0, 1);
        this.f86276m0 = q03;
        o1 c13 = q03.c(q03.f86331b);
        this.f86276m0 = c13;
        c13.f86346q = c13.f86348s;
        this.f86276m0.f86347r = 0L;
        n7.c0 c0Var = (n7.c0) this.f86285t;
        d7.i0 i0Var = c0Var.f89401h;
        bf.b.w(i0Var);
        i0Var.d(new u0.n(c0Var, 14));
        w0();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.f86260e0 = c7.c.f26701b;
        this.f86268i0 = true;
    }

    @Override // a7.v0
    public final void b() {
        L0();
        o1 o1Var = this.f86276m0;
        if (o1Var.f86334e != 1) {
            return;
        }
        o1 f13 = o1Var.f(null);
        o1 q03 = q0(f13, f13.f86330a.q() ? 4 : 2);
        this.f86251J++;
        d7.i0 i0Var = this.f86275m.f86417h;
        i0Var.getClass();
        d7.h0 c13 = d7.i0.c();
        c13.f53827a = i0Var.f53829a.obtainMessage(29);
        c13.b();
        J0(q03, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // a7.h
    public final void b0(int i13, long j13, boolean z13) {
        L0();
        if (i13 == -1) {
            return;
        }
        bf.b.i(i13 >= 0);
        a7.b1 b1Var = this.f86276m0.f86330a;
        if (b1Var.q() || i13 < b1Var.p()) {
            n7.c0 c0Var = (n7.c0) this.f86285t;
            if (!c0Var.f89402i) {
                n7.b r13 = c0Var.r();
                c0Var.f89402i = true;
                c0Var.x(r13, -1, new com.google.firebase.messaging.a0(r13, 7));
            }
            this.f86251J++;
            if (g()) {
                d7.u.g("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                r0 r0Var = new r0(this.f86276m0);
                r0Var.a(1);
                l0 l0Var = this.f86273l.f86151a;
                l0Var.getClass();
                l0Var.f86271k.d(new w2.c(16, l0Var, r0Var));
                return;
            }
            o1 o1Var = this.f86276m0;
            int i14 = o1Var.f86334e;
            if (i14 == 3 || (i14 == 4 && !b1Var.q())) {
                o1Var = q0(this.f86276m0, 2);
            }
            int N = N();
            o1 r03 = r0(o1Var, b1Var, s0(b1Var, i13, j13));
            this.f86275m.f86417h.b(3, new t0(b1Var, i13, d7.n0.X(j13))).b();
            J0(r03, 0, true, 1, m0(r03), N, z13);
        }
    }

    @Override // a7.v0
    public final void c(a7.p0 p0Var) {
        L0();
        if (this.f86276m0.f86344o.equals(p0Var)) {
            return;
        }
        o1 g13 = this.f86276m0.g(p0Var);
        this.f86251J++;
        this.f86275m.f86417h.b(4, p0Var).b();
        J0(g13, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // a7.v0
    public final a7.p0 d() {
        L0();
        return this.f86276m0.f86344o;
    }

    public final void f0(n7.c cVar) {
        cVar.getClass();
        n7.c0 c0Var = (n7.c0) this.f86285t;
        c0Var.getClass();
        c0Var.f89399f.a(cVar);
    }

    @Override // a7.v0
    public final boolean g() {
        L0();
        return this.f86276m0.f86331b.b();
    }

    public final ArrayList g0(int i13, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            l1 l1Var = new l1((g8.a) arrayList.get(i14), this.f86283r);
            arrayList2.add(l1Var);
            k0 k0Var = new k0(l1Var.f86293b, l1Var.f86292a);
            this.f86282q.add(i14 + i13, k0Var);
        }
        this.O = this.O.a(i13, arrayList2.size());
        return arrayList2;
    }

    @Override // a7.v0
    public final long getDuration() {
        L0();
        if (!g()) {
            return Z();
        }
        o1 o1Var = this.f86276m0;
        g8.e0 e0Var = o1Var.f86331b;
        a7.b1 b1Var = o1Var.f86330a;
        Object obj = e0Var.f64233a;
        a7.z0 z0Var = this.f86281p;
        b1Var.h(obj, z0Var);
        return d7.n0.o0(z0Var.a(e0Var.f64234b, e0Var.f64235c));
    }

    @Override // a7.v0
    public final long h() {
        L0();
        return d7.n0.o0(this.f86276m0.f86347r);
    }

    public final a7.l0 h0() {
        a7.b1 v13 = v();
        if (v13.q()) {
            return this.f86274l0;
        }
        a7.i0 i0Var = v13.n(N(), this.f1053a, 0L).f931c;
        a7.k0 a13 = this.f86274l0.a();
        a7.l0 l0Var = i0Var.f1075d;
        if (l0Var != null) {
            CharSequence charSequence = l0Var.f1117a;
            if (charSequence != null) {
                a13.f1091a = charSequence;
            }
            CharSequence charSequence2 = l0Var.f1118b;
            if (charSequence2 != null) {
                a13.f1092b = charSequence2;
            }
            CharSequence charSequence3 = l0Var.f1119c;
            if (charSequence3 != null) {
                a13.f1093c = charSequence3;
            }
            CharSequence charSequence4 = l0Var.f1120d;
            if (charSequence4 != null) {
                a13.f1094d = charSequence4;
            }
            CharSequence charSequence5 = l0Var.f1121e;
            if (charSequence5 != null) {
                a13.f1095e = charSequence5;
            }
            CharSequence charSequence6 = l0Var.f1122f;
            if (charSequence6 != null) {
                a13.f1096f = charSequence6;
            }
            CharSequence charSequence7 = l0Var.f1123g;
            if (charSequence7 != null) {
                a13.f1097g = charSequence7;
            }
            Long l13 = l0Var.f1124h;
            if (l13 != null) {
                a13.h(l13);
            }
            byte[] bArr = l0Var.f1125i;
            Uri uri = l0Var.f1127k;
            if (uri != null || bArr != null) {
                a13.f1101k = uri;
                a13.e(bArr, l0Var.f1126j);
            }
            Integer num = l0Var.f1128l;
            if (num != null) {
                a13.f1102l = num;
            }
            Integer num2 = l0Var.f1129m;
            if (num2 != null) {
                a13.f1103m = num2;
            }
            Integer num3 = l0Var.f1130n;
            if (num3 != null) {
                a13.f1104n = num3;
            }
            Boolean bool = l0Var.f1131o;
            if (bool != null) {
                a13.f1105o = bool;
            }
            Boolean bool2 = l0Var.f1132p;
            if (bool2 != null) {
                a13.f1106p = bool2;
            }
            Integer num4 = l0Var.f1133q;
            if (num4 != null) {
                a13.f1107q = num4;
            }
            Integer num5 = l0Var.f1134r;
            if (num5 != null) {
                a13.f1107q = num5;
            }
            Integer num6 = l0Var.f1135s;
            if (num6 != null) {
                a13.f1108r = num6;
            }
            Integer num7 = l0Var.f1136t;
            if (num7 != null) {
                a13.f1109s = num7;
            }
            Integer num8 = l0Var.f1137u;
            if (num8 != null) {
                a13.f1110t = num8;
            }
            Integer num9 = l0Var.f1138v;
            if (num9 != null) {
                a13.f1111u = num9;
            }
            Integer num10 = l0Var.f1139w;
            if (num10 != null) {
                a13.f1112v = num10;
            }
            CharSequence charSequence8 = l0Var.f1140x;
            if (charSequence8 != null) {
                a13.f1113w = charSequence8;
            }
            CharSequence charSequence9 = l0Var.f1141y;
            if (charSequence9 != null) {
                a13.f1114x = charSequence9;
            }
            CharSequence charSequence10 = l0Var.f1142z;
            if (charSequence10 != null) {
                a13.f1115y = charSequence10;
            }
            Integer num11 = l0Var.A;
            if (num11 != null) {
                a13.f1116z = num11;
            }
            Integer num12 = l0Var.B;
            if (num12 != null) {
                a13.A = num12;
            }
            CharSequence charSequence11 = l0Var.C;
            if (charSequence11 != null) {
                a13.B = charSequence11;
            }
            CharSequence charSequence12 = l0Var.D;
            if (charSequence12 != null) {
                a13.C = charSequence12;
            }
            CharSequence charSequence13 = l0Var.E;
            if (charSequence13 != null) {
                a13.D = charSequence13;
            }
            Integer num13 = l0Var.F;
            if (num13 != null) {
                a13.E = num13;
            }
            Bundle bundle = l0Var.G;
            if (bundle != null) {
                a13.F = bundle;
            }
            pk.c1 c1Var = l0Var.H;
            if (!c1Var.isEmpty()) {
                a13.p(c1Var);
            }
        }
        return new a7.l0(a13);
    }

    public final void i0() {
        L0();
        w0();
        D0(null);
        t0(0, 0);
    }

    @Override // a7.v0
    public final void j(a7.t0 t0Var) {
        L0();
        t0Var.getClass();
        this.f86277n.l(t0Var);
    }

    public final ArrayList j0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            arrayList.add(this.f86284s.d((a7.i0) list.get(i13)));
        }
        return arrayList;
    }

    public final r1 k0(q1 q1Var) {
        int n03 = n0(this.f86276m0);
        a7.b1 b1Var = this.f86276m0.f86330a;
        if (n03 == -1) {
            n03 = 0;
        }
        u0 u0Var = this.f86275m;
        return new r1(u0Var, q1Var, b1Var, n03, u0Var.f86419j);
    }

    public final long l0(o1 o1Var) {
        if (!o1Var.f86331b.b()) {
            return d7.n0.o0(m0(o1Var));
        }
        Object obj = o1Var.f86331b.f64233a;
        a7.b1 b1Var = o1Var.f86330a;
        a7.z0 z0Var = this.f86281p;
        b1Var.h(obj, z0Var);
        long j13 = o1Var.f86332c;
        return j13 == -9223372036854775807L ? b1Var.n(n0(o1Var), this.f1053a, 0L).a() : z0Var.i() + d7.n0.o0(j13);
    }

    public final long m0(o1 o1Var) {
        if (o1Var.f86330a.q()) {
            return d7.n0.X(this.f86280o0);
        }
        long l13 = o1Var.f86345p ? o1Var.l() : o1Var.f86348s;
        if (o1Var.f86331b.b()) {
            return l13;
        }
        a7.b1 b1Var = o1Var.f86330a;
        Object obj = o1Var.f86331b.f64233a;
        a7.z0 z0Var = this.f86281p;
        b1Var.h(obj, z0Var);
        return l13 + z0Var.f1255e;
    }

    @Override // a7.v0
    public final PlaybackException n() {
        L0();
        return this.f86276m0.f86335f;
    }

    public final int n0(o1 o1Var) {
        if (o1Var.f86330a.q()) {
            return this.f86278n0;
        }
        return o1Var.f86330a.h(o1Var.f86331b.f64233a, this.f86281p).f1253c;
    }

    @Override // a7.v0
    public final a7.i1 o() {
        L0();
        return this.f86276m0.f86338i.f78587d;
    }

    public final Pair o0(a7.b1 b1Var, t1 t1Var, int i13, long j13) {
        if (b1Var.q() || t1Var.q()) {
            boolean z13 = !b1Var.q() && t1Var.q();
            return s0(t1Var, z13 ? -1 : i13, z13 ? -9223372036854775807L : j13);
        }
        Pair j14 = b1Var.j(this.f1053a, this.f86281p, i13, d7.n0.X(j13));
        Object obj = j14.first;
        if (t1Var.b(obj) != -1) {
            return j14;
        }
        int X = u0.X(this.f1053a, this.f86281p, this.H, this.I, obj, b1Var, t1Var);
        if (X == -1) {
            return s0(t1Var, -1, -9223372036854775807L);
        }
        a7.a1 a1Var = this.f1053a;
        t1Var.n(X, a1Var, 0L);
        return s0(t1Var, X, d7.n0.o0(a1Var.f940l));
    }

    @Override // a7.v0
    public final int q() {
        L0();
        if (g()) {
            return this.f86276m0.f86331b.f64234b;
        }
        return -1;
    }

    public final o1 r0(o1 o1Var, a7.b1 b1Var, Pair pair) {
        List list;
        bf.b.i(b1Var.q() || pair != null);
        a7.b1 b1Var2 = o1Var.f86330a;
        long l03 = l0(o1Var);
        o1 j13 = o1Var.j(b1Var);
        if (b1Var.q()) {
            g8.e0 e0Var = o1.f86329u;
            long X = d7.n0.X(this.f86280o0);
            o1 c13 = j13.d(e0Var, X, X, X, 0L, g8.m1.f64347d, this.f86255c, v2.f100502e).c(e0Var);
            c13.f86346q = c13.f86348s;
            return c13;
        }
        Object obj = j13.f86331b.f64233a;
        boolean z13 = !obj.equals(pair.first);
        g8.e0 e0Var2 = z13 ? new g8.e0(pair.first) : j13.f86331b;
        long longValue = ((Long) pair.second).longValue();
        long X2 = d7.n0.X(l03);
        if (!b1Var2.q()) {
            X2 -= b1Var2.h(obj, this.f86281p).f1255e;
        }
        if (z13 || longValue < X2) {
            bf.b.t(!e0Var2.b());
            g8.m1 m1Var = z13 ? g8.m1.f64347d : j13.f86337h;
            k8.z zVar = z13 ? this.f86255c : j13.f86338i;
            if (z13) {
                pk.y0 y0Var = pk.c1.f100372b;
                list = v2.f100502e;
            } else {
                list = j13.f86339j;
            }
            o1 c14 = j13.d(e0Var2, longValue, longValue, longValue, 0L, m1Var, zVar, list).c(e0Var2);
            c14.f86346q = longValue;
            return c14;
        }
        if (longValue != X2) {
            bf.b.t(!e0Var2.b());
            long max = Math.max(0L, j13.f86347r - (longValue - X2));
            long j14 = j13.f86346q;
            if (j13.f86340k.equals(j13.f86331b)) {
                j14 = longValue + max;
            }
            o1 d2 = j13.d(e0Var2, longValue, longValue, longValue, max, j13.f86337h, j13.f86338i, j13.f86339j);
            d2.f86346q = j14;
            return d2;
        }
        int b13 = b1Var.b(j13.f86340k.f64233a);
        if (b13 != -1 && b1Var.g(b13, this.f86281p, false).f1253c == b1Var.h(e0Var2.f64233a, this.f86281p).f1253c) {
            return j13;
        }
        b1Var.h(e0Var2.f64233a, this.f86281p);
        long a13 = e0Var2.b() ? this.f86281p.a(e0Var2.f64234b, e0Var2.f64235c) : this.f86281p.f1254d;
        o1 c15 = j13.d(e0Var2, j13.f86348s, j13.f86348s, j13.f86333d, a13 - j13.f86348s, j13.f86337h, j13.f86338i, j13.f86339j).c(e0Var2);
        c15.f86346q = a13;
        return c15;
    }

    public final Pair s0(a7.b1 b1Var, int i13, long j13) {
        if (b1Var.q()) {
            this.f86278n0 = i13;
            if (j13 == -9223372036854775807L) {
                j13 = 0;
            }
            this.f86280o0 = j13;
            return null;
        }
        if (i13 == -1 || i13 >= b1Var.p()) {
            i13 = b1Var.a(this.I);
            j13 = b1Var.n(i13, this.f1053a, 0L).a();
        }
        return b1Var.j(this.f1053a, this.f86281p, i13, d7.n0.X(j13));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        L0();
        x0(4, imageOutput, 15);
    }

    @Override // a7.v0
    public final void stop() {
        L0();
        G0(null);
        v2 v2Var = v2.f100502e;
        long j13 = this.f86276m0.f86348s;
        this.f86260e0 = new c7.c(v2Var);
    }

    public final void t0(final int i13, final int i14) {
        d7.f0 f0Var = this.f86252a0;
        if (i13 == f0Var.f53821a && i14 == f0Var.a()) {
            return;
        }
        this.f86252a0 = new d7.f0(i13, i14);
        this.f86277n.m(24, new d7.r() { // from class: m7.d0
            @Override // d7.r
            /* renamed from: invoke */
            public final void mo0invoke(Object obj) {
                ((a7.t0) obj).A2(i13, i14);
            }
        });
        x0(2, new d7.f0(i13, i14), 14);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ExoPlayerImpl("), this.f86253b, ")");
    }

    @Override // a7.v0
    public final int u() {
        L0();
        return this.f86276m0.f86343n;
    }

    public final void u0(n7.c cVar) {
        L0();
        cVar.getClass();
        ((n7.c0) this.f86285t).f89399f.l(cVar);
    }

    @Override // a7.v0
    public final a7.b1 v() {
        L0();
        return this.f86276m0.f86330a;
    }

    public final void v0(int i13) {
        for (int i14 = i13 - 1; i14 >= 0; i14--) {
            this.f86282q.remove(i14);
        }
        g8.e1 e1Var = this.O;
        int[] iArr = e1Var.f64239b;
        int[] iArr2 = new int[iArr.length - i13];
        int i15 = 0;
        for (int i16 = 0; i16 < iArr.length; i16++) {
            int i17 = iArr[i16];
            if (i17 < 0 || i17 >= i13) {
                int i18 = i16 - i15;
                if (i17 >= 0) {
                    i17 -= i13;
                }
                iArr2[i18] = i17;
            } else {
                i15++;
            }
        }
        this.O = new g8.e1(iArr2, new Random(e1Var.f64238a.nextLong()));
    }

    @Override // a7.v0
    public final Looper w() {
        return this.f86286u;
    }

    public final void w0() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.W;
        i0 i0Var = this.A;
        if (sphericalGLSurfaceView != null) {
            r1 k03 = k0(this.B);
            bf.b.t(!k03.f86379f);
            k03.f86376c = 10000;
            bf.b.t(!k03.f86379f);
            k03.f86377d = null;
            k03.b();
            this.W.f18858a.remove(i0Var);
            this.W = null;
        }
        TextureView textureView = this.Y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != i0Var) {
                d7.u.g("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Y.setSurfaceTextureListener(null);
            }
            this.Y = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(i0Var);
            this.V = null;
        }
    }

    public final void x0(int i13, Object obj, int i14) {
        for (h hVar : this.f86265h) {
            if (i13 == -1 || hVar.f86171b == i13) {
                r1 k03 = k0(hVar);
                bf.b.t(!k03.f86379f);
                k03.f86376c = i14;
                bf.b.t(!k03.f86379f);
                k03.f86377d = obj;
                k03.b();
            }
        }
        for (h hVar2 : this.f86267i) {
            if (hVar2 != null && (i13 == -1 || hVar2.f86171b == i13)) {
                r1 k04 = k0(hVar2);
                bf.b.t(!k04.f86379f);
                k04.f86376c = i14;
                bf.b.t(!k04.f86379f);
                k04.f86377d = obj;
                k04.b();
            }
        }
    }

    public final void y0(a7.f fVar, boolean z13) {
        L0();
        if (this.f86268i0) {
            return;
        }
        boolean equals = Objects.equals(this.f86254b0, fVar);
        v4.f fVar2 = this.f86277n;
        if (!equals) {
            this.f86254b0 = fVar;
            x0(1, fVar, 3);
            fVar2.j(20, new com.google.firebase.messaging.a0(fVar, 3));
        }
        a7.f fVar3 = this.f86254b0;
        d7.i0 i0Var = this.f86275m.f86417h;
        i0Var.getClass();
        d7.h0 c13 = d7.i0.c();
        c13.f53827a = i0Var.f53829a.obtainMessage(31, z13 ? 1 : 0, 0, fVar3);
        c13.b();
        fVar2.g();
    }

    @Override // a7.v0
    public final boolean z() {
        L0();
        return this.f86276m0.f86341l;
    }

    public final void z0(ArrayList arrayList, boolean z13) {
        L0();
        int n03 = n0(this.f86276m0);
        long X = X();
        this.f86251J++;
        ArrayList arrayList2 = this.f86282q;
        if (!arrayList2.isEmpty()) {
            v0(arrayList2.size());
        }
        ArrayList g03 = g0(0, arrayList);
        t1 t1Var = new t1(arrayList2, this.O);
        boolean q13 = t1Var.q();
        int i13 = t1Var.f86394d;
        if (!q13 && -1 >= i13) {
            throw new IllegalSeekPositionException();
        }
        if (z13) {
            n03 = t1Var.a(this.I);
            X = -9223372036854775807L;
        }
        int i14 = n03;
        o1 r03 = r0(this.f86276m0, t1Var, s0(t1Var, i14, X));
        int i15 = r03.f86334e;
        if (i14 != -1 && i15 != 1) {
            i15 = (t1Var.q() || i14 >= i13) ? 4 : 2;
        }
        o1 q03 = q0(r03, i15);
        this.f86275m.f86417h.b(17, new q0(g03, this.O, i14, d7.n0.X(X))).b();
        J0(q03, 0, (this.f86276m0.f86331b.f64233a.equals(q03.f86331b.f64233a) || this.f86276m0.f86330a.q()) ? false : true, 4, m0(q03), -1, false);
    }
}
