package br1;

import ao2.j0;
import i2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n4.e f23821r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q1 f23822s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(n4.e eVar, q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f23821r = eVar;
        this.f23822s = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u(this.f23821r, this.f23822s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n4.e eVar = this.f23821r;
        float f13 = eVar.f89175a;
        q1 q1Var = this.f23822s;
        n4.e eVar2 = (n4.e) q1Var.getValue();
        if (Float.compare(f13, eVar2 != null ? eVar2.f89175a : 0) > 0) {
            q1Var.setValue(eVar);
        }
        return Unit.f80348a;
    }
}
