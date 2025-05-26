package tc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import uc0.g1;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f117212i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1 f117213j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f117214k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f117215l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f117216m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(g1 g1Var, u2.q qVar, int i13, int i14, int i15) {
        super(2);
        this.f117212i = i15;
        this.f117213j = g1Var;
        this.f117214k = qVar;
        this.f117215l = i13;
        this.f117216m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f117212i;
        u2.q qVar = this.f117214k;
        g1 g1Var = this.f117213j;
        int i15 = this.f117216m;
        int i16 = this.f117215l;
        switch (i14) {
            case 0:
                kh2.s0.i(g1Var, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
            default:
                kh2.s0.j(g1Var, qVar, oVar, i2.u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f117212i) {
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
