package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l1 f127254i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f127255j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f127256k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h4.g0 f127257l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h4.f0 f127258m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h4.o f127259n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h4.y f127260o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127261p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f127262q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t1.b f127263r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(l1 l1Var, boolean z13, boolean z14, h4.g0 g0Var, h4.f0 f0Var, h4.o oVar, h4.y yVar, b2.t0 t0Var, ao2.j0 j0Var, t1.b bVar) {
        super(1);
        this.f127254i = l1Var;
        this.f127255j = z13;
        this.f127256k = z14;
        this.f127257l = g0Var;
        this.f127258m = f0Var;
        this.f127259n = oVar;
        this.f127260o = yVar;
        this.f127261p = t0Var;
        this.f127262q = j0Var;
        this.f127263r = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        r2 d2;
        l1 l1Var = this.f127254i;
        z2.x xVar = (z2.x) ((z2.v) obj);
        if (l1Var.b() != xVar.isFocused()) {
            l1Var.f127360f.setValue(Boolean.valueOf(xVar.isFocused()));
            if (l1Var.b() && this.f127255j && !this.f127256k) {
                g1.m(this.f127257l, l1Var, this.f127258m, this.f127259n, this.f127260o);
            } else {
                g1.i(l1Var);
            }
            if (xVar.isFocused() && (d2 = l1Var.d()) != null) {
                kotlin.jvm.internal.j.z(this.f127262q, null, null, new f0(this.f127263r, this.f127258m, this.f127254i, d2, this.f127260o, null), 3);
            }
            if (!xVar.isFocused()) {
                this.f127261p.g(null);
            }
        }
        return Unit.f80348a;
    }
}
