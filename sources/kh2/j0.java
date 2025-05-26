package kh2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79543i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f79544j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l0 f79545k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l3 f79546l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b1 f79547m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k kVar, l0 l0Var, b1 b1Var, l3 l3Var) {
        super(0);
        this.f79544j = kVar;
        this.f79545k = l0Var;
        this.f79547m = b1Var;
        this.f79546l = l3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f79543i;
        b1 b1Var = this.f79547m;
        l3 l3Var = this.f79546l;
        l0 l0Var = this.f79545k;
        k kVar = this.f79544j;
        switch (i13) {
            case 0:
                sg2.b bVar = (sg2.b) ((m) kVar).b();
                if (bVar.a()) {
                    return null;
                }
                l0Var.getClass();
                rl2.u[] uVarArr = l0.f79585m;
                qg2.d dVar = (qg2.d) l0Var.f79588c.a(l0Var, uVarArr[1]);
                if (dVar == null) {
                    return null;
                }
                bh2.a aVar = (bh2.a) l0Var.f79590e.a(l0Var, uVarArr[3]);
                if (aVar == null) {
                    return null;
                }
                if (((Boolean) bVar.f112877b.f117603d.getValue()).booleanValue()) {
                    return new di2.q(aVar, ((d1) b1Var).f79455a, l0Var.f79586a);
                }
                return new di2.p(((m3) l3Var).a(ki2.g.f79813e), dVar);
            default:
                if (((sg2.b) ((m) kVar).b()).a()) {
                    return null;
                }
                l0Var.getClass();
                rl2.u[] uVarArr2 = l0.f79585m;
                dh2.e eVar = (dh2.e) l0Var.f79593h.a(l0Var, uVarArr2[6]);
                if (eVar == null) {
                    return null;
                }
                ah2.j jVar = (ah2.j) l0Var.f79596k.a(l0Var, uVarArr2[9]);
                if (jVar == null) {
                    return null;
                }
                m3 m3Var = (m3) l3Var;
                d1 d1Var = (d1) b1Var;
                return new ch2.d(eVar, jVar, m3Var.a(ki2.g.f79812d), m3Var.a(ki2.g.f79811c), d1Var.f79455a, d1Var.f79456b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k kVar, l0 l0Var, l3 l3Var, b1 b1Var) {
        super(0);
        this.f79544j = kVar;
        this.f79545k = l0Var;
        this.f79546l = l3Var;
        this.f79547m = b1Var;
    }
}
