package qa2;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;
import ni1.t2;
import so.jb;
import so.oa;

/* loaded from: classes2.dex */
public final class r0 extends FrameLayout implements s0, f0, y92.g, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f103338a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f103339b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f103340c;

    /* renamed from: d, reason: collision with root package name */
    public final wa2.m f103341d;

    /* renamed from: e, reason: collision with root package name */
    public final t2 f103342e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f103343f;

    /* renamed from: g, reason: collision with root package name */
    public final ni1.d0 f103344g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f103345h;

    /* renamed from: i, reason: collision with root package name */
    public final a1 f103346i;

    /* renamed from: j, reason: collision with root package name */
    public final o2 f103347j;

    /* renamed from: k, reason: collision with root package name */
    public final SbaPinRep f103348k;

    /* renamed from: l, reason: collision with root package name */
    public f30 f103349l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context, ao2.j0 scope, nx.d0 pinalytics, wa2.m pinFeatureConfig) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        int i13 = 1;
        if (!this.f103339b) {
            this.f103339b = true;
            oa oaVar = ((jb) ((t0) generatedComponent())).f113483a;
            this.f103342e = (t2) oaVar.f113950uc.get();
            this.f103343f = oaVar.v2();
            this.f103344g = (ni1.d0) oaVar.Gb.get();
        }
        this.f103340c = pinalytics;
        this.f103341d = pinFeatureConfig;
        this.f103345h = xk2.m.b(new c72.o(this, 10));
        j0 j0Var = this.f103343f;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        t2 t2Var = this.f103342e;
        if (t2Var == null) {
            Intrinsics.r("pinRepViewModelFactory");
            throw null;
        }
        Pair q13 = l3.c.q(context, pinFeatureConfig, pinalytics, scope, j0Var, t2Var);
        SbaPinRep sbaPinRep = (SbaPinRep) q13.f80346a;
        o2 o2Var = (o2) q13.f80347b;
        this.f103348k = sbaPinRep;
        this.f103347j = o2Var;
        a1 a1Var = new a1(context, pinalytics, null, null);
        a1Var.B = new androidx.appcompat.widget.q(sbaPinRep, i13);
        Intrinsics.checkNotNullParameter(sbaPinRep, "<this>");
        a1Var.q(sbaPinRep.getCornerRadius());
        wa2.z zVar = pinFeatureConfig.f128869k0;
        if (zVar != null) {
            a1Var.s(zVar);
        }
        this.f103346i = a1Var;
        sbaPinRep.addToView(this);
        a1 a1Var2 = this.f103346i;
        if (a1Var2 != null) {
            addView(a1Var2);
        } else {
            Intrinsics.r("pinSavedOverlayView");
            throw null;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f103338a == null) {
            this.f103338a = new ye2.o(this);
        }
        return this.f103338a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f103338a == null) {
            this.f103338a = new ye2.o(this);
        }
        return this.f103338a.generatedComponent();
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f103348k;
    }

    @Override // y92.g
    public final boolean resizable() {
        return true;
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f103349l = pin;
        ni1.c0 c0Var = (ni1.c0) this.f103345h.getValue();
        SbaPinRep sbaPinRep = this.f103348k;
        o2 o2Var = this.f103347j;
        l3.c.X0(pin, i13, sbaPinRep, o2Var, c0Var);
        a1 a1Var = this.f103346i;
        if (a1Var == null) {
            Intrinsics.r("pinSavedOverlayView");
            throw null;
        }
        a1Var.t(pin, i13);
        o2Var.c().a(ni1.b1.f90598a);
        requestLayout();
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        f30 f30Var = this.f103349l;
        if (f30Var != null) {
            return f30Var.getUid();
        }
        return null;
    }
}
