package w80;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v1 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a3.d f128396i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f128397j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(a3.d dVar, float f13) {
        super(3);
        this.f128396i = dVar;
        this.f128397j = f13;
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
        float f13 = this.f128397j;
        long c13 = lb.l0.c(f13, f13);
        float b13 = a3.a.b(c13);
        float c14 = a3.a.c(c13);
        a3.d dVar = this.f128396i;
        float f14 = dVar.f484a;
        long c15 = lb.l0.c(b13, c14);
        b3.o0.b(h13, new a3.e(f14, dVar.f485b, dVar.f486c, dVar.f487d, c15, c15, c15, c15));
        Unit unit = Unit.f80348a;
        ((b3.k) $receiver).e(h10, h13, 3);
        return Unit.f80348a;
    }
}
