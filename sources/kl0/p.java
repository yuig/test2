package kl0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f80107r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f80108s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f80108s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f80108s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f80107r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = z.f80128e2;
            z zVar = this.f80108s;
            do2.i d2 = zVar.o9().f72554j.d();
            o oVar = new o(zVar, null);
            this.f80107r = 1;
            if (l0.I(d2, oVar, this) == aVar) {
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
