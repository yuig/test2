package la0;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;
import ni1.t2;

/* loaded from: classes5.dex */
public final class x1 extends FrameLayout implements q1, qa2.f0, nx.v {

    /* renamed from: a, reason: collision with root package name */
    public final ni1.d0 f82480a;

    /* renamed from: b, reason: collision with root package name */
    public final nx.d0 f82481b;

    /* renamed from: c, reason: collision with root package name */
    public final o2 f82482c;

    /* renamed from: d, reason: collision with root package name */
    public final ti1.f f82483d;

    /* renamed from: e, reason: collision with root package name */
    public final qa2.h0 f82484e;

    /* renamed from: f, reason: collision with root package name */
    public final wa2.m f82485f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f82486g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(Context context, qa2.j0 pinGridCellFactory, t2 viewModelFactory, ni1.d0 vmStateConverterFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinGridCellFactory, "pinGridCellFactory");
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(vmStateConverterFactory, "vmStateConverterFactory");
        this.f82480a = vmStateConverterFactory;
        nx.d0 a13 = nx.c1.a();
        this.f82481b = a13;
        wa2.m mVar = new wa2.m(-10485769, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false);
        this.f82485f = mVar;
        this.f82486g = xk2.m.b(new lr.v(this, 24));
        androidx.lifecycle.z r13 = b7.c.r(this);
        ao2.j0 S = r13 != null ? bf.b.S(r13) : dl2.b.e();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SbaPinRep sbaPinRep = (SbaPinRep) ((qa2.d) pinGridCellFactory).a(context2, true);
        o2 a14 = t2.a(viewModelFactory, S, null, 14);
        sbaPinRep.setPinalytics(a13);
        sbaPinRep.applyUnMigratedPFCFields(mVar.f128875n0, mVar.f128861g0, null, false, mVar.M);
        sbaPinRep.setEventIntake(a14.c());
        kotlin.jvm.internal.j.z(S, null, null, new w1(a14, sbaPinRep, null), 3);
        this.f82483d = sbaPinRep;
        this.f82482c = a14;
        Intrinsics.checkNotNullParameter(sbaPinRep, "<set-?>");
        this.f82484e = sbaPinRep;
        addView(sbaPinRep);
    }

    public final void a(xa0.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        f30 f30Var = state.f134388a;
        if (f30Var != null) {
            setPin(f30Var, state.f134389b);
        }
    }

    @Override // qa2.f0
    public final qa2.h0 getInternalCell() {
        return this.f82484e;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f82484e.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f82484e.markImpressionStart();
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f82483d.bindDisplayState(this.f82482c.b(((ni1.c0) this.f82486g.getValue()).a(i13, pin), false));
    }
}
