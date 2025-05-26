package we1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c50.ma;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class d2 extends LinearLayout implements re1.a0, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f129325a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129326b;

    /* renamed from: c, reason: collision with root package name */
    public ku1.l f129327c;

    /* renamed from: d, reason: collision with root package name */
    public re1.z f129328d;

    /* renamed from: e, reason: collision with root package name */
    public LinearLayout f129329e;

    /* renamed from: f, reason: collision with root package name */
    public final w1 f129330f;

    /* renamed from: g, reason: collision with root package name */
    public final y0 f129331g;

    /* renamed from: h, reason: collision with root package name */
    public final g1 f129332h;

    /* renamed from: i, reason: collision with root package name */
    public final f1 f129333i;

    /* renamed from: j, reason: collision with root package name */
    public final d1 f129334j;

    /* renamed from: k, reason: collision with root package name */
    public final c2 f129335k;

    /* renamed from: l, reason: collision with root package name */
    public final q1 f129336l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f129337m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Context context, ao2.j0 scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (!this.f129326b) {
            this.f129326b = true;
            rl2.g0.S(this, (ku1.l) ((jb) ((e2) generatedComponent())).f113485c.f114476s.get());
        }
        w1 w1Var = new w1(context);
        w1Var.setVisibility(8);
        this.f129330f = w1Var;
        y0 y0Var = new y0(context);
        y0Var.setVisibility(8);
        this.f129331g = y0Var;
        g1 g1Var = new g1(context, scope);
        g1Var.setVisibility(8);
        this.f129332h = g1Var;
        f1 f1Var = new f1(context);
        f1Var.setVisibility(8);
        this.f129333i = f1Var;
        d1 d1Var = new d1(context);
        d1Var.setVisibility(8);
        this.f129334j = d1Var;
        c2 c2Var = new c2(context);
        c2Var.setVisibility(8);
        this.f129335k = c2Var;
        q1 q1Var = new q1(context);
        q1Var.setVisibility(8);
        this.f129336l = q1Var;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setVisibility(8);
        addView(w1Var);
        addView(q1Var);
        addView(y0Var);
        addView(g1Var);
        addView(f1Var);
        addView(d1Var);
        addView(c2Var);
    }

    @Override // re1.a0
    public final void A1(String backgroundColor, re1.e eVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        int i13 = m60.o.f85933a;
        setBackgroundColor(ma.b(0, backgroundColor));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout, re1.c] */
    @Override // re1.c
    public final List C() {
        ?? r03 = this.f129329e;
        if (r03 != 0) {
            return r03.C();
        }
        return null;
    }

    @Override // re1.a0
    public final void L3() {
        bs1.c.X0(this.f129330f);
        bs1.c.X0(this.f129334j);
        bs1.c.X0(this.f129331g);
        bs1.c.X0(this.f129332h);
        bs1.c.X0(this.f129333i);
        bs1.c.X0(this.f129335k);
        this.f129329e = null;
        bs1.c.X0(this.f129336l);
        setBackground(null);
    }

    @Override // gd1.d
    public final void O5(String actionDeeplink, HashMap navigationParams) {
        Intrinsics.checkNotNullParameter(actionDeeplink, "actionDeeplink");
        Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
        ku1.l lVar = this.f129327c;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.f(context);
        ku1.l.b(lVar, context, actionDeeplink, true, false, null, navigationParams, 64);
    }

    @Override // re1.a0
    public final void P5(re1.z listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f129328d = listener;
    }

    @Override // re1.h
    public final void a(re1.f carouselModel) {
        Intrinsics.checkNotNullParameter(carouselModel, "carouselModel");
        y0 y0Var = this.f129331g;
        y0Var.a(carouselModel);
        y0Var.setVisibility(0);
        this.f129329e = y0Var;
        y0Var.b(carouselModel.f107596q, carouselModel.f107597r, carouselModel.f107595p, carouselModel.f107586g);
    }

    @Override // re1.y
    public final void b(re1.x singleImageUpsellModel) {
        Intrinsics.checkNotNullParameter(singleImageUpsellModel, "singleImageUpsellModel");
        c2 c2Var = this.f129335k;
        c2Var.b(singleImageUpsellModel);
        c2Var.setVisibility(0);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129325a == null) {
            this.f129325a = new ye2.o(this);
        }
        return this.f129325a;
    }

    @Override // re1.k
    public final void e(re1.j footerModel) {
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        d1 d1Var = this.f129334j;
        d1Var.e(footerModel);
        d1Var.setVisibility(0);
    }

    @Override // re1.w
    public final void g(re1.p headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        boolean z13 = this.f129337m;
        w1 w1Var = this.f129330f;
        q1 q1Var = this.f129336l;
        if (z13) {
            q1Var.g(headerModel);
            q1Var.setVisibility(0);
            w1Var.setVisibility(8);
        } else {
            w1Var.g(headerModel);
            w1Var.setVisibility(0);
            q1Var.setVisibility(8);
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129325a == null) {
            this.f129325a = new ye2.o(this);
        }
        return this.f129325a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return C();
    }

    @Override // re1.o
    public final void m(re1.n gridSectionModel) {
        Intrinsics.checkNotNullParameter(gridSectionModel, "gridSectionModel");
        g1 g1Var = this.f129332h;
        g1Var.m(gridSectionModel);
        g1Var.setVisibility(0);
        this.f129329e = g1Var;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        re1.z zVar = this.f129328d;
        if (zVar != null) {
            return zVar.I();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        re1.z zVar = this.f129328d;
        if (zVar != null) {
            return zVar.E1();
        }
        return null;
    }

    @Override // re1.w
    public final void n(re1.r headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        boolean z13 = this.f129337m;
        w1 w1Var = this.f129330f;
        q1 q1Var = this.f129336l;
        if (z13) {
            q1Var.n(headerModel);
            q1Var.setVisibility(0);
            w1Var.setVisibility(8);
        } else {
            w1Var.n(headerModel);
            w1Var.setVisibility(0);
            q1Var.setVisibility(8);
        }
    }

    @Override // re1.m
    public final void q(re1.l freeformModel) {
        Intrinsics.checkNotNullParameter(freeformModel, "freeformModel");
        f1 f1Var = this.f129333i;
        f1Var.q(freeformModel);
        f1Var.setVisibility(0);
        this.f129329e = null;
    }

    @Override // re1.a0
    public final void r4(boolean z13) {
        this.f129337m = z13;
    }

    @Override // re1.a0
    public final void setVisible(boolean z13) {
        bs1.c.R1(this, z13);
    }
}
