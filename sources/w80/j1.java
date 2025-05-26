package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class j1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128315r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f128316s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j1.d f128317t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(long j13, j1.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f128316s = j13;
        this.f128317t = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j1(this.f128316s, this.f128317t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128315r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f128315r = 1;
            if (lb.l0.S(this.f128316s, this) == aVar) {
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
        Float f13 = new Float(1.0f);
        j1.o1 q13 = j1.e.q(0.75f, 200.0f, null, 4);
        this.f128315r = 2;
        if (j1.d.c(this.f128317t, f13, q13, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
