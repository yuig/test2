package com.pinterest.feature.settings.notifications;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f48254r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v f48255s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, bl2.c cVar) {
        super(2, cVar);
        this.f48255s = vVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r(this.f48255s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f48254r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = v.J0;
            v vVar = this.f48255s;
            do2.i d2 = ((z0) vVar.F0.getValue()).f48291d.d();
            q qVar = new q(vVar, null);
            this.f48254r = 1;
            if (lb.l0.I(d2, qVar, this) == aVar) {
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
