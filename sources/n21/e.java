package n21;

import a.z0;
import a8.v;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.media3.ui.h0;
import bc2.k;
import bc2.m;
import bc2.q;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pincarouselads.view.a0;
import com.pinterest.feature.pincarouselads.view.z;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.video.view.SimplePlayerControlView;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.x1;
import kh2.c3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.q0;
import nx.d0;
import w01.e0;
import yk1.n;

/* loaded from: classes5.dex */
public final class e extends yk1.b implements l21.f {

    /* renamed from: a, reason: collision with root package name */
    public x1 f88986a;

    /* renamed from: b, reason: collision with root package name */
    public q f88987b;

    /* renamed from: c, reason: collision with root package name */
    public int f88988c;

    /* renamed from: d, reason: collision with root package name */
    public Long f88989d;

    /* renamed from: e, reason: collision with root package name */
    public String f88990e;

    /* renamed from: f, reason: collision with root package name */
    public String f88991f;

    /* renamed from: g, reason: collision with root package name */
    public Long f88992g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f88993h;

    /* renamed from: i, reason: collision with root package name */
    public Long f88994i;

    /* renamed from: j, reason: collision with root package name */
    public uk1.d f88995j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f88996k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f88997l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f88998m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f88999n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f89000o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f89001p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f89002q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f89003r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f89004s;

    public e() {
        super(0);
        this.f88988c = -1;
        this.f88989d = -1L;
    }

    public final void B3(int i13, String str, String str2, Long l13, Long l14, boolean z13, Long l15) {
        this.f88992g = l14;
        this.f88989d = l13;
        this.f88988c = i13;
        this.f88990e = str;
        this.f88991f = str2;
        this.f88993h = z13;
        this.f88994i = l15;
    }

    public final void D3(q qVar) {
        this.f88987b = qVar;
    }

    @Override // l21.f
    public final x1 T() {
        Long f13 = ep.b.f(1000000L);
        Long l13 = this.f88989d;
        Long valueOf = l13 != null ? Long.valueOf(l13.longValue()) : null;
        Long l14 = this.f88992g;
        Long valueOf2 = l14 != null ? Long.valueOf(l14.longValue()) : null;
        x1 x1Var = new x1(this.f88991f, null, null, this.f88990e, f13, null, null, Short.valueOf((short) this.f88988c), valueOf2, valueOf, this.f88994i);
        this.f88986a = x1Var;
        return x1Var;
    }

