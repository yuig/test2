package ads_mobile_sdk;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class am0 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final am0 f2437a = new am0();

    public am0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        return Boolean.valueOf(!(str == null || str.length() == 0));
    }
}
