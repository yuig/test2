package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ed implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f4811a;

    public ed(n1 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.f4811a = adEventEmitter;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("name");
        if (str == null) {
            gk0.d("App event with no name parameter.", null);
            return Unit.f80348a;
        }
        Unit a13 = this.f4811a.a(str, (String) map.get("info"), cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_APP_EVENT;
    }
}
