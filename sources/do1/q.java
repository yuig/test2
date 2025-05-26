package do1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f55689r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f55690s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ se0.o f55691t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i13, se0.o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f55690s = i13;
        this.f55691t = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q(this.f55690s, this.f55691t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f55689r;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = this.f55690s + 1000;
            this.f55689r = 1;
            if (l0.S(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f55691t.stop();
        return Unit.f80348a;
    }
}
