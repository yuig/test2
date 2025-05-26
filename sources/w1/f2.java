package w1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class f2 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1 f127243i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127244j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h4.f0 f127245k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f127246l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f127247m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h4.y f127248n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ z2 f127249o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function1 f127250p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f127251q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(l1 l1Var, b2.t0 t0Var, h4.f0 f0Var, boolean z13, boolean z14, h4.y yVar, z2 z2Var, e0 e0Var, int i13) {
        super(3);
        this.f127243i = l1Var;
        this.f127244j = t0Var;
        this.f127245k = f0Var;
        this.f127246l = z13;
        this.f127247m = z14;
        this.f127248n = yVar;
        this.f127249o = z2Var;
        this.f127250p = e0Var;
        this.f127251q = i13;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        i2.s sVar = (i2.s) ((i2.o) obj2);
        sVar.W(851809892);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = new b2.z0();
            sVar.g0(J2);
        }
        b2.z0 z0Var = (b2.z0) J2;
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = new t0();
            sVar.g0(J3);
        }
        h4.y yVar = this.f127248n;
        z2 z2Var = this.f127249o;
        d2 d2Var = new d2(this.f127243i, this.f127244j, this.f127245k, this.f127246l, this.f127247m, z0Var, yVar, z2Var, (t0) J3, this.f127250p, this.f127251q);
        u2.n nVar = u2.n.f120041b;
        boolean j13 = sVar.j(d2Var);
        Object J4 = sVar.J();
        if (j13 || J4 == dVar) {
            J4 = new e2(1, d2Var, d2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
            sVar.g0(J4);
        }
        u2.q a13 = androidx.compose.ui.input.key.a.a(nVar, (Function1) ((rl2.g) J4));
        sVar.r(false);
        return a13;
    }
}
