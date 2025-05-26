package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ak1 implements a.q6 {

    /* renamed from: a, reason: collision with root package name */
    public final a.zc f2433a;

    public ak1(a.zc nativeJavascriptEngine) {
        Intrinsics.checkNotNullParameter(nativeJavascriptEngine, "nativeJavascriptEngine");
        this.f2433a = nativeJavascriptEngine;
    }

    @Override // a.q6
    public final Object a(bl2.c cVar) {
        Object a13 = this.f2433a.a(cVar);
        return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
    }
}
