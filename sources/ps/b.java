package ps;

import a7.u0;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.video.core.view.PinterestVideoView;
import df.j1;
import h32.h0;
import h32.i0;
import h32.r3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n7.m0;
import nx.d0;
import nx.d1;
import nx.z0;

/* loaded from: classes3.dex */
public final class b extends ic2.d {

    /* renamed from: c, reason: collision with root package name */
    public final f30 f101208c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f101209d;

    /* renamed from: e, reason: collision with root package name */
    public final PinterestVideoView f101210e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f101211f;

    /* renamed from: g, reason: collision with root package name */
    public final Function0 f101212g;

    /* renamed from: h, reason: collision with root package name */
    public final double f101213h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f101214i;

    /* renamed from: j, reason: collision with root package name */
    public final String f101215j;

    /* renamed from: k, reason: collision with root package name */
    public final cc2.c f101216k;

    /* renamed from: l, reason: collision with root package name */
    public r3 f101217l;

    /* renamed from: m, reason: collision with root package name */
    public cc2.g f101218m;

    /* renamed from: n, reason: collision with root package name */
    public long f101219n;

    /* renamed from: o, reason: collision with root package name */
    public long f101220o;

    /* renamed from: p, reason: collision with root package name */
    public float f101221p;

    /* renamed from: q, reason: collision with root package name */
    public final double f101222q;

    public b(f30 pin, d0 pinalytics, PinterestVideoView videoView, Function1 onAudibleStateChanged, Function0 onStateChangedToPlaying) {
        String v13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(videoView, "videoView");
        Intrinsics.checkNotNullParameter(onAudibleStateChanged, "onAudibleStateChanged");
        Intrinsics.checkNotNullParameter(onStateChangedToPlaying, "onStateChangedToPlaying");
        this.f101208c = pin;
        this.f101209d = pinalytics;
        this.f101210e = videoView;
        this.f101211f = onAudibleStateChanged;
        this.f101212g = onStateChangedToPlaying;
        double intValue = (pin.v6() != null ? r10.u() : 0).intValue() * 5000;
        dl0 v63 = pin.v6();
        double parseDouble = intValue + ((v63 == null || (v13 = v63.v()) == null) ? 0.0d : Double.parseDouble(v13));
        this.f101213h = parseDouble;
        this.f101214i = parseDouble > 0.0d;
        dl0 v64 = pin.v6();
        qg1.l lVar = new qg1.l(v64 != null ? v64.t() : null, false);
        bc2.k kVar = videoView.L;
        String str = kVar != null ? kVar.f22663g : null;
        this.f101215j = str == null ? "" : str;
        String z43 = pin.z4();
        z0 z0Var = videoView.C0;
        j1.s1(z0Var, "view_object_image_signature", z43);
        Unit unit = Unit.f80348a;
        d1 d1Var = videoView.f52758m0;
        if (d1Var == null) {
            Intrinsics.r("trackingParamAttacher");
            throw null;
        }
        this.f101216k = new cc2.c(pinalytics, z0Var, d1Var);
        this.f101217l = r3.LOADING;
        this.f101218m = cc2.g.INVALID_QUARTILE;
        this.f101222q = lVar.f103851d.f103847a;
    }

    @Override // ic2.d
    public final void X(long j13) {
        if (this.f101214i) {
            h0(j13);
        }
    }

    @Override // ic2.d
    public final void e0(float f13, qc2.c viewability, boolean z13, boolean z14, long j13) {
        Intrinsics.checkNotNullParameter(viewability, "viewability");
        super.e0(f13, viewability, z13, z14, j13);
        this.f101221p = f13;
    }

    public final i0 f0() {
        i0 p13 = this.f101209d.p();
        h0 h0Var = p13 != null ? new h0(p13) : new h0();
        PinterestVideoView pinterestVideoView = this.f101210e;
        h0Var.f67047f = pinterestVideoView.E0;
        h0Var.f67045d = pinterestVideoView.D0;
        return h0Var.a();
    }

    public final void g0(double d2, long j13) {
        if (this.f101214i) {
            long currentTimeMillis = System.currentTimeMillis();
            String uid = this.f101208c.getUid();
            long j14 = this.f101219n;
            r3 r3Var = this.f101217l;
            float f13 = this.f101221p;
            i0 f03 = f0();
            Intrinsics.f(uid);
            oe.f.X0(uid, this.f101216k, this.f101213h, this.f101215j, j14, currentTimeMillis, j13, d2, r3Var, f13, f03);
            this.f101219n = currentTimeMillis;
        }
    }

    public final void h0(long j13) {
        String uid = this.f101208c.getUid();
        cc2.g gVar = this.f101218m;
        float f13 = this.f101221p;
        r3 r3Var = this.f101217l;
        i0 f03 = f0();
        Intrinsics.f(uid);
        this.f101218m = oe.f.Y0(0.0d, this.f101213h, f13, j13, f03, r3Var, this.f101216k, gVar, uid, this.f101215j);
    }

    @Override // ic2.d
    public final void j(n7.b eventTime, boolean z13, int i13) {
        r3 r3Var;
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        if (z13 && i13 == 3) {
            this.f101212g.invoke();
        }
        if (i13 == 3) {
            if (z13) {
                r3Var = r3.PLAYING;
            } else {
                m0 c03 = this.f101210e.J0.c0();
                Long valueOf = c03 != null ? Long.valueOf(c03.N[3]) : null;
                g0(valueOf != null ? valueOf.longValue() : 0.0d, this.f101220o);
                this.f101220o = valueOf != null ? valueOf.longValue() : 0L;
                r3Var = r3.PAUSED;
            }
            this.f101217l = r3Var;
        }
    }

    @Override // ic2.d
    public final void o(boolean z13, long j13) {
        this.f101211f.invoke(Boolean.valueOf(z13));
    }

    @Override // ic2.d, n7.c
    public final void x(n7.b eventTime, u0 oldPosition, u0 newPosition, int i13) {
        Intrinsics.checkNotNullParameter(eventTime, "eventTime");
        Intrinsics.checkNotNullParameter(oldPosition, "oldPosition");
        Intrinsics.checkNotNullParameter(newPosition, "newPosition");
        super.x(eventTime, oldPosition, newPosition, i13);
        if (i13 == 0) {
            double d2 = this.f101222q;
            long j13 = (long) d2;
            h0(j13);
            g0(d2, this.f101220o);
            g0(0.0d, j13);
            this.f101220o = 0L;
        }
    }
}
