package a;

import ads_mobile_sdk.Cdo;
import ads_mobile_sdk.kl0;
import ads_mobile_sdk.wi0;
import ads_mobile_sdk.ym0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements cd {
    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        d3 d3Var = ym0Var.f14327m;
        if (d3Var != null) {
            Cdo closeReason = Cdo.f4380c;
            wi0 wi0Var = (wi0) d3Var;
            Intrinsics.checkNotNullParameter(closeReason, "closeReason");
            wi0Var.f13062r = closeReason;
            androidx.activity.o oVar = wi0Var.f13055j;
            if (oVar != null) {
                oVar.finish();
            }
        }
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_CLOSE;
    }
}
