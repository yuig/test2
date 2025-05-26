package ads_mobile_sdk;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rj1 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f10660a;

    public rj1(n1 adEventEmitter) {
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        this.f10660a = adEventEmitter;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        Object o13 = this.f10660a.o(cVar);
        return o13 == cl2.a.COROUTINE_SUSPENDED ? o13 : Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_NATIVE_IMPRESSION;
    }
}
