package mq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes3.dex */
public final class b0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f87954r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f87955s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h0 h0Var, bl2.c cVar) {
        super(2, cVar);
        this.f87955s = h0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b0(this.f87955s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f87954r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = h0.f87984k0;
            h0 h0Var = this.f87955s;
            do2.i a13 = do2.c0.a(h0Var.c8().f136487o.d(), d.f87966n);
            a0 a0Var = new a0(h0Var, null);
            this.f87954r = 1;
            if (l0.I(a13, a0Var, this) == aVar) {
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
