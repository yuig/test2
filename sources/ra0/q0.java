package ra0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class q0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f106981r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t1.b f106982s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t1.b bVar, bl2.c cVar) {
        super(2, cVar);
        this.f106982s = bVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q0(this.f106982s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f106981r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f106981r = 1;
            if (lb.l0.S(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        this.f106981r = 2;
        if (((t1.d) this.f106982s).a(null, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
