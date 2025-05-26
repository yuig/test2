package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import q3.k1;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21183i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f21184j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f21185k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21186l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f21187m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(u2.q qVar, Function2 function2, int i13, int i14, int i15) {
        super(2);
        this.f21183i = i15;
        this.f21184j = qVar;
        this.f21185k = function2;
        this.f21186l = i13;
        this.f21187m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f21183i;
        Function2 function2 = this.f21185k;
        u2.q qVar = this.f21184j;
        int i15 = this.f21187m;
        int i16 = this.f21186l;
        switch (i14) {
            case 0:
                ph.a.b(qVar, function2, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 1:
                k1.b(qVar, function2, oVar, i2.u.p(i16 | 1), i15);
                break;
            default:
                kh2.m0.e(qVar, function2, oVar, i2.u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f21183i) {
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
}
