package w80;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import s80.y6;

/* loaded from: classes5.dex */
public final class q1 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128370i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y6 f128371j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f128372k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function0 f128373l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u2.q f128374m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f128375n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f128376o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(y6 y6Var, Function0 function0, Function0 function02, u2.q qVar, int i13, int i14, int i15) {
        super(2);
        this.f128370i = i15;
        this.f128371j = y6Var;
        this.f128372k = function0;
        this.f128373l = function02;
        this.f128374m = qVar;
        this.f128375n = i13;
        this.f128376o = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f128370i;
        int i15 = this.f128375n;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                gh0.b.u(this.f128371j, this.f128372k, this.f128373l, this.f128374m, oVar, p13, this.f128376o);
                break;
            default:
                int p14 = i2.u.p(i15 | 1);
                gh0.b.v(this.f128371j, this.f128372k, this.f128373l, this.f128374m, oVar, p14, this.f128376o);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f128370i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
