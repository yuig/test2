package m90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f86695r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f86696s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f86696s = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f86696s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f86695r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = w.X0;
            w wVar = this.f86696s;
            do2.i d2 = wVar.l9().f86638i.d();
            r rVar = new r(wVar, null);
            this.f86695r = 1;
            if (lb.l0.I(d2, rVar, this) == aVar) {
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
