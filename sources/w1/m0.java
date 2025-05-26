package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h4.n0 f127383i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h4.f0 f127384j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f127385k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f127386l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h4.o f127387m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l1 f127388n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h4.y f127389o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127390p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ z2.s f127391q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(h4.n0 n0Var, h4.f0 f0Var, boolean z13, boolean z14, h4.o oVar, l1 l1Var, h4.y yVar, b2.t0 t0Var, z2.s sVar) {
        super(1);
        this.f127383i = n0Var;
        this.f127384j = f0Var;
        this.f127385k = z13;
        this.f127386l = z14;
        this.f127387m = oVar;
        this.f127388n = l1Var;
        this.f127389o = yVar;
        this.f127390p = t0Var;
        this.f127391q = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        z3.y yVar = (z3.y) obj;
        b4.g gVar = this.f127383i.f67595a;
        rl2.u[] uVarArr = z3.w.f140760a;
        z3.x xVar = z3.t.f140756y;
        rl2.u[] uVarArr2 = z3.w.f140760a;
        rl2.u uVar = uVarArr2[16];
        xVar.a(yVar, gVar);
        h4.f0 f0Var = this.f127384j;
        long j13 = f0Var.f67560b;
        z3.x xVar2 = z3.t.f140757z;
        rl2.u uVar2 = uVarArr2[17];
        xVar2.a(yVar, new b4.p0(j13));
        boolean z13 = this.f127385k;
        if (!z13) {
            ((z3.j) yVar).e(z3.t.f140741j, Unit.f80348a);
        }
        boolean z14 = this.f127386l;
        boolean z15 = z13 && !z14;
        z3.x xVar3 = z3.t.G;
        rl2.u uVar3 = uVarArr2[23];
        xVar3.a(yVar, Boolean.valueOf(z15));
        l1 l1Var = this.f127388n;
        z3.w.c(yVar, new e0(l1Var, 2));
        if (z15) {
            z3.j jVar = (z3.j) yVar;
            jVar.e(z3.i.f140682i, new z3.a(null, new j1.x0(10, l1Var, yVar)));
            str = null;
            jVar.e(z3.i.f140686m, new z3.a(null, new k0(this.f127386l, this.f127385k, this.f127388n, yVar, this.f127384j, 0)));
        } else {
            str = null;
        }
        z3.j jVar2 = (z3.j) yVar;
        jVar2.e(z3.i.f140681h, new z3.a(str, new l1.i(1, this.f127389o, this.f127384j, this.f127390p, this.f127388n, this.f127385k)));
        h4.o oVar = this.f127387m;
        int i13 = oVar.f67602e;
        k1.v0 v0Var = new k1.v0(6, l1Var, oVar);
        jVar2.e(z3.t.A, new h4.n(i13));
        jVar2.e(z3.i.f140687n, new z3.a(str, v0Var));
        jVar2.e(z3.i.f140675b, new z3.a(str, new l0(l1Var, this.f127391q, z14, 0)));
        b2.t0 t0Var = this.f127390p;
        jVar2.e(z3.i.f140676c, new z3.a(str, new j0(t0Var, 1)));
        if (!b4.p0.b(f0Var.f67560b)) {
            jVar2.e(z3.i.f140688o, new z3.a(str, new j0(t0Var, 2)));
            if (z13 && !z14) {
                jVar2.e(z3.i.f140689p, new z3.a(str, new j0(t0Var, 3)));
            }
        }
        if (z13 && !z14) {
            jVar2.e(z3.i.f140690q, new z3.a(str, new j0(t0Var, 0)));
        }
        return Unit.f80348a;
    }
}
