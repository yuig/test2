package a;

import ads_mobile_sdk.kl0;
import ads_mobile_sdk.wi0;
import ads_mobile_sdk.ym0;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class r1 implements cd {
    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("disabled");
        boolean z13 = str != null && Boolean.parseBoolean(str);
        d3 d3Var = ym0Var.f14327m;
        if (d3Var != null) {
            ((wi0) d3Var).f13063s.set(!z13);
        }
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_BACK_BUTTON;
    }
}
