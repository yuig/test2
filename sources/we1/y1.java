package we1;

import android.content.Context;
import android.widget.LinearLayout;
import com.pinterest.ui.imageview.ProportionalImageView;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class y1 extends LinearLayout implements re1.a0, ky.h, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f129703a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129704b;

    /* renamed from: c, reason: collision with root package name */
    public ku1.l f129705c;

    /* renamed from: d, reason: collision with root package name */
    public final q1 f129706d;

    /* renamed from: e, reason: collision with root package name */
    public re1.z f129707e;

    /* renamed from: f, reason: collision with root package name */
    public x1 f129708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f129704b) {
            this.f129704b = true;
            kh2.w.f0(this, (ku1.l) ((jb) ((z1) generatedComponent())).f113485c.f114476s.get());
        }
        q1 q1Var = new q1(context);
        q1Var.setVisibility(8);
        this.f129706d = q1Var;
        setVisibility(8);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(q1Var);
    }

    @Override // re1.a0
    public final void A1(String backgroundColor, re1.e eVar) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
    }

    @Override // re1.c
    public final List C() {
        return null;
    }

    @Override // re1.a0
    public final void L3() {
        bs1.c.X0(this.f129706d);
    }

    @Override // gd1.d
    public final void O5(String actionDeeplink, HashMap navigationParams) {
        Intrinsics.checkNotNullParameter(actionDeeplink, "actionDeeplink");
        Intrinsics.checkNotNullParameter(navigationParams, "navigationParams");
        ku1.l lVar = this.f129705c;
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
        this.f129707e = listener;
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
        if (this.f129703a == null) {
            this.f129703a = new ye2.o(this);
        }
        return this.f129703a;
    }

    @Override // re1.k
    public final void e(re1.j footerModel) {
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
    }

    @Override // re1.w
    public final void g(re1.p headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        q1 q1Var = this.f129706d;
        q1Var.g(headerModel);
        q1Var.setVisibility(0);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129703a == null) {
            this.f129703a = new ye2.o(this);
        }
        return this.f129703a.generatedComponent();
    }

    public final q1 i() {
        return this.f129706d;
    }

    public final int j() {
        q1 q1Var = this.f129706d;
        ProportionalImageView proportionalImageView = q1Var.f129567h;
        return proportionalImageView != null ? proportionalImageView.getHeight() : q1Var.f129560a.getHeight();
    }

    public final int k() {
        return this.f129706d.f129560a.getHeight();
    }

    public final boolean l() {
        return this.f129706d.f129567h != null;
    }

    @Override // re1.o
    public final void m(re1.n gridSectionModel) {
        Intrinsics.checkNotNullParameter(gridSectionModel, "gridSectionModel");
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        re1.z zVar = this.f129707e;
        if (zVar != null) {
            return zVar.I();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        re1.z zVar = this.f129707e;
        if (zVar != null) {
            return zVar.E1();
        }
        return null;
    }

    @Override // re1.w
    public final void n(re1.r headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        x1 x1Var = this.f129708f;
        if (x1Var != null) {
            x1Var.Q3(headerModel);
            return;
        }
        q1 q1Var = this.f129706d;
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
