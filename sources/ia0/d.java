package ia0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.i0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71948i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f71949j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f71950k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0 f71951l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f71952m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f71953n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(i0 i0Var, u2.q qVar, i0 i0Var2, int i13, int i14, int i15) {
        super(2);
        this.f71948i = i15;
        this.f71949j = i0Var;
        this.f71950k = qVar;
        this.f71951l = i0Var2;
        this.f71952m = i13;
        this.f71953n = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f71948i;
        int i15 = this.f71952m;
        switch (i14) {
            case 0:
                l.a(this.f71949j, this.f71950k, this.f71951l, oVar, i2.u.p(i15 | 1), this.f71953n);
                break;
            default:
                z.c(this.f71949j, this.f71950k, this.f71951l, oVar, i2.u.p(i15 | 1), this.f71953n);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f71948i) {
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
