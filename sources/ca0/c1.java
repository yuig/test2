package ca0;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public static final c1 f27081i = new c1(3);

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q1.c item = (q1.c) obj;
        i2.o oVar = (i2.o) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((intValue & 81) == 16) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(u2.n.f120041b, com.bumptech.glide.d.A(eo1.c.space_200, oVar)), oVar);
        return Unit.f80348a;
    }
}
