package vc;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class w extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f125582r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z13, bl2.c cVar) {
        super(3, cVar);
        this.f125582r = z13;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).longValue();
        return new w(this.f125582r, (bl2.c) obj3).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        return Boolean.valueOf(!this.f125582r);
    }
}
