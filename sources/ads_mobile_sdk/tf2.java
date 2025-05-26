package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class tf2 implements a.s8 {

    /* renamed from: a, reason: collision with root package name */
    public final zr f11532a;

    public tf2(zr consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        this.f11532a = consentManager;
    }

    @Override // a.s8
    public final Object a(nm.u uVar, bl2.c cVar) {
        Object a13;
        if (k41.a(uVar, "clear", "").length() > 0) {
            Object j13 = this.f11532a.j(cVar);
            return j13 == cl2.a.COROUTINE_SUSPENDED ? j13 : Unit.f80348a;
        }
        String a14 = k41.a(uVar, "cookie", "");
        return (a14.length() <= 0 || (a13 = this.f11532a.a(a14, cVar)) != cl2.a.COROUTINE_SUSPENDED) ? Unit.f80348a : a13;
    }
}
