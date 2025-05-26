package r02;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f105779r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f105780s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f105780s = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f105780s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f105779r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = r.f105790l0;
            r rVar = this.f105780s;
            do2.i d2 = ((s02.i) rVar.f105797i0.getValue()).f110320d.d();
            n nVar = new n(rVar, null);
            this.f105779r = 1;
            if (lb.l0.I(d2, nVar, this) == aVar) {
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
