package ra0;

import android.graphics.Paint;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f107039i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f107040j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f107041k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f107042l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f107043m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f107044n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(float f13, float f14, float f15, float f16, float f17, long j13) {
        super(1);
        this.f107039i = f13;
        this.f107040j = j13;
        this.f107041k = f14;
        this.f107042l = f15;
        this.f107043m = f16;
        this.f107044n = f17;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d3.h drawBehind = (d3.h) obj;
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        b3.u a13 = drawBehind.p0().a();
        b3.i g13 = androidx.compose.ui.graphics.a.g();
        long j13 = this.f107040j;
        int u13 = androidx.compose.ui.graphics.a.u(b3.w.b(j13, 0.0f));
        Paint paint = g13.f21325a;
        paint.setColor(u13);
        paint.setShadowLayer(drawBehind.l0(this.f107041k), drawBehind.l0(this.f107042l), drawBehind.l0(this.f107043m), androidx.compose.ui.graphics.a.u(b3.w.b(j13, this.f107044n)));
        float d2 = a3.f.d(drawBehind.g());
        float b13 = a3.f.b(drawBehind.g());
        float f13 = this.f107039i;
        a13.i(0.0f, 0.0f, d2, b13, drawBehind.l0(f13), drawBehind.l0(f13), g13);
        return Unit.f80348a;
    }
}
