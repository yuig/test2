package pg1;

import ac2.m;
import ac2.o1;
import ac2.p1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import bc2.e;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.iq0;
import com.pinterest.api.model.zk0;
import com.pinterest.video.core.view.PinterestVideoView;
import com.pinterest.widget.configuration.k;
import df.j1;
import es.h;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.j;
import nc2.f;
import nx.d0;
import qa2.m1;
import qf1.b0;
import so.jb;
import so.oa;
import u50.r;
import y92.i;
import ye2.o;

/* loaded from: classes5.dex */
public final class c extends CardView implements i, m1, af2.c {
    public static final /* synthetic */ int M = 0;
    public final ArrayList A;
    public final og1.a B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public final ArrayList G;
    public zk0 H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f100097J;
    public String K;
    public final b0 L;

    /* renamed from: h, reason: collision with root package name */
    public o f100098h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f100099i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f100100j;

    /* renamed from: k, reason: collision with root package name */
    public final e f100101k;

    /* renamed from: l, reason: collision with root package name */
    public final m f100102l;

    /* renamed from: m, reason: collision with root package name */
    public final p1 f100103m;

    /* renamed from: n, reason: collision with root package name */
    public final j f100104n;

    /* renamed from: o, reason: collision with root package name */
    public final es.a f100105o;

    /* renamed from: p, reason: collision with root package name */
    public final kv.a f100106p;

    /* renamed from: q, reason: collision with root package name */
    public final kv.c f100107q;

    /* renamed from: r, reason: collision with root package name */
    public final h f100108r;

    /* renamed from: s, reason: collision with root package name */
    public final zf1.e f100109s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f100110t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f100111u;

    /* renamed from: v, reason: collision with root package name */
    public f30 f100112v;

    /* renamed from: w, reason: collision with root package name */
    public r f100113w;

    /* renamed from: x, reason: collision with root package name */
    public final f f100114x;

    /* renamed from: y, reason: collision with root package name */
    public x21.f f100115y;

    /* renamed from: z, reason: collision with root package name */
    public final PinterestVideoView f100116z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, d0 pinalytics) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        int i13 = 1;
        if (!this.f100099i) {
            this.f100099i = true;
            oa oaVar = ((jb) ((d) generatedComponent())).f113483a;
            this.f100101k = (e) oaVar.F7.get();
            this.f100102l = (m) oaVar.C7.get();
            k.x2(oaVar.f113638d);
            this.f100103m = ac2.f.f1945a;
            this.f100104n = oa.g0(oaVar);
            this.f100105o = (es.a) oaVar.P6.get();
            this.f100106p = (kv.a) oaVar.Db.get();
            this.f100107q = (kv.c) oaVar.f113776ke.get();
            this.f100108r = (h) oaVar.f113735i7.get();
        }
        this.f100100j = pinalytics;
        this.f100109s = (zf1.e) ((oa) ((sq1.a) sq1.c.f115039a.getValue())).f114036z8.get();
        this.f100110t = new LinkedHashMap();
        m mVar = this.f100102l;
        if (mVar == null) {
            Intrinsics.r("videoManager");
            throw null;
        }
        this.f100114x = ((o1) mVar).f2005h;
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z13 = bk.f.z(context, pinalytics, sc2.d.video_view_simple, 8);
        z13.z(4);
        z13.e0(bc2.m.GRID);
        z13.g0(nc2.j.AUTOPLAY_MAYBE_WITH_NETWORK);
        z13.O(true);
        z13.P(true);
        z13.M(0.0f);
        z13.K0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        z13.D0 = g0.PIN_STORY_PIN_COVER;
        z13.E0 = u0.PIN_STORY_PIN_VIDEO;
        z13.u0(new a(this, z13));
        this.f100116z = z13;
        this.A = new ArrayList();
        og1.a aVar = new og1.a(context);
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        bs1.c.X0(aVar);
        this.B = aVar;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.K = "";
        this.L = new b0(this, Unit.f80348a, i13);
        setElevation(0.0f);
        t(getResources().getDimension(eo1.c.lego_corner_radius_medium));
        setLayoutDirection(j1.Y0(context) ? 1 : 0);
        addView(z13);
        addView(aVar);
    }

    public static final void x(c cVar, String str, iq0 iq0Var, zk0 zk0Var) {
        cVar.D.add(str);
        cVar.E.add(iq0Var);
        cVar.F.add(zk0Var);
        if ((iq0Var != null ? (float) iq0Var.k().doubleValue() : 0.0f) == 0.0f) {
            cVar.G.add(Float.valueOf(48.0f));
        }
        TextView textView = new TextView(cVar.getContext());
        cVar.A.add(textView);
        cVar.addView(textView);
        if (cVar.C) {
            bs1.c.X0(textView);
        }
    }

    public final void D(View view, float f13, float f14, int i13, int i14) {
        view.setLayoutParams(new FrameLayout.LayoutParams(i13, i14));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        c0.d.m2((FrameLayout.LayoutParams) layoutParams, view.getWidth(), view.getHeight(), this.I, this.f100097J);
        view.setX(f13);
        view.setY(f14);
    }

    public final void L() {
        zk0 zk0Var = this.H;
        if (zk0Var != null) {
            Double k13 = zk0Var.k();
            Intrinsics.checkNotNullExpressionValue(k13, "getXCoord(...)");
            float w13 = c0.d.w(k13.doubleValue(), this.I);
            Double l13 = zk0Var.l();
            Intrinsics.checkNotNullExpressionValue(l13, "getYCoord(...)");
            float w14 = c0.d.w(l13.doubleValue(), this.f100097J);
            Double j13 = zk0Var.j();
            Intrinsics.checkNotNullExpressionValue(j13, "getWidth(...)");
            int x13 = c0.d.x(j13.doubleValue(), this.I);
            Double h10 = zk0Var.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getHeight(...)");
            D(this.f100116z, w13, w14, x13, c0.d.x(h10.doubleValue(), this.f100097J));
        }
    }

    public final es.a T() {
        es.a aVar = this.f100105o;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adFormats");
        throw null;
    }

    public final h X() {
        h hVar = this.f100108r;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("adsCommonDisplay");
        throw null;
    }

    public final j Y() {
        j jVar = this.f100104n;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("adsLibraryExperiments");
        throw null;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f100098h == null) {
            this.f100098h = new o(this);
        }
        return this.f100098h;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f100098h == null) {
            this.f100098h = new o(this);
        }
        return this.f100098h.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PinterestVideoView pinterestVideoView = this.f100116z;
        if (pinterestVideoView.V()) {
            pinterestVideoView.P(true);
        }
    }

    @Override // qa2.m1
    public final void onUserUpdatedMuteState(boolean z13) {
        m mVar = this.f100102l;
        if (mVar == null) {
            Intrinsics.r("videoManager");
            throw null;
        }
        ((o1) mVar).s(this.f100116z, z13);
    }

    @Override // y92.i
    public final void onViewRecycled() {
        PinterestVideoView pinterestVideoView = this.f100116z;
        pinterestVideoView.L0 = false;
        pinterestVideoView.M0 = false;
        pinterestVideoView.L = null;
        pinterestVideoView.M = null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int i13) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i13);
        if (i13 != 0) {
            PinterestVideoView pinterestVideoView = this.f100116z;
            if (pinterestVideoView.V()) {
                pinterestVideoView.P(true);
            }
        }
    }
}
