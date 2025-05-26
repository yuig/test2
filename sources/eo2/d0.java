package eo2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d0 implements CoroutineContext {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f59753a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f59754b;

    public d0(CoroutineContext coroutineContext, Throwable th3) {
        this.f59753a = coroutineContext;
        this.f59754b = th3;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.f59753a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.h hVar) {
        return this.f59753a.get(hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.h hVar) {
        return this.f59753a.minusKey(hVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.f59753a.plus(coroutineContext);
    }
}
