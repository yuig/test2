package ra0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f107046i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f107047j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f107048k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f107049l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f107050m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f107051n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(float f13, float f14, float f15, float f16, float f17, long j13) {
        super(3);
        this.f107046i = j13;
        this.f107047j = f13;
        this.f107048k = f14;
        this.f107049l = f15;
        this.f107050m = f16;
        this.f107051n = f17;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        u2.q composed = (u2.q) obj;
        ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        i2.s sVar = (i2.s) ((i2.o) obj2);
        sVar.W(1900745611);
        sVar.W(-670583853);
        boolean g13 = sVar.g(this.f107046i) | sVar.e(this.f107047j) | sVar.e(this.f107048k) | sVar.e(this.f107049l) | sVar.e(this.f107050m) | sVar.e(this.f107051n);
        Object J2 = sVar.J();
        if (g13 || J2 == i2.n.f71185a) {
            J2 = new y0(this.f107051n, this.f107047j, this.f107048k, this.f107049l, this.f107050m, this.f107046i);
            sVar.g0(J2);
        }
        sVar.r(false);
        u2.q d2 = androidx.compose.ui.draw.a.d(composed, (Function1) J2);
        sVar.r(false);
        return d2;
    }
}
