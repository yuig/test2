package eo2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class p0 implements bl2.c, dl2.e {

    /* renamed from: a, reason: collision with root package name */
    public final bl2.c f59813a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f59814b;

    public p0(bl2.c cVar, CoroutineContext coroutineContext) {
        this.f59813a = cVar;
        this.f59814b = coroutineContext;
    }

    @Override // dl2.e
    public final dl2.e getCallerFrame() {
        bl2.c cVar = this.f59813a;
        if (cVar instanceof dl2.e) {
            return (dl2.e) cVar;
        }
        return null;
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return this.f59814b;
    }

    @Override // bl2.c
    public final void resumeWith(Object obj) {
        this.f59813a.resumeWith(obj);
    }
}
