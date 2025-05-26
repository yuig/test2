package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127858i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f127859j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f127860k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f127861l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f127862m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f127863n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(float f13, float f14, float f15, float f16, int i13, int i14) {
        super(1);
        this.f127858i = i14;
        this.f127859j = i13;
        this.f127860k = f13;
        this.f127861l = f14;
        this.f127862m = f15;
        this.f127863n = f16;
    }

    public final void b(b3.d0 graphicsLayer) {
        int i13 = this.f127858i;
        float f13 = this.f127863n;
        float f14 = this.f127862m;
        int i14 = this.f127859j;
        float f15 = this.f127861l;
        float f16 = this.f127860k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                b3.u0 u0Var = (b3.u0) graphicsLayer;
                u0Var.l(0.4f);
                u0Var.n(0.4f);
                u0Var.E(u0Var.f21372s.b() * e1.d(f16, f15, i14));
                u0Var.F(u0Var.f21372s.b() * (f14 - f13));
                break;
            default:
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                b3.u0 u0Var2 = (b3.u0) graphicsLayer;
                u0Var2.l(0.4f);
                u0Var2.n(0.4f);
                u0Var2.E(u0Var2.f21372s.b() * e1.d(f16, f15, i14));
                u0Var2.F(u0Var2.f21372s.b() * (f14 - f13));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f127858i) {
            case 0:
                b((b3.d0) obj);
                break;
            default:
                b((b3.d0) obj);
                break;
        }
        return Unit.f80348a;
    }
}
