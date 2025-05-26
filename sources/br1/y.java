package br1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m1.n3;

/* loaded from: classes2.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f23833r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f23834s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f23835t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f23835t = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        y yVar = new y(this.f23835t, cVar);
        yVar.f23834s = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f23833r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f23834s;
            al1.j jVar = new al1.j(11, this.f23835t);
            this.f23833r = 1;
            if (n3.d(wVar, jVar, null, null, this, 13) == aVar) {
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
