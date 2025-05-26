package a;

import ads_mobile_sdk.gk0;
import ads_mobile_sdk.kl0;
import ads_mobile_sdk.ym0;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class r8 implements cd {
    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        ok.e0 e0Var = gk0.f5596a;
        gk0.c("Received log message: " + map.get("string"), null);
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_LOG;
    }
}
