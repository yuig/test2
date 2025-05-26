package br1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;
import lb.l0;
import t3.z3;

/* loaded from: classes4.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f23799r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j0 f23800s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f23801t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j0 j0Var, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f23800s = j0Var;
        this.f23801t = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f23800s, this.f23801t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f23799r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i V = l0.V(bs1.c.Z1(new z3(i14, this.f23800s)));
            y1.b bVar = new y1.b(this.f23801t, 16);
            this.f23799r = 1;
            if (V.collect(bVar, this) == aVar) {
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
