package gb2;

import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final g f64751i = new g(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f30 pin = (f30) obj;
        Intrinsics.checkNotNullParameter(pin, "pin");
        e30 R6 = pin.R6();
        R6.C1(null);
        R6.D1(Boolean.TRUE);
        R6.U1(Integer.valueOf(pin.e6().intValue() + 1));
        f30 a13 = R6.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }
}
