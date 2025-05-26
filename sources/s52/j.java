package s52;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes4.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f111182r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f111183s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, bl2.c cVar) {
        super(2, cVar);
        this.f111183s = nVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f111183s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f111182r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = n.f111189g1;
            n nVar = this.f111183s;
            do2.i d2 = nVar.n9().f111211k.d();
            i iVar = new i(nVar, null);
            this.f111182r = 1;
            if (l0.I(d2, iVar, this) == aVar) {
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
