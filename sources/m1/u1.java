package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85599r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85600s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o2 f85601t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f85602u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f85603v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(o2 o2Var, long j13, kotlin.jvm.internal.g0 g0Var, bl2.c cVar) {
        super(2, cVar);
        this.f85601t = o2Var;
        this.f85602u = j13;
        this.f85603v = g0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        u1 u1Var = new u1(this.f85601t, this.f85602u, this.f85603v, cVar);
        u1Var.f85600s = obj;
        return u1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((l2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85599r;
        if (i13 == 0) {
            ue.c.H(obj);
            l2 l2Var = (l2) this.f85600s;
            o2 o2Var = this.f85601t;
            float f13 = o2Var.f(this.f85602u);
            t1 t1Var = new t1(this.f85603v, o2Var, l2Var);
            this.f85599r = 1;
            if (j1.e.e(0.0f, f13, null, t1Var, this, 12) == aVar) {
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
