package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class pg0 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final pg0 f9674a = new pg0();

    public pg0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nm.s it = (nm.s) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.e());
    }
}
