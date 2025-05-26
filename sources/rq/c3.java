package rq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class c3 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f109123r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ gx.m f109124s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(gx.m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f109124s = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c3 c3Var = new c3(this.f109124s, cVar);
        c3Var.f109123r = obj;
        return c3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c3) create((gx.a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f109124s.a((gx.a) this.f109123r);
        return Unit.f80348a;
    }
}
