package w21;

import android.graphics.DashPathEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f127881i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f127882j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f127883k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f127884l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f127885m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f127886n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f127887o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(long j13, float f13, float f14, float f15, float f16, float f17, float f18) {
        super(1);
        this.f127881i = j13;
        this.f127882j = f13;
        this.f127883k = f14;
        this.f127884l = f15;
        this.f127885m = f16;
        this.f127886n = f17;
        this.f127887o = f18;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d3.h Canvas = (d3.h) obj;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f13 = this.f127882j;
        float f14 = 2;
        long d2 = com.bumptech.glide.c.d(Canvas.l0(f13) / f14, Canvas.l0(f13) / f14);
        long c13 = bs1.c.c(Canvas.l0(this.f127883k) - Canvas.l0(f13), Canvas.l0(this.f127884l) - Canvas.l0(f13));
        float f15 = this.f127885m;
        long c14 = lb.l0.c(Canvas.l0(f15), Canvas.l0(f15));
        float l03 = Canvas.l0(this.f127886n);
        float f16 = this.f127887o;
        d3.h.v(Canvas, this.f127881i, d2, c13, c14, new d3.l(l03, 0.0f, 0, 0, new b3.l(new DashPathEffect(new float[]{Canvas.l0(f15 + f16), Canvas.l0(f16 * f14)}, 0.0f)), 14));
        return Unit.f80348a;
    }
}
