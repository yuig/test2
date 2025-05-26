package w80;

import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u1 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f128392i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f128393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(long j13, float f13) {
        super(3);
        this.f128392i = j13;
        this.f128393j = f13;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b3.o0 $receiver = (b3.o0) obj;
        long j13 = ((a3.f) obj2).f497a;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        Intrinsics.checkNotNullParameter((n4.k) obj3, "<anonymous parameter 1>");
        b3.k h10 = androidx.compose.ui.graphics.a.h();
        b3.o0.a(h10, new a3.d(0.0f, 0.0f, a3.f.d(j13), a3.f.b(j13)));
        b3.k h13 = androidx.compose.ui.graphics.a.h();
        long j14 = this.f128392i;
        float d2 = a3.c.d(j14);
        float f13 = this.f128393j;
        float f14 = d2 - f13;
        float e13 = a3.c.e(j14) - f13;
        float d13 = a3.c.d(j14) + f13;
        float e14 = a3.c.e(j14) + f13;
        b3.n0 n0Var = b3.n0.CounterClockwise;
        if (h13.f21335b == null) {
            h13.f21335b = new RectF();
        }
        RectF rectF = h13.f21335b;
        Intrinsics.f(rectF);
        rectF.set(f14, e13, d13, e14);
        RectF rectF2 = h13.f21335b;
        Intrinsics.f(rectF2);
        h13.f21334a.addOval(rectF2, androidx.compose.ui.graphics.a.k(n0Var));
        Unit unit = Unit.f80348a;
        ((b3.k) $receiver).e(h10, h13, 3);
        return Unit.f80348a;
    }
}
