package ads_mobile_sdk;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class zs2 implements ao2.a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a.pg f14913b = new a.pg();

    /* renamed from: a, reason: collision with root package name */
    public final os2 f14914a = new os2();

    @Override // ao2.a0
    public final ao2.a0 copyForChild() {
        return new zs2();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return kotlin.coroutines.g.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.b(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.h getKey() {
        return f14913b;
    }

    @Override // ao2.a0
    public final CoroutineContext mergeForChild(CoroutineContext.Element overwritingElement) {
        Intrinsics.checkNotNullParameter(overwritingElement, "overwritingElement");
        return new zs2();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.h hVar) {
        return kotlin.coroutines.g.c(this, hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.g.d(coroutineContext, this);
    }

    @Override // ao2.n2
    public final void restoreThreadContext(CoroutineContext context, Object obj) {
        ns2 oldState = (ns2) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        this.f14914a.getClass();
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        ps2 b13 = qs2.b();
        b13.f9803c = null;
        qs2.a(b13, oldState.f8964a);
        b13.f9803c = oldState.f8965b;
    }

    @Override // ao2.n2
    public final Object updateThreadContext(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        os2 os2Var = this.f14914a;
        os2Var.getClass();
        ps2 b13 = qs2.b();
        ns2 ns2Var = new ns2(qs2.a(b13, os2Var.f9426a), b13.f9803c);
        b13.f9803c = os2Var;
        return ns2Var;
    }
}
