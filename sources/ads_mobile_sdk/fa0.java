package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fa0 implements a.zc {

    /* renamed from: a, reason: collision with root package name */
    public final sy0 f5089a;

    public fa0(sy0 internalJavascriptEngine) {
        Intrinsics.checkNotNullParameter(internalJavascriptEngine, "internalJavascriptEngine");
        this.f5089a = internalJavascriptEngine;
    }

    @Override // a.n8
    public final Object a(String str, String str2, bl2.c cVar) {
        return this.f5089a.a(str, str2, cVar);
    }

    @Override // a.n8
    public final Object a(nm.u uVar, String str, bl2.c cVar) {
        Object a13 = this.f5089a.a(uVar, "sendMessageToNativeJs", cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }

    @Override // a.zc
    public final a.ce a() {
        return this.f5089a.f11280a.b();
    }

    @Override // a.zc
    public final Object a(bl2.c cVar) {
        Object c13 = this.f5089a.c(cVar);
        return c13 == cl2.a.COROUTINE_SUSPENDED ? c13 : Unit.f80348a;
    }
}
