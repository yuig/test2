package cj0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27840r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f27841s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f27841s = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f27841s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f27840r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = p.X0;
            do2.i d2 = this.f27841s.l9().f27812j.d();
            k kVar = new k(2, this.f27841s, p.class, "bindDisplayState", "bindDisplayState(Lcom/pinterest/feature/board/automagical/AutomagicalBoardDisplayState;)V", 4);
            this.f27840r = 1;
            if (lb.l0.I(d2, kVar, this) == aVar) {
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
