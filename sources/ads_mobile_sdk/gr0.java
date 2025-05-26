package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gr0 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final fg f5675a;

    public gr0(fg appState) {
        Intrinsics.checkNotNullParameter(appState, "appState");
        this.f5675a = appState;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str = (String) map.get("key");
        String str2 = (String) map.get("value");
        if (str == null || str.length() == 0) {
            return Unit.f80348a;
        }
        fg fgVar = this.f5675a;
        fgVar.getClass();
        Object a13 = fg.a(fgVar, str, str2, cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_IN_MEMORY_SDK_CORE_DATA;
    }
}
