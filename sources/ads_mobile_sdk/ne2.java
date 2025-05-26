package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ne2 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final a.zc f8762a;

    public ne2(a.zc nativeJavascriptEngine) {
        Intrinsics.checkNotNullParameter(nativeJavascriptEngine, "nativeJavascriptEngine");
        this.f8762a = nativeJavascriptEngine;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        nm.u uVar = new nm.u();
        for (Map.Entry entry : map.entrySet()) {
            uVar.u((String) entry.getKey(), (String) entry.getValue());
        }
        Object a13 = this.f8762a.a(uVar, "sendMessageToNativeJs", cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_SEND_MESSAGE_TO_NATIVE_JS;
    }
}
