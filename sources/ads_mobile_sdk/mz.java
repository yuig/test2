package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class mz implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f8431a;

    public mz(n1 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.f8431a = adEventEmitter;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("asset");
        if (str != null && str.length() != 0) {
            Unit a13 = this.f8431a.a(str, cVar);
            return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
        }
        Intrinsics.checkNotNullParameter("No asset name provided in custom click GMSG.", "message");
        ft2.a(true, "No asset name provided in custom click GMSG.", null);
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_CUSTOM_CLICK;
    }
}
