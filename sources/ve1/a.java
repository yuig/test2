package ve1;

import android.content.Context;
import android.widget.LinearLayout;
import c50.ma;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ku1.l;
import re1.a0;
import re1.f;
import re1.j;
import re1.n;
import re1.p;
import re1.r;
import re1.x;
import re1.z;
import we1.c2;
import we1.d1;
import we1.f1;
import we1.g1;
import we1.q1;
import we1.w1;
import we1.y0;
import ye2.o;

/* loaded from: classes5.dex */
public final class a extends LinearLayout implements a0, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f125744a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f125745b;

    /* renamed from: c, reason: collision with root package name */
    public l f125746c;

    /* renamed from: d, reason: collision with root package name */
    public z f125747d;

    /* renamed from: e, reason: collision with root package name */
    public LinearLayout f125748e;

    /* renamed from: f, reason: collision with root package name */
    public w1 f125749f;

    /* renamed from: g, reason: collision with root package name */
    public y0 f125750g;

    /* renamed from: h, reason: collision with root package name */
    public g1 f125751h;

    /* renamed from: i, reason: collision with root package name */
    public f1 f125752i;

    /* renamed from: j, reason: collision with root package name */
    public d1 f125753j;

    /* renamed from: k, reason: collision with root package name */
    public c2 f125754k;

    /* renamed from: l, reason: collision with root package name */
    public q1 f125755l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f125756m;

    @Override // re1.a0
    public final void A1(String backgroundColor, re1.e eVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        int i13 = m60.o.f85933a;
        setBackgroundColor(ma.b(0, backgroundColor));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.LinearLayout, re1.c] */
    @Override // re1.c
    public final List C() {
        ?? r03 = this.f125748e;
        if (r03 != 0) {
            return r03.C();
        }
        return null;
    }

    @Override // re1.a0
    public final void L3() {
        bs1.c.X0(this.f125749f);
        bs1.c.X0(this.f125753j);
        bs1.c.X0(this.f125750g);
        bs1.c.X0(this.f125751h);
        bs1.c.X0(this.f125752i);
        bs1.c.X0(this.f125754k);
        this.f125748e = null;
        bs1.c.X0(this.f125755l);
        setBackground(null);
    }

    @Override // gd1.d
    public final void O5(String actionDeeplink, HashMap navigationParams) {
        Intrinsics.checkNotNullParameter(actionDeeplink, "actionDeeplink");
        Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
        l lVar = this.f125746c;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.f(context);
        l.b(lVar, context, actionDeeplink, true, false, null, navigationParams, 64);
    }

    @Override // re1.a0
    public final void P5(z listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f125747d = listener;
    }

    @Override // re1.h
    public final void a(f carouselModel) {
        Intrinsics.checkNotNullParameter(carouselModel, "carouselModel");
        y0 y0Var = this.f125750g;
        y0Var.a(carouselModel);
        y0Var.setVisibility(0);
        this.f125748e = y0Var;
        y0Var.b(carouselModel.f107596q, carouselModel.f107597r, carouselModel.f107595p, carouselModel.f107586g);
    }

    @Override // re1.y
    public final void b(x singleImageUpsellModel) {
        Intrinsics.checkNotNullParameter(singleImageUpsellModel, "singleImageUpsellModel");
        c2 c2Var = this.f125754k;
        c2Var.b(singleImageUpsellModel);
        c2Var.setVisibility(0);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f125744a == null) {
            this.f125744a = new o(this);
        }
        return this.f125744a;
    }

    @Override // re1.k
    public final void e(j footerModel) {
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        d1 d1Var = this.f125753j;
        d1Var.e(footerModel);
        d1Var.setVisibility(0);
    }

    @Override // re1.w
    public final void g(p headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        boolean z13 = this.f125756m;
        w1 w1Var = this.f125749f;
        q1 q1Var = this.f125755l;
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
        if (this.f125744a == null) {
            this.f125744a = new o(this);
        }
        return this.f125744a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return C();
    }

    @Override // re1.o
    public final void m(n gridSectionModel) {
        Intrinsics.checkNotNullParameter(gridSectionModel, "gridSectionModel");
        g1 g1Var = this.f125751h;
        g1Var.m(gridSectionModel);
        g1Var.setVisibility(0);
        this.f125748e = g1Var;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        z zVar = this.f125747d;
        if (zVar != null) {
            return zVar.I();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        z zVar = this.f125747d;
        if (zVar != null) {
            return zVar.E1();
        }
        return null;
    }

    @Override // re1.w
    public final void n(r headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        boolean z13 = this.f125756m;
        w1 w1Var = this.f125749f;
        q1 q1Var = this.f125755l;
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
        f1 f1Var = this.f125752i;
        f1Var.q(freeformModel);
        f1Var.setVisibility(0);
        this.f125748e = null;
    }

    @Override // re1.a0
    public final void r4(boolean z13) {
        this.f125756m = z13;
    }

    @Override // re1.a0
    public final void setVisible(boolean z13) {
        bs1.c.R1(this, z13);
    }
}
