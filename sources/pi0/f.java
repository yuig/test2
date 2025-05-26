package pi0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.q2;
import ao2.j0;
import com.pinterest.feature.qcm.analytics.AdsQcmAnalytics$QcmCandidatePayload;
import com.pinterest.gestalt.divider.GestaltDivider;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import h32.c1;
import h32.f1;
import h32.h2;
import h32.v2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jc0.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import ky.h;
import nx.d0;
import nx.o0;
import nx.v;
import qi0.i;
import rq.t4;
import so.c6;
import wa2.m;
import yn2.c0;
import yq0.g0;

/* loaded from: classes5.dex */
public final class f extends tq.a implements v, h {
    public static final /* synthetic */ int T = 0;
    public final GestaltText A;
    public final GestaltIcon B;
    public final ConstraintLayout C;
    public final GestaltText D;
    public final GestaltText E;
    public final GestaltText F;
    public final GestaltIcon G;
    public final ConstraintLayout H;
    public final GestaltText I;

    /* renamed from: J, reason: collision with root package name */
    public final GestaltText f100184J;
    public final GestaltIcon K;
    public final b L;
    public c6 M;
    public m N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public final g0 S;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f100185d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f100186e;

    /* renamed from: f, reason: collision with root package name */
    public final String f100187f;

    /* renamed from: g, reason: collision with root package name */
    public qi0.f f100188g;

    /* renamed from: h, reason: collision with root package name */
    public i f100189h;

    /* renamed from: i, reason: collision with root package name */
    public qi0.a f100190i;

    /* renamed from: j, reason: collision with root package name */
    public l51.a f100191j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f100192k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f100193l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f100194m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltDivider f100195n;

    /* renamed from: o, reason: collision with root package name */
    public final GestaltDivider f100196o;

    /* renamed from: p, reason: collision with root package name */
    public final ConstraintLayout f100197p;

    /* renamed from: q, reason: collision with root package name */
    public final GestaltText f100198q;

    /* renamed from: r, reason: collision with root package name */
    public final GestaltText f100199r;

    /* renamed from: s, reason: collision with root package name */
    public final GestaltIcon f100200s;

    /* renamed from: t, reason: collision with root package name */
    public final GestaltDivider f100201t;

    /* renamed from: u, reason: collision with root package name */
    public final ConstraintLayout f100202u;

    /* renamed from: v, reason: collision with root package name */
    public final GestaltText f100203v;

    /* renamed from: w, reason: collision with root package name */
    public final GestaltText f100204w;

    /* renamed from: x, reason: collision with root package name */
    public final GestaltIcon f100205x;

    /* renamed from: y, reason: collision with root package name */
    public final ConstraintLayout f100206y;

    /* renamed from: z, reason: collision with root package name */
    public final GestaltText f100207z;

    public /* synthetic */ f(Context context, d0 d0Var, j0 j0Var, String str, int i13) {
        this(context, d0Var, j0Var, (i13 & 8) != 0 ? null : str, false);
    }