    @Override // l21.f
    public final x1 m0() {
        x1 x1Var;
        x1 source = this.f88986a;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            x1Var = new x1(source.f67380a, source.f67381b, source.f67382c, source.f67383d, source.f67384e, Long.valueOf(System.currentTimeMillis() * 1000000), source.f67386g, source.f67387h, source.f67388i, source.f67389j, source.f67390k);
        } else {
            x1Var = null;
        }
        this.f88986a = null;
        return x1Var;
    }

    @Override // yk1.b
    public final void onActivate() {
        ((l21.j) getView()).getClass();
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        int A;
        e listener = this;
        l21.j view = (l21.j) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        q videoTracks = listener.f88987b;
        if (!isBound() || videoTracks == null) {
            return;
        }
        a0 a0Var = (a0) ((l21.j) getView());
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        a0Var.f47364i = listener;
        l21.j jVar = (l21.j) getView();
        uk1.d dVar = listener.f88995j;
        if (dVar == null) {
            Intrinsics.r("presenterPinalytics");
            throw null;
        }
        d0 pinalytics = dVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(pinalytics, "getPinalytics(...)");
        String str = listener.f88991f;
        String uid = String.valueOf(listener.f88989d);
        boolean z13 = listener.f88993h;
        boolean z14 = listener.f88996k;
        boolean z15 = listener.f88997l;
        boolean z16 = listener.f88998m;
        boolean z17 = listener.f88999n;
        boolean z18 = listener.f89000o;
        boolean z19 = listener.f89001p;
        boolean z23 = listener.f89002q;
        boolean z24 = listener.f89003r;
        boolean z25 = listener.f89004s;
        a0 a0Var2 = (a0) jVar;
        a0Var2.getClass();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(uid, "videoSlotUid");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        if (!Intrinsics.d(a0Var2.f47365j, videoTracks)) {
            a0Var2.f47366k = str;
            a0Var2.f47365j = videoTracks;
            int i13 = (z18 && z13) ? 1 : 0;
            Integer[] numArr = PinterestVideoView.f52749c1;
            Context context = a0Var2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            PinterestVideoView z26 = bk.f.z(context, pinalytics, sy1.b.video_view_one_tap_ad, 8);
            z26.N0 = new e0(a0Var2, 10);
            GestaltIcon gestaltIcon = (GestaltIcon) z26.findViewById(h0.exo_play);
            if (gestaltIcon != null) {
                gestaltIcon.g2(new dv0.n(z24, 22));
            }
            GestaltIcon gestaltIcon2 = (GestaltIcon) z26.findViewById(h0.exo_pause);
            if (gestaltIcon2 != null) {
                gestaltIcon2.g2(new dv0.n(z24, 23));
            }
            a0Var2.f47367l = z26;
            m mVar = a0Var2.f47360e;
            z26.e0(mVar);
            z26.C0.b("is_closeup_video", String.valueOf(mVar.isCloseup()));
            z26.D0 = g0.BROWSER;
            z26.O(true);
            i0 p13 = pinalytics.p();
            d4 d4Var = p13 != null ? p13.f67081a : null;
            a4 a4Var = p13 != null ? p13.f67082b : null;
            Intrinsics.checkNotNullParameter(uid, "uid");
            Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
            oc2.i.g(z26, new k(uid, videoTracks.a(), d4Var, a4Var, videoTracks, null), new ec2.g(0, bc2.j.OTHER, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL), 4);
            z26.M(a0Var2.f47358c);
            z26.G0 = a0Var2.f47359d;
            z26.z(i13 ^ 1);
            z26.P(z14);
            z26.t0(z15);
            z26.R(z16);
            z26.R = z16;
            z26.f52797y = z23;
            SimplePlayerControlView simplePlayerControlView = z26.F;
            if (simplePlayerControlView != null) {
                simplePlayerControlView.s(z23);
            }
            if (z18) {
                a0Var2.b(pinalytics, f1.RENDER);
            }
            z26.u0(new z(z18, a0Var2, pinalytics));
            SimplePlayerControlView simplePlayerControlView2 = z26.F;
            v vVar = a0Var2.f47362g;
            if (vVar != null && simplePlayerControlView2 != null) {
                z0 listener2 = new z0(vVar, 10);
                Intrinsics.checkNotNullParameter(listener2, "listener");
                simplePlayerControlView2.f52792o0 = listener2;
            }
            if (z17 || z18 || z19) {
                View.OnClickListener onClickListener = a0Var2.f47361f;
                if (onClickListener != null && simplePlayerControlView2 != null) {
                    simplePlayerControlView2.setOnClickListener(onClickListener);
                }
                z26.setClickable(z17 || z19);
                boolean z27 = z17 || z19;
                bf.b.w(z26.f18945j);
                z26.f18955t = z27;
                z26.G();
            }
            if (!z24) {
                if (z26.f18950o != 0) {
                    z26.f18950o = 0;
                    z26.F();
                }
                z26.A(false);
            }
            if (z25) {
                z26.g0(nc2.j.AUTOPLAY_MAYBE_WITH_NETWORK);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            Unit unit = Unit.f80348a;
            a0Var2.addView(z26, layoutParams);
            View view2 = new View(a0Var2.getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            if (i13 != 0) {
                Context context2 = a0Var2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                A = bs1.c.A(context2, q0.pinterest_grid_bg);
            } else {
                Context context3 = a0Var2.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                A = bs1.c.A(context3, eo1.b.color_themed_transparent);
            }
            a0Var2.setBackgroundColor(A);
            a0Var2.addView(view2, layoutParams2);
            listener = this;
        }
        String str2 = listener.f88991f;
        if (str2 != null) {
            boolean z28 = listener.f88997l;
            uk1.d dVar2 = listener.f88995j;
            if (dVar2 == null) {
                Intrinsics.r("presenterPinalytics");
                throw null;
            }
            d0 d0Var = dVar2.f122379a;
            Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
            c3.g0(d0Var, str2, z28, null, null);
        }
    }

    @Override // yk1.b
    public final void onDeactivate() {
        ((l21.j) getView()).getClass();
    }

    public final void p3(boolean z13) {
        this.f88997l = z13;
    }

    public final void q3(boolean z13) {
        this.f88996k = z13;
    }

    public final void r3(uk1.d presenterPinalytics) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f88995j = presenterPinalytics;
    }

    public final void s3(boolean z13) {
        this.f89000o = z13;
    }

    public final void t3(boolean z13) {
        this.f89004s = z13;
    }

    public final void u3(boolean z13) {
        this.f89002q = z13;
    }

    public final void v3(boolean z13) {
        this.f89003r = z13;
    }

    public final void w3(boolean z13) {
        this.f88998m = z13;
    }

    public final void x3(boolean z13) {
        this.f88999n = z13;
    }

    public final void z3(boolean z13) {
        this.f89001p = z13;
    }
}
