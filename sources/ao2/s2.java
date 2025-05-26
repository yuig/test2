package ao2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class s2 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s2 f20205c = new s2();

    @Override // ao2.f0
    public final void g(CoroutineContext coroutineContext, Runnable runnable) {
        w2 w2Var = (w2) coroutineContext.get(w2.f20230c);
        if (w2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        w2Var.f20231b = true;
    }

    @Override // ao2.f0
    public final f0 m(int i13, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // ao2.f0
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
