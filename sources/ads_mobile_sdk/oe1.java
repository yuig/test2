package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class oe1 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final oe1 f9237a = new oe1();

    public oe1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sx0 ad3 = (sx0) obj;
        Intrinsics.checkNotNullParameter(ad3, "ad");
        return new ee1(ad3);
    }
}
