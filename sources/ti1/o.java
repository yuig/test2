package ti1;

import android.content.Context;
import ao2.j0;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import df.j1;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import ni1.a2;
import ni1.c0;
import ni1.o1;
import ni1.o2;
import ni1.t2;
import ni1.y2;
import nx.d0;
import qa2.e0;
import qa2.h0;
import so.ba;
import so.oa;

/* loaded from: classes5.dex */
public final class o implements nx.v, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f117727a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f117728b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f117729c;

    /* renamed from: d, reason: collision with root package name */
    public final wa2.m f117730d;

    /* renamed from: e, reason: collision with root package name */
    public final r f117731e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f117732f;

    /* renamed from: g, reason: collision with root package name */
    public final qa2.d0 f117733g;

    /* renamed from: h, reason: collision with root package name */
    public a f117734h;

    /* renamed from: i, reason: collision with root package name */
    public e f117735i;

    /* renamed from: j, reason: collision with root package name */
    public final qa2.j0 f117736j;

    /* renamed from: k, reason: collision with root package name */
    public final ni1.d0 f117737k;

    /* renamed from: l, reason: collision with root package name */
    public final t2 f117738l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f117739m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f117740n;

    public o(Context context, d0 pinalytics, j0 scope, wa2.m initialPinFeatureConfig, r sbaIdentifier, ni1.d0 d0Var, qa2.d0 d0Var2, int i13) {
        initialPinFeatureConfig = (i13 & 8) != 0 ? a2.a() : initialPinFeatureConfig;
        d0Var = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : d0Var;
        d0Var2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? initialPinFeatureConfig.f128855d0 : d0Var2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(initialPinFeatureConfig, "initialPinFeatureConfig");
        Intrinsics.checkNotNullParameter(sbaIdentifier, "sbaIdentifier");
        this.f117727a = context;
        this.f117728b = pinalytics;
        this.f117729c = scope;
        this.f117730d = initialPinFeatureConfig;
        this.f117731e = sbaIdentifier;
        this.f117732f = null;
        this.f117733g = d0Var2;
        Context context2 = kb0.a.f79058b;
        Object b03 = j1.b0(i.class, f0.W());
        Intrinsics.checkNotNullExpressionValue(b03, "get(...)");
        i iVar = (i) b03;
        this.f117734h = ps0.m.d(initialPinFeatureConfig);
        this.f117736j = ((oa) iVar).v2();
        this.f117737k = d0Var == null ? (ni1.d0) ((oa) iVar).Gb.get() : d0Var;
        this.f117738l = (t2) ((oa) iVar).f113950uc.get();
        this.f117739m = xk2.m.b(new n(this, 0));
        this.f117740n = xk2.m.b(new n(this, 1));
    }

    public final e a() {
        e eVar = this.f117735i;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("innerCell");
        throw null;
    }

    public final void b() {
        e dVar;
        if (this.f117735i != null) {
            throw new IllegalStateException("PinGridCell already initialized");
        }
        h0 a13 = ((qa2.d) this.f117736j).a(this.f117727a, this.f117731e.o());
        boolean z13 = a13 instanceof LegoPinGridCellImpl;
        wa2.m pinFeatureConfig = this.f117730d;
        d0 d0Var = this.f117728b;
        if (z13) {
            LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) a13;
            legoPinGridCellImpl.setPinalytics(d0Var);
            Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
            legoPinGridCellImpl.s(pinFeatureConfig.e());
            dVar = new c(legoPinGridCellImpl);
        } else {
            if (!(a13 instanceof SbaPinRep)) {
                throw new IllegalStateException("PinGridCellFactory returned unrecognized format");
            }
            SbaPinRep sbaPinRep = (SbaPinRep) a13;
            sbaPinRep.setPinalytics(d0Var);
            sbaPinRep.applyUnMigratedPFCFields(pinFeatureConfig.f128875n0, pinFeatureConfig.f128861g0, pinFeatureConfig.f128855d0, pinFeatureConfig.f128879p0, pinFeatureConfig.M);
            xk2.v vVar = this.f117739m;
            sbaPinRep.setEventIntake(((o2) vVar.getValue()).c());
            kotlin.jvm.internal.j.z(this.f117729c, null, null, new k(this, sbaPinRep, null), 3);
            dVar = new d(sbaPinRep, (o2) vVar.getValue());
        }
        this.f117735i = dVar;
    }

    public final void c(Integer num) {
        e eVar = this.f117735i;
        if (eVar == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar instanceof c) {
            ((c) eVar).f117707a.P1 = num;
        } else if (eVar instanceof d) {
            ((d) eVar).f117709b.c().a(new o1(num));
        }
    }

    public final void d(f30 pin, int i13, wa2.m pinFeatureConfig, Function1 customization) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(customization, "customization");
        e eVar = this.f117735i;
        if (eVar == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar instanceof c) {
            LegoPinGridCellImpl legoPinGridCellImpl = ((c) eVar).f117707a;
            legoPinGridCellImpl.getClass();
            Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
            legoPinGridCellImpl.s(pinFeatureConfig.e());
            legoPinGridCellImpl.setPin(pin, i13);
            return;
        }
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            dVar.f117708a.applyUnMigratedPFCFields(pinFeatureConfig.f128875n0, pinFeatureConfig.f128861g0, pinFeatureConfig.f128855d0, pinFeatureConfig.f128879p0, pinFeatureConfig.M);
            int i14 = 0;
            dVar.f117708a.bindDisplayState(((o2) this.f117739m.getValue()).b((y2) customization.invoke(((ba) this.f117737k).a(pinFeatureConfig, new g(this, i14), new h(this, i14)).a(i13, pin)), false));
        }
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        e eVar = this.f117735i;
        if (eVar == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar instanceof c) {
            return ((c) eVar).f117707a.markImpressionEnd();
        }
        if (eVar instanceof d) {
            return ((d) eVar).f117708a.markImpressionEnd();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        e eVar = this.f117735i;
        if (eVar == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar instanceof c) {
            return ((c) eVar).f117707a.markImpressionStart();
        }
        if (eVar instanceof d) {
            return ((d) eVar).f117708a.markImpressionStart();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        m customization = m.f117724i;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(customization, "customization");
        e eVar = this.f117735i;
        if (eVar == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar instanceof c) {
            ((c) eVar).f117707a.setPin(pin, i13);
            return;
        }
        if (eVar instanceof d) {
            o2 o2Var = (o2) this.f117739m.getValue();
            y2 it = ((c0) this.f117740n.getValue()).a(i13, pin);
            Intrinsics.checkNotNullParameter(it, "it");
            ((d) eVar).f117708a.bindDisplayState(o2Var.b(it, false));
        }
    }
}
