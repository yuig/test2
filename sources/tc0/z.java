package tc0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117360i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f117361j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f117362k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f117363l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f117364m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(List list, u2.q qVar, int i13, int i14, int i15) {
        super(2);
        this.f117360i = i15;
        this.f117361j = list;
        this.f117362k = qVar;
        this.f117363l = i13;
        this.f117364m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f117360i;
        u2.q qVar = this.f117362k;
        List list = this.f117361j;
        int i15 = this.f117364m;
        int i16 = this.f117363l;
        switch (i14) {
            case 0:
                kh2.s0.h(list, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 1:
                kh2.s0.n(list, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            default:
                kg.p.c(list, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f117360i) {
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
