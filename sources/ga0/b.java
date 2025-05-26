package ga0;

import i2.o;
import i2.u;
import jk.v;
import kh2.b0;
import kh2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import om0.c0;
import om0.f0;
import om0.k0;
import om0.l0;
import om0.m0;
import om0.o0;
import om0.o1;
import om0.p1;
import ra0.t0;
import u2.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64591i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f64592j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f64593k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f64594l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f64595m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f64596n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f64597o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(float f13, q qVar, t0 t0Var, Function2 function2, int i13, int i14) {
        super(2);
        this.f64591i = 1;
        this.f64592j = f13;
        this.f64593k = qVar;
        this.f64596n = t0Var;
        this.f64597o = function2;
        this.f64594l = i13;
        this.f64595m = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f64591i;
        int i15 = this.f64594l;
        Object obj = this.f64597o;
        Object obj2 = this.f64596n;
        switch (i14) {
            case 0:
                int p13 = u.p(i15 | 1);
                float f13 = this.f64592j;
                int i16 = this.f64595m;
                j1.m((i) obj2, this.f64593k, f13, (Function0) obj, oVar, p13, i16);
                break;
            case 1:
                int p14 = u.p(i15 | 1);
                q qVar = this.f64593k;
                int i17 = this.f64595m;
                v.c(this.f64592j, qVar, (t0) obj2, (Function2) obj, oVar, p14, i17);
                break;
            case 2:
                int p15 = u.p(i15 | 1);
                float f14 = this.f64592j;
                int i18 = this.f64595m;
                o0.a((String) obj2, this.f64593k, (m0) obj, f14, oVar, p15, i18);
                break;
            case 3:
                int p16 = u.p(i15 | 1);
                o0.c((k0) obj2, this.f64593k, (l0) obj, this.f64592j, oVar, p16, this.f64595m);
                break;
            case 4:
                int p17 = u.p(i15 | 1);
                int i19 = this.f64595m;
                b0.q((c0) obj2, this.f64593k, (f0) obj, this.f64592j, oVar, p17, i19);
                break;
            default:
                int p18 = u.p(i15 | 1);
                int i23 = this.f64595m;
                o1.d((p1) obj2, this.f64593k, this.f64592j, (Function0) obj, oVar, p18, i23);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f64591i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, q qVar, Object obj2, float f13, int i13, int i14, int i15) {
        super(2);
        this.f64591i = i15;
        this.f64596n = obj;
        this.f64593k = qVar;
        this.f64597o = obj2;
        this.f64592j = f13;
        this.f64594l = i13;
        this.f64595m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(u50.o oVar, q qVar, float f13, Function0 function0, int i13, int i14, int i15) {
        super(2);
        this.f64591i = i15;
        this.f64596n = oVar;
        this.f64593k = qVar;
        this.f64592j = f13;
        this.f64597o = function0;
        this.f64594l = i13;
        this.f64595m = i14;
    }
}
