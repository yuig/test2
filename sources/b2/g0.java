package b2;

import j1.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class g0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f21150r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j1.d f21151s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f21152t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(long j13, j1.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f21151s = dVar;
        this.f21152t = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g0(this.f21152t, this.f21151s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f21150r;
        if (i13 == 0) {
            ue.c.H(obj);
            a3.c cVar = new a3.c(this.f21152t);
            o1 o1Var = i0.f21167d;
            this.f21150r = 1;
            if (j1.d.c(this.f21151s, cVar, o1Var, this) == aVar) {
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
