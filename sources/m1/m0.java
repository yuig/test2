package m1;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ t0 f85453i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o3.f f85454j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(t0 t0Var, o3.f fVar) {
        super(3);
        this.f85453i = t0Var;
        this.f85454j = fVar;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        n3.q qVar = (n3.q) obj;
        n3.q qVar2 = (n3.q) obj2;
        long j13 = ((a3.c) obj3).f482a;
        t0 t0Var = this.f85453i;
        if (((Boolean) t0Var.f85579q.invoke(qVar)).booleanValue()) {
            if (!t0Var.f85584v) {
                if (t0Var.f85582t == null) {
                    t0Var.f85582t = lb.l0.b(Integer.MAX_VALUE, null, 6);
                }
                t0Var.f85584v = true;
                kotlin.jvm.internal.j.z(t0Var.z0(), null, null, new s0(t0Var, null), 3);
            }
            kg.n.b(this.f85454j, qVar);
            long g13 = a3.c.g(qVar2.f89109c, j13);
            co2.q qVar3 = t0Var.f85582t;
            if (qVar3 != null) {
                qVar3.g(new x(g13));
            }
        }
        return Unit.f80348a;
    }
}
