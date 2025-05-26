package we1;

import android.content.Context;
import android.widget.FrameLayout;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import so.ba;
import so.jb;
import so.oa;

/* loaded from: classes5.dex */
public class r0 extends FrameLayout implements nx.v, yk1.n, qa2.f0, af2.c {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f129583l = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f129584a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f129585b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f129586c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f129587d;

    /* renamed from: e, reason: collision with root package name */
    public final ni1.t2 f129588e;

    /* renamed from: f, reason: collision with root package name */
    public final ni1.d0 f129589f;

    /* renamed from: g, reason: collision with root package name */
    public final qa2.j0 f129590g;

    /* renamed from: h, reason: collision with root package name */
    public final wa2.m f129591h;

    /* renamed from: i, reason: collision with root package name */
    public final ni1.o2 f129592i;

    /* renamed from: j, reason: collision with root package name */
    public final SbaPinRep f129593j;

    /* renamed from: k, reason: collision with root package name */
    public ni1.c0 f129594k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context, ao2.j0 scope, nx.d0 pinalytics, HashMap hashMap) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        if (!this.f129585b) {
            this.f129585b = true;
            oa oaVar = ((jb) ((s0) generatedComponent())).f113483a;
            this.f129588e = (ni1.t2) oaVar.f113950uc.get();
            this.f129589f = (ni1.d0) oaVar.Gb.get();
            this.f129590g = oaVar.v2();
        }
        this.f129586c = pinalytics;
        this.f129587d = hashMap;
        wa2.m mVar = new wa2.m(-1, -4194369, 1023, null, null, null, null, null, new bb2.e(0.0f, (bb2.f) null, 7), null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.f129591h = mVar;
        qa2.j0 j0Var = this.f129590g;
        if (j0Var == null) {
            Intrinsics.r("pgcFactory");
            throw null;
        }
        ni1.t2 t2Var = this.f129588e;
        if (t2Var == null) {
            Intrinsics.r("viewModelFactory");
            throw null;
        }
        Pair q13 = l3.c.q(context, mVar, pinalytics, scope, j0Var, t2Var);
        SbaPinRep sbaPinRep = (SbaPinRep) q13.f80346a;
        ni1.o2 o2Var = (ni1.o2) q13.f80347b;
        this.f129593j = sbaPinRep;
        this.f129592i = o2Var;
        sbaPinRep.addToView(this);
    }

    public void a(int i13, f30 pin, wa2.m config) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(config, "config");
        wa2.m mVar = this.f129591h;
        b(i13, pin, wa2.m.a(config, false, false, false, false, false, false, false, false, false, false, false, false, false, mVar.f128893x, false, false, false, false, false, null, mVar.M, false, null, null, null, false, null, null, false, false, null, null, false, -8388609, -65, 1023));
    }

    public final void b(int i13, f30 f30Var, wa2.m mVar) {
        ni1.c0 c0Var = this.f129594k;
        SbaPinRep sbaPinRep = this.f129593j;
        if (c0Var == null || !Intrinsics.d(c0Var.f90606a, mVar)) {
            ni1.d0 d0Var = this.f129589f;
            if (d0Var == null) {
                Intrinsics.r("vmStateConverterFactory");
                throw null;
            }
            this.f129594k = ((ba) d0Var).a(mVar, new mq.w(this, 15), new a.z0(this, 20));
            sbaPinRep.applyUnMigratedPFCFields(mVar.f128875n0, mVar.f128861g0, mVar.f128855d0, mVar.f128879p0, mVar.M);
        }
        ni1.c0 c0Var2 = this.f129594k;
        if (c0Var2 != null) {
            l3.c.X0(f30Var, i13, sbaPinRep, this.f129592i, c0Var2);
        } else {
            Intrinsics.r("vmStateConverter");
            throw null;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f129584a == null) {
            this.f129584a = new ye2.o(this);
        }
        return this.f129584a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f129584a == null) {
            this.f129584a = new ye2.o(this);
        }
        return this.f129584a.generatedComponent();
    }

    @Override // qa2.f0
    public final qa2.h0 getInternalCell() {
        return this.f129593j;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f129593j.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f129593j.markImpressionStart();
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        b(i13, pin, this.f129591h);
    }
}
