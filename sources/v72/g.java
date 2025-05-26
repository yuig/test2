package v72;

import android.content.Context;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao2.j0;
import ao2.k2;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.fi0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.shuffles.scene.composer.a1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.g1;
import lh0.k0;
import lh0.y0;
import lh0.z0;
import lh0.z3;
import ni1.y2;
import nx.d0;
import qa2.c0;
import qa2.f0;
import qa2.h0;
import rh1.d1;
import so.xa;

/* loaded from: classes4.dex */
public final class g extends d1 implements y92.g, c0, nx.v, f0 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f124416x = 0;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f124417d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f124418e;

    /* renamed from: f, reason: collision with root package name */
    public final wa2.m f124419f;

    /* renamed from: g, reason: collision with root package name */
    public n72.b f124420g;

    /* renamed from: h, reason: collision with root package name */
    public n72.m f124421h;

    /* renamed from: i, reason: collision with root package name */
    public t62.b f124422i;

    /* renamed from: j, reason: collision with root package name */
    public k0 f124423j;

    /* renamed from: k, reason: collision with root package name */
    public k2 f124424k;

    /* renamed from: l, reason: collision with root package name */
    public xa f124425l;

    /* renamed from: m, reason: collision with root package name */
    public qa2.j0 f124426m;

    /* renamed from: n, reason: collision with root package name */
    public ni1.d0 f124427n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f124428o;

    /* renamed from: p, reason: collision with root package name */
    public final x72.j f124429p;

    /* renamed from: q, reason: collision with root package name */
    public final com.pinterest.shuffles.scene.composer.y f124430q;

    /* renamed from: r, reason: collision with root package name */
    public final ImageView f124431r;

    /* renamed from: s, reason: collision with root package name */
    public final a82.j f124432s;

    /* renamed from: t, reason: collision with root package name */
    public final a0 f124433t;

    /* renamed from: u, reason: collision with root package name */
    public final SbaPinRep f124434u;

    /* renamed from: v, reason: collision with root package name */
    public final l82.c f124435v;

    /* renamed from: w, reason: collision with root package name */
    public k2 f124436w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, d0 pinalytics, wa2.m pfc, j0 scope) {
        super(context, 3);
        a0 a13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pfc, "pfc");
        this.f124417d = pinalytics;
        this.f124418e = scope;
        this.f124419f = pfc;
        this.f124428o = xk2.m.b(new c72.o(this, 2));
        int i13 = 5;
        ViewOutlineProvider cVar = new nj.c(this, i13);
        x72.b bVar = x72.b.f134124d;
        if (bVar == null) {
            Intrinsics.r("current");
            throw null;
        }
        x72.j n13 = bVar.n(context);
        if (this.f124422i == null) {
            Intrinsics.r("rendererUtility");
            throw null;
        }
        d callback = new d(this, 1);
        Intrinsics.checkNotNullParameter(callback, "callback");
        n13.g(new uv.d(callback, i13));
        this.f124429p = n13;
        n72.m mVar = this.f124421h;
        if (mVar == null) {
            Intrinsics.r("shuffleCoreLogger");
            throw null;
        }
        com.pinterest.shuffles.scene.composer.y yVar = new com.pinterest.shuffles.scene.composer.y(n13, scope, mVar);
        int i14 = 0;
        a1 a1Var = new a1((14 & 1) != 0, (2 & 14) != 0, false, false);
        n72.m mVar2 = this.f124421h;
        if (mVar2 == null) {
            Intrinsics.r("shuffleCoreLogger");
            throw null;
        }
        n72.b bVar2 = this.f124420g;
        if (bVar2 == null) {
            Intrinsics.r("fontProvider");
            throw null;
        }
        com.pinterest.shuffles.scene.composer.q qVar = new com.pinterest.shuffles.scene.composer.q(context, a1Var, bVar2, mVar2);
        Intrinsics.checkNotNullParameter(qVar, "<set-?>");
        yVar.f52036a = qVar;
        this.f124430q = yVar;
        ImageView imageView = new ImageView(context);
        this.f124431r = imageView;
        a82.j jVar = new a82.j(n13, imageView, scope, new d(this, i14), e.f124408j, f.f124413j);
        this.f124432s = jVar;
        qa2.d0 d0Var = pfc.f128855d0;
        if (d0Var != null) {
            xa xaVar = this.f124425l;
            if (xaVar == null) {
                Intrinsics.r("viewModelFactory");
                throw null;
            }
            a13 = xaVar.a(scope, new zw.a(d0Var));
        } else {
            xa xaVar2 = this.f124425l;
            if (xaVar2 == null) {
                Intrinsics.r("viewModelFactory");
                throw null;
            }
            a13 = xaVar2.a(scope, new zw.a());
        }
        this.f124433t = a13;
        u50.r c13 = a13.c();
        this.f124435v = (l82.c) c13;
        qa2.j0 j0Var = this.f124426m;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) j0Var).a(context, true);
        this.f124434u = sbaPinRep;
        sbaPinRep.addToView(this);
        sbaPinRep.setEventIntake(new kd1.j(c13, 17));
        sbaPinRep.setPinalytics(pinalytics);
        sbaPinRep.applyUnMigratedPFCFields(pfc.f128875n0, pfc.f128861g0, pfc.f128855d0, pfc.f128879p0, pfc.M);
        View k13 = n13.k();
        k13.setId(bb0.b.collage_pgc_scene_view);
        k13.setClipToOutline(true);
        k13.setOutlineProvider(cVar);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.f17691t = 0;
        layoutParams.f17693v = 0;
        layoutParams.f17671i = 0;
        layoutParams.f17677l = 0;
        layoutParams.G = "9:16";
        layoutParams.F = 0.0f;
        Unit unit = Unit.f80348a;
        addView(k13, layoutParams);
        imageView.setClipToOutline(true);
        imageView.setOutlineProvider(cVar);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, 0);
        int i15 = bb0.b.collage_pgc_scene_view;
        layoutParams2.f17691t = i15;
        layoutParams2.f17693v = i15;
        layoutParams2.f17671i = i15;
        layoutParams2.f17677l = i15;
        addView(imageView, layoutParams2);
        yVar.g(jVar);
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f124434u;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f124434u.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f124434u.markImpressionStart();
    }

    @Override // qa2.c0
    public final void onAttached() {
        this.f124434u.onAttached();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f124436w = kotlin.jvm.internal.j.z(this.f124418e, null, null, new c(this, null), 3);
        x72.j jVar = this.f124429p;
        this.f124435v.a(new j(String.valueOf(System.identityHashCode(jVar)), jVar.k().getId()));
    }

    @Override // qa2.c0
    public final void onDeactivated() {
        this.f124434u.onDeactivated();
    }

    @Override // qa2.c0
    public final void onDetached() {
        this.f124434u.onDetached();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f124435v.a(new l(String.valueOf(System.identityHashCode(this.f124429p))));
        k2 k2Var = this.f124424k;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        k2 k2Var2 = this.f124436w;
        if (k2Var2 != null) {
            k2Var2.cancel((CancellationException) null);
        }
    }

    @Override // qa2.c0
    public final void onInitialized() {
        this.f124434u.onInitialized();
    }

    @Override // qa2.c0
    public final void onScrollStarted() {
        this.f124434u.onScrollStarted();
    }

    @Override // qa2.f0, y92.i
    public final void onViewRecycled() {
        super.onViewRecycled();
        com.pinterest.shuffles.scene.composer.y yVar = this.f124430q;
        yVar.h();
        com.pinterest.shuffles.scene.composer.y.r(yVar, null);
        a82.j jVar = this.f124432s;
        jVar.f1554g = false;
        jVar.f1555h = true;
        jVar.f1556i = null;
    }

    @Override // y92.g
    public final boolean resizable() {
        return false;
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        y2 a13 = ((ni1.c0) this.f124428o.getValue()).a(i13, pin);
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        fi0 r63 = pin.r6();
        k0 k0Var = this.f124423j;
        if (k0Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) k0Var.f83401a;
        boolean z13 = g1Var.o("android_pgc_render_collage", "enabled", z3Var) || g1Var.l("android_pgc_render_collage");
        k0 k0Var2 = this.f124423j;
        if (k0Var2 == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        Intrinsics.checkNotNullParameter("enabled_forced", "keyWord");
        z0.f83518a.getClass();
        String h10 = ((g1) k0Var2.f83401a).h("android_pgc_render_collage", y0.f83512b);
        z startState = new z(uid, r63, z13, h10 != null && (kotlin.text.z.p(h10, "enabled", false) || kotlin.text.z.p(h10, "employee", false)) && StringsKt.E(h10, "enabled_forced", false), a13);
        a0 a0Var = this.f124433t;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(startState, "startState");
        this.f124435v.a(new o(ni1.a1.f90594a));
        yk1.a aVar = new yk1.a(getResources(), getContext().getTheme());
        k0 k0Var3 = this.f124423j;
        if (k0Var3 == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        g1 g1Var2 = (g1) k0Var3.f83401a;
        this.f124424k = com.bumptech.glide.c.Y(aVar, pin, false, false, g1Var2.o("android_lift_content_desc", "enabled", z3Var) || g1Var2.l("android_lift_content_desc"), new d(this, 2), 12);
        this.f124432s.b(pin);
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        return this.f124434u.getUniqueId();
    }
}
