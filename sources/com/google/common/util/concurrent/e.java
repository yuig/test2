package com.google.common.util.concurrent;

/* loaded from: classes3.dex */
public final class e extends g {
    @Override // com.google.common.util.concurrent.g
    public final Object C(Object obj, Object obj2) {
        m mVar = (m) obj;
        c0 apply = mVar.apply(obj2);
        if (apply != null) {
            return apply;
        }
        throw new NullPointerException(bs1.c.q1("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", mVar));
    }

    @Override // com.google.common.util.concurrent.g
    public final void D(Object obj) {
        x((c0) obj);
    }
}
