package tc0;

import kh2.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w21.e1;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117266i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f117267j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f117268k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f117269l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f117270m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, u2.q qVar, int i13, int i14, int i15) {
        super(2);
        this.f117266i = i15;
        this.f117267j = str;
        this.f117268k = qVar;
        this.f117269l = i13;
        this.f117270m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f117266i;
        u2.q qVar = this.f117268k;
        String str = this.f117267j;
        int i15 = this.f117270m;
        int i16 = this.f117269l;
        switch (i14) {
            case 0:
                gh0.b.n(str, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 1:
                j1.r(str, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 2:
                kg.p.e(str, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            default:
                e1.c(str, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f117266i) {
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
}
