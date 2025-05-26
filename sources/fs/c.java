package fs;

import bk1.u1;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import com.pinterest.api.model.ln;
import com.pinterest.api.model.pe;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.d;
import lh0.g1;
import lh0.z3;
import n60.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f62827a;

    /* renamed from: b, reason: collision with root package name */
    public final es.a f62828b;

    public c(d experiments, es.a adFormats) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        this.f62827a = experiments;
        this.f62828b = adFormats;
    }

    public final String a(f30 f30Var) {
        return ((es.c) this.f62828b).c(f30Var);
    }

    public final String b(f30 f30Var) {
        return ((es.c) this.f62828b).p(f30Var);
    }

    public final boolean c(f30 f30Var, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (f30Var.d5().booleanValue() && f(f30Var, z13, z14, z15)) {
            es.c cVar = (es.c) this.f62828b;
            if ((cVar.A(f30Var) || (cVar.Q(f30Var) && cVar.p(f30Var) != null)) && z16) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(f30 f30Var) {
        if (f30Var == null) {
            return false;
        }
        return b40.w0(f30Var) || this.f62827a.i();
    }

    public final boolean e(f30 f30Var, boolean z13, boolean z14) {
        return (f30Var == null || !d(f30Var) || !o.B(f30Var, "getIsPromoted(...)") || f30Var.i5().booleanValue() || z13 || z14) ? false : true;
    }

    public final boolean f(f30 f30Var, boolean z13, boolean z14, boolean z15) {
        if (f30Var == null) {
            return false;
        }
        return (!z13 || z15) && d(f30Var) && o.B(f30Var, "getIsPromoted(...)") && !f30Var.i5().booleanValue() && !z14;
    }

    public final boolean g(f30 f30Var, boolean z13, boolean z14, a aVar, boolean z15, Function0 function0) {
        g t33;
        pe U;
        pe U2;
        if (!e(f30Var, z13, z14) || ((es.c) this.f62828b).i(f30Var) == null) {
            return false;
        }
        g t34 = f30Var.t3();
        if ((t34 != null && (U2 = t34.U()) != null && !U2.f()) || (t33 = f30Var.t3()) == null || (U = t33.U()) == null) {
            return false;
        }
        if (U.e().intValue() != aVar.ordinal()) {
            return false;
        }
        function0.invoke();
        return z15;
    }

    public final boolean h(f30 pin, boolean z13, boolean z14, boolean z15, Function0 activateDealIndicatorExperiment) {
        ln e03;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateDealIndicatorExperiment, "activateDealIndicatorExperiment");
        if (!e(pin, z13, z14)) {
            return false;
        }
        g t33 = pin.t3();
        Integer i13 = (t33 == null || (e03 = t33.e0()) == null) ? null : e03.i();
        int value = ge0.c.DEAL.getValue();
        if (i13 == null || i13.intValue() != value) {
            return false;
        }
        activateDealIndicatorExperiment.invoke();
        return z15;
    }

    public final boolean i(f30 f30Var, boolean z13, u1 activateExperiment) {
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        if (!d(f30Var)) {
            return false;
        }
        es.a aVar = this.f62828b;
        if (!((es.c) aVar).U(f30Var)) {
            return false;
        }
        es.c cVar = (es.c) aVar;
        if (!cVar.A(f30Var) && (!cVar.Q(f30Var) || cVar.p(f30Var) == null)) {
            return false;
        }
        activateExperiment.invoke();
        return z13;
    }

    public final boolean j(f30 pin, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        d dVar = this.f62827a;
        boolean a13 = dVar.a();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) dVar.f83323a;
        return k(pin, z13, z14, z15, a13, g1Var.o("android_deals_collection_expansion", "enabled", z3Var) || g1Var.l("android_deals_collection_expansion"), new b(dVar, 2));
    }

    public final boolean k(f30 pin, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Function0 activateExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        if (!c(pin, z13, z14, z15, z16)) {
            return false;
        }
        activateExperiment.invoke();
        return z17;
    }

    public final boolean l(f30 pin, boolean z13, boolean z14, boolean z15, Function0 activateDealIndicatorExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateDealIndicatorExperiment, "activateDealIndicatorExperiment");
        es.c cVar = (es.c) this.f62828b;
        if (cVar.c(pin) == null || !cVar.A(pin) || !e(pin, z13, z14)) {
            return false;
        }
        activateDealIndicatorExperiment.invoke();
        return z15;
    }

    public final boolean m(f30 pin, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        a aVar = a.HEADER;
        d dVar = this.f62827a;
        dVar.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) dVar.f83323a;
        return g(pin, z13, z14, aVar, g1Var.o("personalized_deal_indicator", "enabled", z3Var) || g1Var.l("personalized_deal_indicator"), new b(dVar, 4));
    }

    public final boolean n(f30 pin, boolean z13, boolean z14, boolean z15, boolean z16, Function0 activateDealIndicatorExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateDealIndicatorExperiment, "activateDealIndicatorExperiment");
        if (!f(pin, z13, z14, z16)) {
            return false;
        }
        es.c cVar = (es.c) this.f62828b;
        if ((!cVar.A(pin) && (!cVar.Q(pin) || cVar.p(pin) == null)) || !z16) {
            return false;
        }
        activateDealIndicatorExperiment.invoke();
        return z15;
    }

    public final boolean o(f30 pin, boolean z13, boolean z14, Boolean bool, boolean z15, Function0 activateDealIndicatorExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateDealIndicatorExperiment, "activateDealIndicatorExperiment");
        Boolean bool2 = Boolean.TRUE;
        if (!f(pin, z13, z14, Intrinsics.d(bool, bool2))) {
            return false;
        }
        es.a aVar = this.f62828b;
        if (((es.c) aVar).A(pin)) {
            activateDealIndicatorExperiment.invoke();
            return z15;
        }
        es.c cVar = (es.c) aVar;
        if (!cVar.Q(pin) || cVar.p(pin) == null) {
            return false;
        }
        if (Intrinsics.d(bool, bool2)) {
            activateDealIndicatorExperiment.invoke();
            return z15;
        }
        if (((es.c) aVar).o(pin) == null) {
            return false;
        }
        activateDealIndicatorExperiment.invoke();
        return z15;
    }

    public final boolean p(f30 pin, boolean z13, boolean z14, boolean z15, Function0 activateDealIndicatorExperiment) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateDealIndicatorExperiment, "activateDealIndicatorExperiment");
        es.c cVar = (es.c) this.f62828b;
        if (cVar.o(pin) == null || !cVar.Q(pin) || !e(pin, z13, z14)) {
            return false;
        }
        activateDealIndicatorExperiment.invoke();
        return z15;
    }
}
