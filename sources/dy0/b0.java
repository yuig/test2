package dy0;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f56541i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f56542j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ v3 f56543k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(float f13, float f14, v3 v3Var) {
        super(3);
        this.f56541i = f13;
        this.f56542j = f14;
        this.f56543k = v3Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.foundation.layout.d BoxWithConstraints = (androidx.compose.foundation.layout.d) obj;
        i2.o oVar = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((intValue & 14) == 0) {
            intValue |= ((i2.s) oVar).h(BoxWithConstraints) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        float d2 = BoxWithConstraints.d();
        float f13 = this.f56541i;
        u2.q j13 = androidx.compose.foundation.layout.e.i(((Number) this.f56543k.getValue()).floatValue() * ((2 * f13) + d2)).j(androidx.compose.foundation.layout.e.f17183b);
        long t23 = dl2.b.t2(new u50.e(eo1.a.sema_color_background_primary_default), oVar);
        float f14 = this.f56542j;
        p1.q.a(androidx.compose.foundation.a.b(j13, t23, new v1.h(new v1.e(f14), new v1.e(f13), new v1.e(f13), new v1.e(f14))), oVar, 0);
        return Unit.f80348a;
    }
}
