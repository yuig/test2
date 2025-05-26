package ra0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f107020i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f107021j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f107022k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f107023l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f107024m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s1.o0 f107025n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f107026o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f107027p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(float f13, float f14, float f15, boolean z13, int i13, s1.o0 o0Var, float f16, long j13) {
        super(1);
        this.f107020i = f13;
        this.f107021j = f14;
        this.f107022k = f15;
        this.f107023l = z13;
        this.f107024m = i13;
        this.f107025n = o0Var;
        this.f107026o = f16;
        this.f107027p = j13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        a3.e eVar;
        d3.h Canvas = (d3.h) obj;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f13 = this.f107020i;
        int R = Canvas.R(f13);
        int R2 = Canvas.R(this.f107021j);
        float f14 = this.f107022k;
        int R3 = Canvas.R(f14);
        float f15 = 2;
        float l03 = Canvas.l0((f13 * f15) + f14);
        boolean z13 = this.f107023l;
        float d2 = z13 ? a3.f.d(Canvas.g()) : 0.0f;
        float e13 = a3.c.e(Canvas.t0());
        int i14 = 0;
        while (true) {
            int i15 = this.f107024m;
            if (i14 >= i15) {
                return Unit.f80348a;
            }
            s1.o0 o0Var = this.f107025n;
            float l13 = o0Var.l() - i14;
            s1.i0 i0Var = o0Var.f110493c;
            int i16 = R3;
            float f16 = ql2.s.f(Math.abs(i0Var.f110450c.h() + l13), 0.0f, 1.0f);
            float h10 = i0Var.f110450c.h() + o0Var.l();
            float max = Math.max(this.f107026o, 1.0f - f16);
            int i17 = (int) h10;
            float f17 = R;
            float f18 = (l03 - f17) * (h10 % 1);
            float floatValue = (i17 == i14 ? Float.valueOf(l03 - f18) : i17 == i14 + (-1) ? Float.valueOf(f17 + f18) : (i14 != 0 || h10 <= ((float) (i15 + (-1)))) ? Integer.valueOf(R) : Float.valueOf(f17 + f18)).floatValue();
            float f19 = R2;
            long c13 = lb.l0.c(f17 / 2.0f, f19 / 2.0f);
            float f23 = l03;
            int i18 = R;
            long b13 = b3.w.b(this.f107027p, max);
            if (z13) {
                float f24 = f19 / f15;
                long c14 = lb.l0.c(a3.a.b(c13), a3.a.c(c13));
                i13 = 1;
                eVar = new a3.e(d2 - floatValue, e13 - f24, d2, e13 + f24, c14, c14, c14, c14);
            } else {
                i13 = 1;
                float f25 = f19 / f15;
                long c15 = lb.l0.c(a3.a.b(c13), a3.a.c(c13));
                eVar = new a3.e(d2, e13 - f25, d2 + floatValue, e13 + f25, c15, c15, c15, c15);
            }
            a3.e eVar2 = eVar;
            b3.k h13 = androidx.compose.ui.graphics.a.h();
            b3.o0.b(h13, eVar2);
            d3.h.o0(Canvas, h13, b13);
            d2 += (floatValue + i16) * (z13 ? -1 : i13);
            i14++;
            R3 = i16;
            R = i18;
            l03 = f23;
        }
    }
}
