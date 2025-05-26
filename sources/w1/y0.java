package w1;

import i2.v3;

/* loaded from: classes2.dex */
public final class y0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127583i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f127584j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b4.q0 f127585k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(int i13, int i14, b4.q0 q0Var) {
        super(3);
        this.f127583i = i13;
        this.f127584j = i14;
        this.f127585k = q0Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        i2.s sVar = (i2.s) ((i2.o) obj2);
        sVar.W(408240218);
        int i13 = this.f127583i;
        int i14 = this.f127584j;
        g1.D(i13, i14);
        u2.n nVar = u2.n.f120041b;
        if (i13 == 1 && i14 == Integer.MAX_VALUE) {
            sVar.r(false);
            return nVar;
        }
        n4.b bVar = (n4.b) sVar.m(t3.f2.f115983f);
        g4.d dVar = (g4.d) sVar.m(t3.f2.f115986i);
        n4.k kVar = (n4.k) sVar.m(t3.f2.f115989l);
        b4.q0 q0Var = this.f127585k;
        boolean h10 = sVar.h(q0Var) | sVar.h(kVar);
        Object J2 = sVar.J();
        am.d dVar2 = i2.n.f71185a;
        if (h10 || J2 == dVar2) {
            J2 = rl2.g0.f0(q0Var, kVar);
            sVar.g0(J2);
        }
        b4.q0 q0Var2 = (b4.q0) J2;
        boolean h13 = sVar.h(dVar) | sVar.h(q0Var2);
        Object J3 = sVar.J();
        if (h13 || J3 == dVar2) {
            b4.g0 g0Var = q0Var2.f21648a;
            g4.e eVar = g0Var.f21580f;
            g4.l lVar = g0Var.f21577c;
            if (lVar == null) {
                lVar = g4.l.f63469d;
            }
            g4.j jVar = g0Var.f21578d;
            int i15 = jVar != null ? jVar.f63465a : 0;
            g4.k kVar2 = g0Var.f21579e;
            J3 = ((g4.f) dVar).b(eVar, lVar, i15, kVar2 != null ? kVar2.f63466a : 1);
            sVar.g0(J3);
        }
        v3 v3Var = (v3) J3;
        boolean h14 = sVar.h(v3Var.getValue()) | sVar.h(bVar) | sVar.h(dVar) | sVar.h(q0Var) | sVar.h(kVar);
        Object J4 = sVar.J();
        if (h14 || J4 == dVar2) {
            J4 = Integer.valueOf((int) (b2.a(q0Var2, bVar, dVar, b2.f127170a, 1) & 4294967295L));
            sVar.g0(J4);
        }
        int intValue = ((Number) J4).intValue();
        boolean h15 = sVar.h(v3Var.getValue()) | sVar.h(bVar) | sVar.h(dVar) | sVar.h(q0Var) | sVar.h(kVar);
        Object J5 = sVar.J();
        if (h15 || J5 == dVar2) {
            StringBuilder sb3 = new StringBuilder();
            String str = b2.f127170a;
            sb3.append(str);
            sb3.append('\n');
            sb3.append(str);
            J5 = Integer.valueOf((int) (b2.a(q0Var2, bVar, dVar, sb3.toString(), 2) & 4294967295L));
            sVar.g0(J5);
        }
        int intValue2 = ((Number) J5).intValue() - intValue;
        Integer valueOf = i13 == 1 ? null : Integer.valueOf(((i13 - 1) * intValue2) + intValue);
        Integer valueOf2 = i14 != Integer.MAX_VALUE ? Integer.valueOf(((i14 - 1) * intValue2) + intValue) : null;
        u2.q d2 = androidx.compose.foundation.layout.e.d(nVar, valueOf != null ? bVar.f0(valueOf.intValue()) : Float.NaN, valueOf2 != null ? bVar.f0(valueOf2.intValue()) : Float.NaN);
        sVar.r(false);
        return d2;
    }
}
