package gb1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64690i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f64691j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i13) {
        super(1);
        this.f64690i = i13;
        this.f64691j = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f64690i;
        f fVar = this.f64691j;
        switch (i13) {
            case 0:
                em1.d it = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, fVar.f64694c ? em1.b.CHECKED : em1.b.UNCHECKED, fVar.f64695d ? em1.e.ENABLED : em1.e.DISABLED, fm1.c.VISIBLE, bs1.c.h2(fVar.f64696e), null, null, 2, null, false, 0, 944);
            default:
                em1.c event = (em1.c) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                fVar.f64697f.invoke(Boolean.valueOf(c0.d.b2(event)));
                return Unit.f80348a;
        }
    }
}
