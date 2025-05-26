package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f3 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24724i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f24725j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f24726k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m1 f24727l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b3.x0 f24728m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o1.k f24729n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(boolean z13, boolean z14, o1.k kVar, m1 m1Var, b3.x0 x0Var, int i13) {
        super(2);
        this.f24724i = i13;
        this.f24725j = z13;
        this.f24726k = z14;
        this.f24729n = kVar;
        this.f24727l = m1Var;
        this.f24728m = x0Var;
    }

    public final void b(i2.o oVar, int i13) {
        switch (this.f24724i) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                g5.f24781a.a(this.f24725j, this.f24726k, (o1.l) this.f24729n, this.f24727l, this.f24728m, 0.0f, 0.0f, oVar, 12582912, 96);
                break;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                g5.f24781a.a(this.f24725j, this.f24726k, this.f24729n, this.f24727l, this.f24728m, 0.0f, 0.0f, oVar, 12582912, 96);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24724i) {
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