    public static void e(f fVar, String title, String subtitle, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i13) {
        if ((i13 & 16) != 0) {
            z15 = false;
        }
        if ((i13 & 32) != 0) {
            z16 = false;
        }
        if ((i13 & 64) != 0) {
            z17 = false;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        if (z17) {
            fVar.setPaddingRelative(fVar.getPaddingStart(), fVar.getResources().getDimensionPixelSize(eo1.c.space_200), fVar.getPaddingEnd(), fVar.getResources().getDimensionPixelSize(eo1.c.space_300));
        } else {
            fVar.setPaddingRelative(fVar.getPaddingStart(), fVar.getResources().getDimensionPixelSize(eo1.c.space_300), fVar.getPaddingEnd(), fVar.getResources().getDimensionPixelSize(z15 ? eo1.c.space_0 : eo1.c.space_300));
        }
        fVar.f100202u.setVisibility((z.j(title) ^ true) || (z.j(subtitle) ^ true) ? 0 : 8);
        fVar.f100197p.setVisibility(8);
        fVar.C.setVisibility(8);
        fVar.f100206y.setVisibility(8);
        fVar.H.setVisibility(8);
        fVar.f100203v.i(new t4(title, z16, 8));
        fVar.f100204w.i(new l(subtitle, 17));
        fVar.f100205x.setVisibility(z.j(subtitle) ^ true ? 0 : 8);
        j1.A0(fVar.f100201t);
        GestaltDivider gestaltDivider = fVar.f100195n;
        if (z13) {
            if (z17) {
                ViewGroup.LayoutParams layoutParams = gestaltDivider.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(0, 0, 0, fVar.getResources().getDimensionPixelSize(eo1.c.space_300));
                gestaltDivider.setLayoutParams(marginLayoutParams);
            }
            j1.W1(gestaltDivider);
        } else {
            j1.A0(gestaltDivider);
        }
        GestaltDivider gestaltDivider2 = fVar.f100196o;
        if (!z14) {
            j1.A0(gestaltDivider2);
            return;
        }
        if (z17) {
            ViewGroup.LayoutParams layoutParams2 = gestaltDivider2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMargins(0, fVar.getResources().getDimensionPixelSize(eo1.c.space_300), 0, 0);
            gestaltDivider2.setLayoutParams(marginLayoutParams2);
        }
        j1.W1(gestaltDivider2);
    }

    public final void b(String title, String subtitle, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        setPaddingRelative(getPaddingStart(), getResources().getDimensionPixelSize(eo1.c.space_300), getPaddingEnd(), getPaddingBottom());
        this.H.setVisibility((z.j(title) ^ true) || (z.j(subtitle) ^ true) ? 0 : 8);
        this.f100202u.setVisibility(8);
        this.f100197p.setVisibility(8);
        this.C.setVisibility(8);
        this.f100206y.setVisibility(8);
        this.I.i(new l(title, 15));
        this.f100184J.i(new l(subtitle, 16));
        this.K.setVisibility(z.j(subtitle) ^ true ? 0 : 8);
        j1.A0(this.f100201t);
        GestaltDivider gestaltDivider = this.f100195n;
        if (z13) {
            j1.W1(gestaltDivider);
        } else {
            j1.A0(gestaltDivider);
        }
        GestaltDivider gestaltDivider2 = this.f100196o;
        if (z14) {
            j1.W1(gestaltDivider2);
        } else {
            j1.A0(gestaltDivider2);
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final zy.m[] createImpressionLoggers(pb0.a aVar, d0 d0Var, o0 pinalyticsManager) {
        pb0.g clock = pb0.g.f99432a;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(pinalyticsManager, "pinalyticsManager");
        if (d0Var == null) {
            return super.createImpressionLoggers(clock, null, pinalyticsManager);
        }
        zy.m[] mVarArr = new zy.m[1];
        c6 c6Var = this.M;
        if (c6Var != null) {
            mVarArr[0] = c6Var.a(d0Var, h2.STORY_CAROUSEL);
            return mVarArr;
        }
        Intrinsics.r("pinImpressionLoggerFactory");
        throw null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    public final void g(String title, String subtitle, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getResources().getDimensionPixelSize(eo1.c.space_400));
        this.f100197p.setVisibility(0);
        this.f100202u.setVisibility(8);
        this.f100206y.setVisibility(8);
        this.C.setVisibility(8);
        this.H.setVisibility(8);
        this.f100198q.i(new l(title, 19));
        this.f100199r.i(new l(subtitle, 20));
        GestaltDivider gestaltDivider = this.f100195n;
        if (z13) {
            j1.W1(gestaltDivider);
        } else {
            j1.A0(gestaltDivider);
        }
        GestaltDivider gestaltDivider2 = this.f100196o;
        if (z14) {
            j1.W1(gestaltDivider2);
        } else {
            j1.A0(gestaltDivider2);
        }
        ViewGroup.LayoutParams layoutParams = gestaltDivider.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(eo1.c.space_400));
        gestaltDivider.setLayoutParams(marginLayoutParams);
        this.f100200s.setVisibility(0);
        j1.A0(this.f100201t);
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            return c0.t(c0.j(d7.b.O(recyclerView), d.f100179i));
        }
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f100192k.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return pv.b.view_story_ads_carousel_container;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return pv.a.video_carousel_horizontal_recycler;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.init(context);
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            q2 q2Var = recyclerView.f19220c;
            q2Var.f19606e = 4;
            q2Var.q();
        }
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return null;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            recyclerView.o(this.S);
        }
        v2 v2Var = new v2(null, null, null, null, Short.valueOf((short) this.R), null, null, null, null, null);
        if (!this.f100194m) {
            f1 f1Var = f1.STORY_IMPRESSION_ONE_PIXEL;
            Boolean bool = Boolean.FALSE;
            this.f100185d.o(f1Var, (r19 & 2) != 0 ? null : null, (r19 & 4) != 0 ? null : h32.g0.ADS_ONLY_CAROUSEL, (r19 & 8) != 0 ? null : null, (r19 & 32) != 0 ? null : this.f100193l, null, new c1(null, bool, null, Boolean.TRUE, bool, null, v2Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, false);
            this.f100194m = true;
            if (this.Q) {
                l51.a aVar = this.f100191j;
                if (aVar == null) {
                    Intrinsics.r("adsQcmAnalytics");
                    throw null;
                }
                int i13 = this.O;
                int i14 = this.P;
                if (aVar.d()) {
                    AdsQcmAnalytics$QcmCandidatePayload adsQcmAnalytics$QcmCandidatePayload = new AdsQcmAnalytics$QcmCandidatePayload("STLV3_STORY_IMPRESSION", i13, i14);
                    wr.c cVar = aVar.f81587d;
                    wr.c.a(cVar, adsQcmAnalytics$QcmCandidatePayload, null, null, 14);
                    if (i13 < 3) {
                        wr.c.a(cVar, new AdsQcmAnalytics$QcmCandidatePayload("STLV3_INVALID_NUMBER_OF_CANDIDATES", i13, i14), null, null, 14);
                    } else if (i13 - i14 < 3) {
                        wr.c.a(cVar, new AdsQcmAnalytics$QcmCandidatePayload("STLV3_INVALID_NUMBER_OF_HIDDEN_CANDIDATES", i13, i14), null, null, 14);
                    }
                }
            }
        }
        getPinterestRecyclerView().f52531a.n(this.L);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RecyclerView recyclerView = getPinterestRecyclerView().f52531a;
        if (recyclerView != null) {
            recyclerView.w2(this.S);
        }
        ArrayList arrayList = getPinterestRecyclerView().f52531a.C;
        if (arrayList != null) {
            arrayList.remove(this.L);
        }
        super.onDetachedFromWindow();
    }

