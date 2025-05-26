package u80;

import java.util.List;
import kh2.k3;
import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import om0.o1;
import om0.t1;
import s1.o0;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120922i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f120923j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f120924k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f120925l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f120926m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f120927n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f120928o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f120929p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f120930q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, u2.q qVar, o0 o0Var, float f13, float f14, Function1 function1, int i13, int i14) {
        super(2);
        this.f120928o = list;
        this.f120923j = qVar;
        this.f120929p = o0Var;
        this.f120924k = f13;
        this.f120925l = f14;
        this.f120930q = function1;
        this.f120926m = i13;
        this.f120927n = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f120922i;
        int i15 = this.f120926m;
        Object obj = this.f120930q;
        Object obj2 = this.f120929p;
        Object obj3 = this.f120928o;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                float f13 = this.f120924k;
                int i16 = this.f120927n;
                n3.h((h) obj3, f13, this.f120925l, (c) obj2, this.f120923j, (i) obj, oVar, p13, i16);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                u2.q qVar = this.f120923j;
                int i17 = this.f120927n;
                ia0.l.b((List) obj3, qVar, (o0) obj2, this.f120924k, this.f120925l, (Function1) obj, oVar, p14, i17);
                break;
            case 2:
                Function0 function0 = (Function0) obj;
                int p15 = i2.u.p(i15 | 1);
                u2.q qVar2 = this.f120923j;
                int i18 = this.f120927n;
                k3.q(qVar2, (o1.l) obj3, this.f120924k, this.f120925l, (Function0) obj2, function0, oVar, p15, i18);
                break;
            default:
                int p16 = i2.u.p(i15 | 1);
                o1.e((t1) obj3, this.f120923j, this.f120924k, this.f120925l, (Function1) obj2, (Function0) obj, oVar, p16, this.f120927n);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f120922i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t1 t1Var, u2.q qVar, float f13, float f14, Function1 function1, Function0 function0, int i13, int i14) {
        super(2);
        this.f120928o = t1Var;
        this.f120923j = qVar;
        this.f120924k = f13;
        this.f120925l = f14;
        this.f120929p = function1;
        this.f120930q = function0;
        this.f120926m = i13;
        this.f120927n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u2.q qVar, o1.l lVar, float f13, float f14, Function0 function0, Function0 function02, int i13, int i14) {
        super(2);
        this.f120923j = qVar;
        this.f120928o = lVar;
        this.f120924k = f13;
        this.f120925l = f14;
        this.f120929p = function0;
        this.f120930q = function02;
        this.f120926m = i13;
        this.f120927n = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, float f13, float f14, c cVar, u2.q qVar, i iVar, int i13, int i14) {
        super(2);
        this.f120928o = hVar;
        this.f120924k = f13;
        this.f120925l = f14;
        this.f120929p = cVar;
        this.f120923j = qVar;
        this.f120930q = iVar;
        this.f120926m = i13;
        this.f120927n = i14;
    }
}
