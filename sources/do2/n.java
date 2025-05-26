package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f55861r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f55862s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f55862s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f55862s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f55861r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f55861r = 1;
            Object collect = this.f55862s.collect(eo2.i0.f59780a, this);
            if (collect != aVar) {
                collect = Unit.f80348a;
            }
            if (collect == aVar) {
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
