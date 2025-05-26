package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class ch0 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ch0 f3913a = new ch0();

    public ch0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nm.s it = (nm.s) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        nm.u i13 = it.i();
        Intrinsics.checkNotNullExpressionValue(i13, "getAsJsonObject(...)");
        return i13;
    }
}
