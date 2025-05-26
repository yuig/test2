package com.pinterest.boardAutoCollages;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f44594r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f44595s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, bl2.c cVar) {
        super(2, cVar);
        this.f44595s = qVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f44595s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f44594r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = q.T0;
            q qVar = this.f44595s;
            do2.i d2 = qVar.k9().f44588i.d();
            o oVar = new o(qVar, null);
            this.f44594r = 1;
            if (lb.l0.I(d2, oVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
