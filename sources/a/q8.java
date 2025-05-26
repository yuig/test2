package a;

import ads_mobile_sdk.cn0;
import ads_mobile_sdk.kl0;
import ads_mobile_sdk.kn0;
import ads_mobile_sdk.ym0;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class q8 implements cd {
    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        if (map.keySet().contains("start")) {
            kn0 a13 = ym0Var.a();
            a13.f7404j.incrementAndGet();
            a13.a();
            return Unit.f80348a;
        }
        if (map.keySet().contains("stop")) {
            kn0 a14 = ym0Var.a();
            a14.f7404j.decrementAndGet();
            a14.a();
            return Unit.f80348a;
        }
        if (!map.keySet().contains("cancel")) {
            return Unit.f80348a;
        }
        kn0 a15 = ym0Var.a();
        a15.f7403i.set(true);
        kotlin.jvm.internal.j.z(a15.f7397c, null, null, new cn0(a15, null), 3);
        a15.a();
        Unit unit = Unit.f80348a;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        return unit;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_DELAY_PAGE_LOADED;
    }

    @Override // a.cd
    public final boolean c() {
        return true;
    }
}
