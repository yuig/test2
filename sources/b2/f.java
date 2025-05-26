package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21137i = 2;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f21138j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f21139k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f21140l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f21141m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(br1.f0 f0Var, boolean z13, n4.e eVar, int i13) {
        super(2);
        this.f21140l = f0Var;
        this.f21138j = z13;
        this.f21141m = eVar;
        this.f21139k = i13;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f21137i;
        boolean z13 = this.f21138j;
        int i15 = this.f21139k;
        Object obj = this.f21141m;
        Object obj2 = this.f21140l;
        switch (i14) {
            case 0:
                c0.d.d((u2.q) obj2, (Function0) obj, z13, oVar, i2.u.p(i15 | 1));
                break;
            case 1:
                jk.r.a(z13, (m4.h) obj2, (t0) obj, oVar, i2.u.p(i15 | 1));
                break;
            default:
                br1.e0.n((br1.f0) obj2, z13, (n4.e) obj, oVar, i2.u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f21137i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(u2.q qVar, Function0 function0, boolean z13, int i13) {
        super(2);
        this.f21140l = qVar;
        this.f21141m = function0;
        this.f21138j = z13;
        this.f21139k = i13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z13, m4.h hVar, t0 t0Var, int i13) {
        super(2);
        this.f21138j = z13;
        this.f21140l = hVar;
        this.f21141m = t0Var;
        this.f21139k = i13;
    }
}
