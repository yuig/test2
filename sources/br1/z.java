package br1;

import ao2.j0;
import k1.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f23836r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t2 f23837s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t2 t2Var, bl2.c cVar) {
        super(2, cVar);
        this.f23837s = t2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z(this.f23837s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f23836r;
        if (i13 == 0) {
            ue.c.H(obj);
            t2 t2Var = this.f23837s;
            int h10 = t2Var.f78030d.h();
            this.f23836r = 1;
            if (b7.c.P(t2Var, h10 - t2Var.f78027a.h(), this) == aVar) {
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
