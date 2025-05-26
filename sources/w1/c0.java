package w1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1 f127175i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b4.q0 f127176j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f127177k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f127178l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p2 f127179m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h4.f0 f127180n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h4.p0 f127181o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u2.q f127182p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u2.q f127183q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u2.q f127184r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u2.q f127185s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t1.b f127186t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127187u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f127188v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f127189w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f127190x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h4.y f127191y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n4.b f127192z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(l1 l1Var, b4.q0 q0Var, int i13, int i14, p2 p2Var, h4.f0 f0Var, h4.p0 p0Var, u2.q qVar, u2.q qVar2, u2.q qVar3, u2.q qVar4, t1.b bVar, b2.t0 t0Var, boolean z13, boolean z14, Function1 function1, h4.y yVar, n4.b bVar2) {
        super(2);
        this.f127175i = l1Var;
        this.f127176j = q0Var;
        this.f127177k = i13;
        this.f127178l = i14;
        this.f127179m = p2Var;
        this.f127180n = f0Var;
        this.f127181o = p0Var;
        this.f127182p = qVar;
        this.f127183q = qVar2;
        this.f127184r = qVar3;
        this.f127185s = qVar4;
        this.f127186t = bVar;
        this.f127187u = t0Var;
        this.f127188v = z13;
        this.f127189w = z14;
        this.f127190x = function1;
        this.f127191y = yVar;
        this.f127192z = bVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        u2.q a3Var;
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        u2.n nVar = u2.n.f120041b;
        l1 l1Var = this.f127175i;
        u2.q d2 = androidx.compose.foundation.layout.e.d(nVar, ((n4.e) l1Var.f127361g.getValue()).f89175a, Float.NaN);
        t3.p pVar = t3.p.f116119m;
        int i13 = this.f127177k;
        int i14 = this.f127178l;
        b4.q0 q0Var = this.f127176j;
        u2.q p13 = ao2.m0.p(d2, pVar, new y0(i13, i14, q0Var));
        i2.s sVar2 = (i2.s) oVar;
        boolean j13 = sVar2.j(l1Var);
        Object J2 = sVar2.J();
        if (j13 || J2 == i2.n.f71185a) {
            J2 = new j1.q0(l1Var, 11);
            sVar2.g0(J2);
        }
        Function0 function0 = (Function0) J2;
        p2 p2Var = this.f127179m;
        m1.f1 f1Var = (m1.f1) p2Var.f127447e.getValue();
        h4.f0 f0Var = this.f127180n;
        long j14 = f0Var.f67560b;
        int i15 = b4.p0.f21640c;
        int i16 = (int) (j14 >> 32);
        long j15 = p2Var.f127446d;
        if (i16 == ((int) (j15 >> 32)) && (i16 = (int) (j14 & 4294967295L)) == ((int) (4294967295L & j15))) {
            i16 = b4.p0.e(j14);
        }
        p2Var.f127446d = f0Var.f67560b;
        h4.n0 p14 = g1.p(this.f127181o, f0Var.f67559a);
        int i17 = k2.f127349a[f1Var.ordinal()];
        if (i17 == 1) {
            a3Var = new a3(p2Var, i16, p14, function0);
        } else {
            if (i17 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a3Var = new a1(p2Var, i16, p14, function0);
        }
        ph.a.b(androidx.compose.foundation.relocation.a.b(ao2.m0.p(androidx.compose.ui.draw.a.c(p13).j(a3Var).j(this.f127182p).j(this.f127183q), pVar, new i1.h(q0Var, 5)).j(this.f127184r).j(this.f127185s), this.f127186t), q2.i.c(-363167407, new b0(this.f127187u, this.f127175i, this.f127188v, this.f127189w, this.f127190x, this.f127180n, this.f127191y, this.f127192z, this.f127178l), sVar2), sVar2, 48, 0);
        return Unit.f80348a;
    }
}
