package br1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;
import lb.l0;
import nx.r0;
import t3.t4;

/* loaded from: classes2.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f23812r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f23813s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f23814t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(j0 j0Var, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f23813s = j0Var;
        this.f23814t = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new r(this.f23813s, this.f23814t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f23812r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i V = l0.V(bs1.c.Z1(new r0(this.f23813s, 25)));
            t4 t4Var = new t4(this.f23814t, 2);
            this.f23812r = 1;
            if (V.collect(t4Var, this) == aVar) {
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
