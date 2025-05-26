package br1;

import ao2.j0;
import i2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f23802r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q1 f23803s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f23803s = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f23803s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f23802r;
        if (i13 == 0) {
            ue.c.H(obj);
            zn2.a aVar2 = zn2.b.f142311b;
            long P2 = dl2.b.P2(30, zn2.d.MILLISECONDS);
            this.f23802r = 1;
            if (l0.T(P2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        u2.q qVar = e0.f23779a;
        this.f23803s.setValue(Boolean.TRUE);
        return Unit.f80348a;
    }
}
