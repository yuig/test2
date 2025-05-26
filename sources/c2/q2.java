package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25089i = 3;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f25090j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f25091k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f25092l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f25093m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f25094n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f25095o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ xk2.g f25096p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(String str, Function1 function1, u2.q qVar, boolean z13, Function2 function2, int i13, int i14) {
        super(2);
        this.f25094n = str;
        this.f25095o = function1;
        this.f25091k = qVar;
        this.f25090j = z13;
        this.f25096p = function2;
        this.f25092l = i13;
        this.f25093m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f25089i;
        int i15 = this.f25092l;
        xk2.g gVar = this.f25096p;
        Object obj = this.f25095o;
        Object obj2 = this.f25094n;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                boolean z13 = this.f25090j;
                r2.a((Function0) obj2, this.f25091k, z13, (o1.l) obj, (Function2) gVar, oVar, p13, this.f25093m);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                int i16 = this.f25093m;
                kh2.b0.h((s80.j) obj2, this.f25090j, this.f25091k, (Function1) obj, (Function1) gVar, oVar, p14, i16);
                break;
            case 2:
                int p15 = i2.u.p(i15 | 1);
                boolean z14 = this.f25090j;
                int i17 = this.f25093m;
                kh2.b0.p((s80.j) obj2, (w80.h1) obj, this.f25091k, (Function1) gVar, z14, oVar, p15, i17);
                break;
            case 3:
                kh2.j.e((String) obj2, (Function1) obj, this.f25091k, this.f25090j, (Function2) gVar, oVar, i2.u.p(i15 | 1), this.f25093m);
                break;
            default:
                int p16 = i2.u.p(i15 | 1);
                u2.q qVar = this.f25091k;
                int i18 = this.f25093m;
                kh2.s0.l((uc0.k1) obj2, (Function1) obj, this.f25090j, qVar, (Function1) gVar, oVar, p16, i18);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25089i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(Function0 function0, u2.q qVar, boolean z13, o1.l lVar, Function2 function2, int i13, int i14) {
        super(2);
        this.f25094n = function0;
        this.f25091k = qVar;
        this.f25090j = z13;
        this.f25095o = lVar;
        this.f25096p = function2;
        this.f25092l = i13;
        this.f25093m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(s80.j jVar, w80.h1 h1Var, u2.q qVar, Function1 function1, boolean z13, int i13, int i14) {
        super(2);
        this.f25094n = jVar;
        this.f25095o = h1Var;
        this.f25091k = qVar;
        this.f25096p = function1;
        this.f25090j = z13;
        this.f25092l = i13;
        this.f25093m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(s80.j jVar, boolean z13, u2.q qVar, Function1 function1, Function1 function12, int i13, int i14) {
        super(2);
        this.f25094n = jVar;
        this.f25090j = z13;
        this.f25091k = qVar;
        this.f25095o = function1;
        this.f25096p = function12;
        this.f25092l = i13;
        this.f25093m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(uc0.k1 k1Var, Function1 function1, boolean z13, u2.q qVar, Function1 function12, int i13, int i14) {
        super(2);
        this.f25094n = k1Var;
        this.f25095o = function1;
        this.f25090j = z13;
        this.f25091k = qVar;
        this.f25096p = function12;
        this.f25092l = i13;
        this.f25093m = i14;
    }
}
