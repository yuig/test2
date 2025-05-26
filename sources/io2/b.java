package io2;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes2.dex */
public final class b implements xp2.a {

    /* renamed from: a, reason: collision with root package name */
    public final do2.i f73322a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext f73323b;

    public b(do2.i iVar, CoroutineContext coroutineContext) {
        this.f73322a = iVar;
        this.f73323b = coroutineContext;
    }

    @Override // xp2.a
    public final void b(xp2.b bVar) {
        bVar.getClass();
        bVar.d(new f(this.f73322a, bVar, this.f73323b));
    }
}
