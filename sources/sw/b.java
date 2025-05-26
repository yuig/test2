package sw;

import com.pinterest.api.model.f30;
import h32.f1;
import h32.v0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f115399a;

    public b(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f115399a = pinalytics;
    }

    public final void c(rw.a step, f30 f30Var, Long l13) {
        Intrinsics.checkNotNullParameter(step, "step");
        f1 f1Var = f1.OM_SDK_FUNNEL_STEP;
        String uid = f30Var != null ? f30Var.getUid() : null;
        HashMap hashMap = new HashMap();
        hashMap.put("om_step", step.getValue());
        Unit unit = Unit.f80348a;
        v0 v0Var = new v0();
        v0Var.C = Long.valueOf(l13 != null ? l13.longValue() * 1000000 : 0L);
        this.f115399a.H(f1Var, uid, null, hashMap, v0Var, false);
    }
}
