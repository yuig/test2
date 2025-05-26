package s1;

import a.cb;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m1.m1;
import q3.f1;

/* loaded from: classes2.dex */
public final class n0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f110486r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0 f110487s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f110488t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f110489u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 o0Var, float f13, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f110487s = o0Var;
        this.f110488t = f13;
        this.f110489u = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n0(this.f110487s, this.f110488t, this.f110489u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((m1) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f110486r;
        o0 o0Var = this.f110487s;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f110486r = 1;
            Object m13 = o0Var.f110512v.m(this);
            if (m13 != aVar) {
                m13 = Unit.f80348a;
            }
            if (m13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        float f13 = this.f110488t;
        double d2 = f13;
        if (-0.5d > d2 || d2 > 0.5d) {
            throw new IllegalArgumentException(cb.h("pageOffsetFraction ", f13, " is not within the range -0.5 to 0.5").toString());
        }
        int k13 = o0Var.k(this.f110489u);
        i0 i0Var = o0Var.f110493c;
        i0Var.f110449b.i(k13);
        i0Var.f110453f.b(k13);
        i0Var.f110450c.i(f13);
        i0Var.f110452e = null;
        f1 f1Var = (f1) o0Var.f110513w.getValue();
        if (f1Var != null) {
            ((s3.k0) f1Var).k();
        }
        return Unit.f80348a;
    }
}
