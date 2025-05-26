package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127171i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f127172j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f127173k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f127174l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(u2.q qVar, int i13, int i14, int i15) {
        super(2);
        this.f127171i = i15;
        this.f127172j = qVar;
        this.f127173k = i13;
        this.f127174l = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f127171i;
        u2.q qVar = this.f127172j;
        int i15 = this.f127174l;
        int i16 = this.f127173k;
        switch (i14) {
            case 0:
                f.b(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 1:
                gh0.b.s(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 2:
                gh0.b.b(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 3:
                gh0.b.w(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 4:
                gh0.b.x(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 5:
                om0.q.e(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 6:
                dy0.i0.e(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 7:
                kg.p.d(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 8:
                br1.e0.i(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 9:
                br1.e0.j(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            case 10:
                br1.e0.k(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            default:
                br1.e0.l(qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f127171i) {
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
            case 4:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 5:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 6:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 7:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 8:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 9:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 10:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
