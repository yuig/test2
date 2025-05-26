package u21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u50.r f120117j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f120118k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f120119l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f120120m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u50.r rVar, u2.q qVar, int i13, int i14, int i15) {
        super(2);
        this.f120116i = i15;
        this.f120117j = rVar;
        this.f120118k = qVar;
        this.f120119l = i13;
        this.f120120m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f120116i;
        u2.q qVar = this.f120118k;
        u50.r rVar = this.f120117j;
        int i15 = this.f120120m;
        int i16 = this.f120119l;
        switch (i14) {
            case 0:
                oe.f.i(rVar, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            default:
                kg.p.f(rVar, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f120116i) {
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
