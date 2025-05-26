package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class ah0 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ah0 f2407a = new ah0();

    public ah0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nm.s it = (nm.s) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.e());
    }
}
