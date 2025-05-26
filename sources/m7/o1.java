package m7;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;
import pk.v2;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: u, reason: collision with root package name */
    public static final g8.e0 f86329u = new g8.e0(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final a7.b1 f86330a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.e0 f86331b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86332c;

    /* renamed from: d, reason: collision with root package name */
    public final long f86333d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86334e;

    /* renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f86335f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f86336g;

    /* renamed from: h, reason: collision with root package name */
    public final g8.m1 f86337h;

    /* renamed from: i, reason: collision with root package name */
    public final k8.z f86338i;

    /* renamed from: j, reason: collision with root package name */
    public final List f86339j;

    /* renamed from: k, reason: collision with root package name */
    public final g8.e0 f86340k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f86341l;

    /* renamed from: m, reason: collision with root package name */
    public final int f86342m;

    /* renamed from: n, reason: collision with root package name */
    public final int f86343n;

    /* renamed from: o, reason: collision with root package name */
    public final a7.p0 f86344o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f86345p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f86346q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f86347r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f86348s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f86349t;

    public o1(a7.b1 b1Var, g8.e0 e0Var, long j13, long j14, int i13, ExoPlaybackException exoPlaybackException, boolean z13, g8.m1 m1Var, k8.z zVar, List list, g8.e0 e0Var2, boolean z14, int i14, int i15, a7.p0 p0Var, long j15, long j16, long j17, long j18, boolean z15) {
        this.f86330a = b1Var;
        this.f86331b = e0Var;
        this.f86332c = j13;
        this.f86333d = j14;
        this.f86334e = i13;
        this.f86335f = exoPlaybackException;
        this.f86336g = z13;
        this.f86337h = m1Var;
        this.f86338i = zVar;
        this.f86339j = list;
        this.f86340k = e0Var2;
        this.f86341l = z14;
        this.f86342m = i14;
        this.f86343n = i15;
        this.f86344o = p0Var;
        this.f86346q = j15;
        this.f86347r = j16;
        this.f86348s = j17;
        this.f86349t = j18;
        this.f86345p = z15;
    }

    public static o1 k(k8.z zVar) {
        a7.y0 y0Var = a7.b1.f958a;
        g8.e0 e0Var = f86329u;
        return new o1(y0Var, e0Var, -9223372036854775807L, 0L, 1, null, false, g8.m1.f64347d, zVar, v2.f100502e, e0Var, false, 1, 0, a7.p0.f1163d, 0L, 0L, 0L, 0L, false);
    }

    public final o1 a() {
        return new o1(this.f86330a, this.f86331b, this.f86332c, this.f86333d, this.f86334e, this.f86335f, this.f86336g, this.f86337h, this.f86338i, this.f86339j, this.f86340k, this.f86341l, this.f86342m, this.f86343n, this.f86344o, this.f86346q, this.f86347r, l(), SystemClock.elapsedRealtime(), this.f86345p);
    }

    public final o1 b(boolean z13) {
        return new o1(this.f86330a, this.f86331b, this.f86332c, this.f86333d, this.f86334e, this.f86335f, z13, this.f86337h, this.f86338i, this.f86339j, this.f86340k, this.f86341l, this.f86342m, this.f86343n, this.f86344o, this.f86346q, this.f86347r, this.f86348s, this.f86349t, this.f86345p);
    }

    public final o1 c(g8.e0 e0Var) {
        return new o1(this.f86330a, this.f86331b, this.f86332c, this.f86333d, this.f86334e, this.f86335f, this.f86336g, this.f86337h, this.f86338i, this.f86339j, e0Var, this.f86341l, this.f86342m, this.f86343n, this.f86344o, this.f86346q, this.f86347r, this.f86348s, this.f86349t, this.f86345p);
    }

    public final o1 d(g8.e0 e0Var, long j13, long j14, long j15, long j16, g8.m1 m1Var, k8.z zVar, List list) {
        return new o1(this.f86330a, e0Var, j14, j15, this.f86334e, this.f86335f, this.f86336g, m1Var, zVar, list, this.f86340k, this.f86341l, this.f86342m, this.f86343n, this.f86344o, this.f86346q, j16, j13, SystemClock.elapsedRealtime(), this.f86345p);
    }

    public final o1 e(int i13, int i14, boolean z13) {
        return new o1(this.f86330a, this.f86331b, this.f86332c, this.f86333d, this.f86334e, this.f86335f, this.f86336g, this.f86337h, this.f86338i, this.f86339j, this.f86340k, z13, i13, i14, this.f86344o, this.f86346q, this.f86347r, this.f86348s, this.f86349t, this.f86345p);
    }

    public final o1 f(ExoPlaybackException exoPlaybackException) {
        return new o1(this.f86330a, this.f86331b, this.f86332c, this.f86333d, this.f86334e, exoPlaybackException, this.f86336g, this.f86337h, this.f86338i, this.f86339j, this.f86340k, this.f86341l, this.f86342m, this.f86343n, this.f86344o, this.f86346q, this.f86347r, this.f86348s, this.f86349t, this.f86345p);
    }

    public final o1 g(a7.p0 p0Var) {
        return new o1(this.f86330a, this.f86331b, this.f86332c, this.f86333d, this.f86334e, this.f86335f, this.f86336g, this.f86337h, this.f86338i, this.f86339j, this.f86340k, this.f86341l, this.f86342m, this.f86343n, p0Var, this.f86346q, this.f86347r, this.f86348s, this.f86349t, this.f86345p);
    }

    public final o1 h(int i13) {
        return new o1(this.f86330a, this.f86331b, this.f86332c, this.f86333d, i13, this.f86335f, this.f86336g, this.f86337h, this.f86338i, this.f86339j, this.f86340k, this.f86341l, this.f86342m, this.f86343n, this.f86344o, this.f86346q, this.f86347r, this.f86348s, this.f86349t, this.f86345p);
    }

    public final o1 i(boolean z13) {
        return new o1(this.f86330a, this.f86331b, this.f86332c, this.f86333d, this.f86334e, this.f86335f, this.f86336g, this.f86337h, this.f86338i, this.f86339j, this.f86340k, this.f86341l, this.f86342m, this.f86343n, this.f86344o, this.f86346q, this.f86347r, this.f86348s, this.f86349t, z13);
    }

    public final o1 j(a7.b1 b1Var) {
        return new o1(b1Var, this.f86331b, this.f86332c, this.f86333d, this.f86334e, this.f86335f, this.f86336g, this.f86337h, this.f86338i, this.f86339j, this.f86340k, this.f86341l, this.f86342m, this.f86343n, this.f86344o, this.f86346q, this.f86347r, this.f86348s, this.f86349t, this.f86345p);
    }

    public final long l() {
        long j13;
        long j14;
        if (!m()) {
            return this.f86348s;
        }
        do {
            j13 = this.f86349t;
            j14 = this.f86348s;
        } while (j13 != this.f86349t);
        return d7.n0.X(d7.n0.o0(j14) + ((long) ((SystemClock.elapsedRealtime() - j13) * this.f86344o.f1164a)));
    }

    public final boolean m() {
        return this.f86334e == 3 && this.f86341l && this.f86343n == 0;
    }
}
