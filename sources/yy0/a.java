package yy0;

import com.pinterest.gestalt.spinner.GestaltSpinner;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import u50.h0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public static final a f140422i = new a(3);

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r1.q item = (r1.q) obj;
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
        c0.d.a(new ln1.d(GestaltSpinner.F, GestaltSpinner.G, ln1.e.LOADING, h0.f120562a, GestaltSpinner.B.c(), Integer.MIN_VALUE), null, oVar, 8, 2);
        return Unit.f80348a;
    }
}
