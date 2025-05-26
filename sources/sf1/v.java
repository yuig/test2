package sf1;

import androidx.media3.common.PlaybackException;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.r3;
import kh2.c3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends ic2.d {

    /* renamed from: c, reason: collision with root package name */
    public final PinterestVideoView f112762c;

    /* renamed from: d, reason: collision with root package name */
    public final bc2.q f112763d;

    /* renamed from: e, reason: collision with root package name */
    public r1 f112764e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f112765f;

    /* renamed from: g, reason: collision with root package name */
    public final String f112766g;

    /* renamed from: h, reason: collision with root package name */
    public final String f112767h;

    /* renamed from: i, reason: collision with root package name */
    public final double f112768i;

    /* renamed from: j, reason: collision with root package name */
    public final double f112769j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f112770k;

    /* renamed from: l, reason: collision with root package name */
    public final nx.d0 f112771l;

    /* renamed from: m, reason: collision with root package name */
    public final nx.d1 f112772m;

    /* renamed from: n, reason: collision with root package name */
    public r3 f112773n;

    /* renamed from: o, reason: collision with root package name */
    public cc2.g f112774o;

    /* renamed from: p, reason: collision with root package name */
    public long f112775p;

    /* renamed from: q, reason: collision with root package name */
    public long f112776q;

    /* renamed from: r, reason: collision with root package name */
    public long f112777r;

    /* renamed from: s, reason: collision with root package name */
    public final long f112778s;

    /* renamed from: t, reason: collision with root package name */
    public final cc2.c f112779t;

    /* renamed from: u, reason: collision with root package name */
    public final h32.i0 f112780u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f112781v;

    public v(PinterestVideoView videoView, bc2.q videoTracks, r1 r1Var, m60.w eventManager, String pinId, String pageIndex, double d2, double d13, boolean z13, nx.d0 d0Var, nx.d1 trackingParamAttacher) {
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        this.f112762c = videoView;
        this.f112763d = videoTracks;
        this.f112764e = r1Var;
        this.f112765f = eventManager;
        this.f112766g = pinId;
        this.f112767h = pageIndex;
        this.f112768i = d2;
        this.f112769j = d13;
        this.f112770k = z13;
        this.f112771l = d0Var;
        this.f112772m = trackingParamAttacher;
        this.f112773n = r3.LOADING;
        this.f112774o = cc2.g.INVALID_QUARTILE;
        this.f112775p = (long) d2;
        this.f112778s = System.currentTimeMillis();
        h32.i0 p13 = d0Var != null ? d0Var.p() : null;
        h32.h0 h0Var = p13 != null ? new h32.h0(p13) : new h32.h0();
        h0Var.f67047f = videoView.E0;
        h0Var.f67045d = videoView.D0;
        this.f112780u = h0Var.a();
        this.f112779t = d0Var != null ? new cc2.c(d0Var, videoView.C0, trackingParamAttacher) : null;
    }

    @Override // n7.c
    public final void F(n7.b eventTime, PlaybackException error) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(error, "error");
        String str = this.f112766g;
        new oy.g0(str).i();
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder D = ep.b.D(str, "-");
        D.append(this.f112767h);
        new oy.o0(D.toString(), currentTimeMillis - this.f112778s).i();
        this.f112765f.d(new g(str));
    }

    @Override // ic2.d
    public final void X(long j13) {
        n7.m0 c03 = this.f112762c.J0.c0();
        long j14 = c03 != null ? c03.N[3] : 0L;
        r1 r1Var = this.f112764e;
        bc2.q qVar = this.f112763d;
        if (r1Var != null) {
            r1Var.a(j13 / qVar.f22674c, j14);
        }
        this.f112774o = oe.f.Y0(this.f112768i, this.f112769j, 100.0f, j13, this.f112780u, this.f112773n, this.f112779t, this.f112774o, this.f112766g, qVar.f22673b.f22665b);
    }

    public final void f0(double d2, long j13) {
        long currentTimeMillis = System.currentTimeMillis();
        long j14 = this.f112777r;
        oe.f.X0(this.f112766g, this.f112779t, this.f112769j, this.f112763d.f22673b.f22665b, j14, currentTimeMillis, j13, d2, this.f112773n, 100.0f, this.f112780u);
        this.f112777r = currentTimeMillis;
    }

    @Override // ic2.d
    public final void j(n7.b eventTime, boolean z13, int i13) {
        r3 r3Var;
        j1 j1Var;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        r1 r1Var = this.f112764e;
        if (r1Var != null) {
            s1 s1Var = r1Var.f112694a;
            s1Var.getClass();
            if (z13 && i13 == 4 && (j1Var = s1Var.f112746x.f112788a.G) != null) {
                j1.e1(j1Var);
            }
        }
        bc2.q qVar = this.f112763d;
        long j13 = qVar.f22674c;
        double d2 = this.f112768i;
        if (i13 != 3) {
            if (i13 != 4) {
                return;
            }
            this.f112774o = oe.f.Y0(d2, this.f112769j, 100.0f, j13, this.f112780u, this.f112773n, this.f112779t, this.f112774o, this.f112766g, qVar.f22673b.f22665b);
            f0(d2 + j13, this.f112775p);
            return;
        }
        String str = this.f112766g;
        h32.v0 v0Var = null;
        new oy.f0(str, null, 14).i();
        new oy.p0(str + "-" + this.f112767h, System.currentTimeMillis() - this.f112778s).i();
        if (z13) {
            r3Var = r3.PLAYING;
        } else {
            a7.v0 v0Var2 = this.f112762c.f18946k;
            long X = v0Var2 != null ? v0Var2.X() : 0L;
            r3 r3Var2 = this.f112773n;
            r3 r3Var3 = r3.PLAYING;
            boolean z14 = r3Var2 == r3Var3 && this.f112776q > j13;
            boolean z15 = r3Var2 != r3Var3 && this.f112775p == 0 && X == 0;
            if (!z14 && !z15) {
                f0((X != 0 ? X : this.f112776q) + d2, this.f112775p);
                this.f112775p = ((long) d2) + X;
            }
            r3Var = r3.PAUSED;
        }
        this.f112773n = r3Var;
        this.f112765f.d(new g(str));
        if (!z13 || this.f112781v) {
            return;
        }
        nx.d0 d0Var = this.f112771l;
        if (d0Var != null) {
            h32.g0 g0Var = h32.g0.MODAL_PIN;
            String c13 = this.f112772m.c(str);
            if (c13 != null) {
                v0Var = new h32.v0();
                v0Var.G = c13;
            }
            c3.g0(d0Var, str, this.f112770k, g0Var, v0Var);
        }
        this.f112781v = true;
    }

    @Override // ic2.d, n7.c
    public final void x(n7.b eventTime, a7.u0 oldPosition, a7.u0 newPosition, int i13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        super.x(eventTime, oldPosition, newPosition, i13);
        this.f112776q = oldPosition.f1213f;
    }
}
