package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class z1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f85651r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g2 f85652s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f85653t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(g2 g2Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f85652s = g2Var;
        this.f85653t = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new z1(this.f85652s, this.f85653t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85651r;
        if (i13 == 0) {
            ue.c.H(obj);
            o2 o2Var = this.f85652s.C;
            this.f85651r = 1;
            f1 f1Var = o2Var.f85496d;
            f1 f1Var2 = f1.Horizontal;
            long j13 = this.f85653t;
            long b13 = f1Var == f1Var2 ? n4.o.b(j13, 0.0f, 0.0f, 1) : n4.o.b(j13, 0.0f, 0.0f, 2);
            m2 m2Var = new m2(o2Var, null);
            k1.e2 e2Var = o2Var.f85494b;
            if (e2Var == null || !(o2Var.f85493a.e() || o2Var.f85493a.d())) {
                invokeSuspend = ((m2) m2Var.create(new n4.o(b13), this)).invokeSuspend(Unit.f80348a);
                if (invokeSuspend != aVar) {
                    invokeSuspend = Unit.f80348a;
                }
            } else {
                invokeSuspend = e2Var.e(b13, m2Var, this);
                if (invokeSuspend != aVar) {
                    invokeSuspend = Unit.f80348a;
                }
            }
            if (invokeSuspend == aVar) {
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
