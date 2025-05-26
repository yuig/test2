package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class b2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85295r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g2 f85296s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f85297t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(g2 g2Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f85296s = g2Var;
        this.f85297t = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b2(this.f85296s, this.f85297t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85295r;
        if (i13 == 0) {
            ue.c.H(obj);
            o2 o2Var = this.f85296s.C;
            k1.v1 v1Var = k1.v1.UserInput;
            a2 a2Var = new a2(this.f85297t, null);
            this.f85295r = 1;
            if (o2Var.e(v1Var, a2Var, this) == aVar) {
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
