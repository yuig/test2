package dy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56621i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f56622j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f56623k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f56624l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f56625m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(e eVar, u2.q qVar, int i13, int i14, int i15) {
        super(2);
        this.f56621i = i15;
        this.f56622j = eVar;
        this.f56623k = qVar;
        this.f56624l = i13;
        this.f56625m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f56621i;
        u2.q qVar = this.f56623k;
        e eVar = this.f56622j;
        int i15 = this.f56625m;
        int i16 = this.f56624l;
        switch (i14) {
            case 0:
                i0.a(eVar, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 1:
                i0.b(eVar, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            default:
                i0.c(eVar, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f56621i) {
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
