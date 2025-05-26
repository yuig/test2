package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85647r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85648s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1 f85649t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f85650u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f85649t = a1Var;
        this.f85650u = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        z0 z0Var = new z0(this.f85649t, this.f85650u, cVar);
        z0Var.f85648s = obj;
        return z0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85647r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f85648s;
            a1 a1Var = this.f85649t;
            kl2.l lVar = a1Var.B;
            long h10 = n4.o.h(this.f85650u, a1Var.C ? -1.0f : 1.0f);
            f1 f1Var = a1Var.f85282y;
            v0 v0Var = w0.f85613a;
            Float f13 = new Float(f1Var == f1.Vertical ? n4.o.e(h10) : n4.o.d(h10));
            this.f85647r = 1;
            if (lVar.invoke(j0Var, f13, this) == aVar) {
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