    public final void p2(HashMap auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f100193l = auxData;
        g0 g0Var = this.S;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        g0Var.f139698f = auxData;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        d0 pinalytics = getPinalytics();
        if (pinalytics != null) {
            adapter.G(0, new e(this, adapter, pinalytics));
            adapter.G(1, dl2.b.m2(pinalytics, null, new e(this, pinalytics, adapter)));
            adapter.G(2, new b10.z(20, this, pinalytics));
        }
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.CAROUSEL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, d0 pinalytics, j0 scope, String str, boolean z13) {
        super(context, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f100185d = pinalytics;
        this.f100186e = scope;
        this.f100187f = str;
        this.f100192k = xk2.m.b(c.f100178i);
        this.f100193l = new HashMap();
        View findViewById = findViewById(pv.a.module_divider_top);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f100195n = (GestaltDivider) findViewById;
        View findViewById2 = findViewById(pv.a.module_divider_bottom);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f100196o = (GestaltDivider) findViewById2;
        View findViewById3 = findViewById(pv.a.container_v4);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f100197p = (ConstraintLayout) findViewById3;
        View findViewById4 = findViewById(pv.a.title_v4);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f100198q = (GestaltText) findViewById4;
        View findViewById5 = findViewById(pv.a.subtitle_v4);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f100199r = (GestaltText) findViewById5;
        View findViewById6 = findViewById(pv.a.d2s_indicator_v4);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f100200s = (GestaltIcon) findViewById6;
        View findViewById7 = findViewById(pv.a.separator);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f100201t = (GestaltDivider) findViewById7;
        View findViewById8 = findViewById(pv.a.container_stack_left);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f100202u = (ConstraintLayout) findViewById8;
        View findViewById9 = findViewById(pv.a.title_stack_left);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f100203v = (GestaltText) findViewById9;
        View findViewById10 = findViewById(pv.a.subtitle_stack_left);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        this.f100204w = (GestaltText) findViewById10;
        View findViewById11 = findViewById(pv.a.d2s_indicator_stack_left);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f100205x = (GestaltIcon) findViewById11;
        View findViewById12 = findViewById(pv.a.container_stack_left_title_above);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "findViewById(...)");
        this.f100206y = (ConstraintLayout) findViewById12;
        View findViewById13 = findViewById(pv.a.title_stack_left_title_above);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "findViewById(...)");
        this.f100207z = (GestaltText) findViewById13;
        View findViewById14 = findViewById(pv.a.subtitle_stack_left_title_above);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "findViewById(...)");
        this.A = (GestaltText) findViewById14;
        View findViewById15 = findViewById(pv.a.d2s_indicator_stack_left_title_above);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "findViewById(...)");
        this.B = (GestaltIcon) findViewById15;
        View findViewById16 = findViewById(pv.a.container_3_line);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "findViewById(...)");
        this.C = (ConstraintLayout) findViewById16;
        View findViewById17 = findViewById(pv.a.title_3_line);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "findViewById(...)");
        this.D = (GestaltText) findViewById17;
        View findViewById18 = findViewById(pv.a.subtitle_3_line);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "findViewById(...)");
        this.E = (GestaltText) findViewById18;
        View findViewById19 = findViewById(pv.a.caption_3_line);
        Intrinsics.checkNotNullExpressionValue(findViewById19, "findViewById(...)");
        this.F = (GestaltText) findViewById19;
        View findViewById20 = findViewById(pv.a.d2s_indicator_3_line);
        Intrinsics.checkNotNullExpressionValue(findViewById20, "findViewById(...)");
        this.G = (GestaltIcon) findViewById20;
        View findViewById21 = findViewById(pv.a.container_horizontal);
        Intrinsics.checkNotNullExpressionValue(findViewById21, "findViewById(...)");
        this.H = (ConstraintLayout) findViewById21;
        View findViewById22 = findViewById(pv.a.title_horizontal);
        Intrinsics.checkNotNullExpressionValue(findViewById22, "findViewById(...)");
        this.I = (GestaltText) findViewById22;
        View findViewById23 = findViewById(pv.a.subtitle_horizontal);
        Intrinsics.checkNotNullExpressionValue(findViewById23, "findViewById(...)");
        this.f100184J = (GestaltText) findViewById23;
        View findViewById24 = findViewById(pv.a.d2s_indicator_horizontal);
        Intrinsics.checkNotNullExpressionValue(findViewById24, "findViewById(...)");
        this.K = (GestaltIcon) findViewById24;
        this.L = new b(0);
        int G0 = dl2.b.G0(this, eo1.a.item_horizontal_spacing);
        int G02 = dl2.b.G0(this, eo1.a.item_horizontal_spacing_half);
        if (z13) {
            getPinterestRecyclerView().a(new eb2.d(new ex.d(G0, 9), a.f100172j, new ex.d(G0, 10), a.f100173k));
        } else {
            getPinterestRecyclerView().a(new eb2.d(new yu.a(G0, G02, 3), a.f100174l, new yu.c(this, G0, G02, 28), a.f100175m));
        }
        setPinalytics(pinalytics);
        this.S = new g0(pinalytics, h32.g0.ADS_ONLY_CAROUSEL, null, null);
    }
}
