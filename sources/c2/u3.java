package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u3 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d3 f25275i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p1.m1 f25276j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f25277k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f25278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f25279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25280n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function2 f25281o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25282p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Function2 f25283q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function2 f25284r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25285s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a4 f25286t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(d3 d3Var, p1.m1 m1Var, long j13, long j14, boolean z13, int i13, Function2 function2, kl2.l lVar, Function2 function22, Function2 function23, kl2.l lVar2, a4 a4Var) {
        super(3);
        this.f25275i = d3Var;
        this.f25276j = m1Var;
        this.f25277k = j13;
        this.f25278l = j14;
        this.f25279m = z13;
        this.f25280n = i13;
        this.f25281o = function2;
        this.f25282p = lVar;
        this.f25283q = function22;
        this.f25284r = function23;
        this.f25285s = lVar2;
        this.f25286t = a4Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u2.q qVar = (u2.q) obj;
        i2.o oVar = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        int i13 = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((i2.s) oVar).h(qVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        i2.s sVar2 = (i2.s) oVar;
        d3 d3Var = this.f25275i;
        boolean h10 = sVar2.h(d3Var);
        p1.m1 m1Var = this.f25276j;
        boolean h13 = h10 | sVar2.h(m1Var);
        Object J2 = sVar2.J();
        if (h13 || J2 == i2.n.f71185a) {
            J2 = new e2(i13, d3Var, m1Var);
            sVar2.g0(J2);
        }
        r3.i iVar = p1.o1.f98564a;
        j1.h(ao2.m0.p(qVar, t3.p.f116119m, new m1.d0(1, (Function1) J2)), null, this.f25277k, this.f25278l, null, 0.0f, q2.i.c(1772955108, new t3(this.f25279m, this.f25280n, this.f25281o, this.f25282p, this.f25283q, this.f25275i, this.f25284r, this.f25285s, this.f25286t), sVar2), sVar2, 1572864, 50);
        return Unit.f80348a;
    }
}
