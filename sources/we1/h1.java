package we1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c50.ma;
import com.pinterest.api.model.xi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lh0.f4;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes5.dex */
public final class h1 extends LinearLayout implements re1.a0, ky.h, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f129396a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129397b;

    /* renamed from: c, reason: collision with root package name */
    public final ao2.j0 f129398c;

    /* renamed from: d, reason: collision with root package name */
    public final ku1.l f129399d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f129400e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f129401f;

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f129402g;

    /* renamed from: h, reason: collision with root package name */
    public final gi2.b f129403h;

    /* renamed from: i, reason: collision with root package name */
    public final pb0.d f129404i;

    /* renamed from: j, reason: collision with root package name */
    public final g70.h f129405j;

    /* renamed from: k, reason: collision with root package name */
    public final f4 f129406k;

    /* renamed from: l, reason: collision with root package name */
    public final int f129407l;

    /* renamed from: m, reason: collision with root package name */
    public re1.z f129408m;

    /* renamed from: n, reason: collision with root package name */
    public final q1 f129409n;

    /* renamed from: o, reason: collision with root package name */
    public final d1 f129410o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, ao2.j0 scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (!this.f129397b) {
            this.f129397b = true;
            jb jbVar = (jb) ((i1) generatedComponent());
            s8 s8Var = jbVar.f113485c;
            this.f129399d = (ku1.l) s8Var.f114476s.get();
            oa oaVar = jbVar.f113483a;
            this.f129401f = (m60.w) oaVar.f113885r0.get();
            this.f129402g = (b60.b) oaVar.f113850p0.get();
            this.f129403h = new gi2.b();
            this.f129404i = oaVar.j2();
            this.f129405j = s8Var.e5();
            this.f129406k = s8Var.J6();
        }
        this.f129398c = scope;
        this.f129407l = dl2.b.F0(context, eo1.a.item_horizontal_spacing_half);
        q1 q1Var = new q1(context);
        q1Var.setVisibility(8);
        this.f129409n = q1Var;
        d1 d1Var = new d1(context);
        d1Var.setVisibility(8);
        this.f129410o = d1Var;
        setOrientation(1);
        setVisibility(8);
        bs1.c.X0(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(q1Var);
        addView(d1Var);
    }

    @Override // re1.a0
    public final void A1(String backgroundColor, re1.e eVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        int i13 = m60.o.f85933a;
        setBackgroundColor(ma.b(0, backgroundColor));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup, we1.u] */
    @Override // re1.c
    public final List C() {
        ?? r03 = this.f129400e;
        if (r03 == 0) {
            return null;
        }
        ViewGroup b13 = r03.b();
        IntRange q13 = ql2.s.q(0, b13.getChildCount());
        ArrayList arrayList = new ArrayList();
        ql2.k it = q13.iterator();
        while (it.f104109c) {
            View childAt = b13.getChildAt(it.b());
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        return CollectionsKt.F0(arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewGroup, we1.u] */
    @Override // re1.a0
    public final void L3() {
        bs1.c.X0(this.f129409n);
        bs1.c.X0(this.f129410o);
        ?? r03 = this.f129400e;
        bs1.c.X0(r03 != 0 ? r03.b() : null);
        setBackground(null);
    }

    @Override // gd1.d
    public final void O5(String actionDeeplink, HashMap navigationParams) {
        Intrinsics.checkNotNullParameter(actionDeeplink, "actionDeeplink");
        Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
        ku1.l lVar = this.f129399d;
        if (lVar == null) {
            Intrinsics.r("uriNavigator");
            throw null;
        }
        Context context = getContext();
        Intrinsics.f(context);
        lVar.a(context, actionDeeplink, true, false, null, navigationParams, true);
    }

    @Override // re1.a0
    public final void P5(re1.z listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f129408m = listener;
    }

    @Override // re1.h
    public final void a(re1.f carouselModel) {
        Intrinsics.checkNotNullParameter(carouselModel, "carouselModel");
    }

    @Override // re1.y
    public final void b(re1.x singleImageUpsellModel) {
        Intrinsics.checkNotNullParameter(singleImageUpsellModel, "singleImageUpsellModel");
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129396a == null) {
            this.f129396a = new ye2.o(this);
        }
        return this.f129396a;
    }

    @Override // re1.k
    public final void e(re1.j footerModel) {
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        d1 d1Var = this.f129410o;
        d1Var.e(footerModel);
        d1Var.setVisibility(0);
    }

    @Override // re1.w
    public final void g(re1.p headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        q1 q1Var = this.f129409n;
        q1Var.g(headerModel);
        q1Var.setVisibility(0);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129396a == null) {
            this.f129396a = new ye2.o(this);
        }
        return this.f129396a.generatedComponent();
    }

    @Override // nx.v
    public final List getChildImpressionViews() {
        return C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.ViewGroup, we1.u] */
    /* JADX WARN: Type inference failed for: r3v5, types: [we1.j0] */
    @Override // re1.o
    public final void m(re1.n gridSectionModel) {
        boolean z13;
        int i13;
        u2 u2Var;
        Intrinsics.checkNotNullParameter(gridSectionModel, "gridSectionModel");
        ?? r23 = this.f129400e;
        if (r23 != 0) {
            r23.b().removeAllViews();
            this.f129400e = null;
        }
        ue1.l lVar = gridSectionModel.f107616c;
        ze0.a aVar = lVar.f122027b;
        xi xiVar = gridSectionModel.f107615b;
        v2 v2Var = new v2(this.f129407l, aVar, lVar.f122029d, gridSectionModel.f107617d, lVar.f122031f, lVar.f122032g, gridSectionModel.f107620g, gridSectionModel.f107621h, xiVar.getCenterContent(), xiVar.getItemWidthHeightRatio(), gridSectionModel.f107622i);
        List<ue1.a0> list = lVar.f122026a;
        loop0: while (true) {
            for (ue1.a0 a0Var : list) {
                z13 = z13 && j0.f129439d.contains(Integer.valueOf(a0Var.m()));
            }
        }
        if (z13) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ?? j0Var = new j0(v2Var, context);
            i13 = 0;
            u2Var = j0Var;
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            b60.b bVar = this.f129402g;
            if (bVar == null) {
                Intrinsics.r("activeUserManager");
                throw null;
            }
            m60.w wVar = this.f129401f;
            if (wVar == null) {
                Intrinsics.r("eventManager");
                throw null;
            }
            gi2.b bVar2 = this.f129403h;
            if (bVar2 == null) {
                Intrinsics.r("boardRepItemViewBinderProvider");
                throw null;
            }
            pb0.d dVar = this.f129404i;
            if (dVar == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            g70.h hVar = this.f129405j;
            if (hVar == null) {
                Intrinsics.r("boardNavigator");
                throw null;
            }
            f4 f4Var = this.f129406k;
            if (f4Var == null) {
                Intrinsics.r("experiments");
                throw null;
            }
            i13 = 0;
            u2Var = new u2(context2, this.f129398c, lVar.f122028c, bVar, wVar, v2Var, bVar2, dVar, hVar, f4Var);
        }
        u2Var.a(list);
        addView(u2Var.b(), 1);
        this.f129400e = u2Var;
        setVisibility(i13);
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        re1.z zVar = this.f129408m;
        if (zVar != null) {
            return zVar.I();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        re1.z zVar = this.f129408m;
        if (zVar != null) {
            return zVar.E1();
        }
        return null;
    }

    @Override // re1.w
    public final void n(re1.r headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        q1 q1Var = this.f129409n;
        q1Var.n(headerModel);
        q1Var.setVisibility(0);
    }

    @Override // re1.m
    public final void q(re1.l freeformModel) {
        Intrinsics.checkNotNullParameter(freeformModel, "freeformModel");
    }

    @Override // re1.a0
    public final void r4(boolean z13) {
    }

    @Override // re1.a0
    public final void setVisible(boolean z13) {
        bs1.c.R1(this, z13);
    }

    @Override // ky.h
    public final ky.g z() {
        return ky.g.OTHER;
    }
}
