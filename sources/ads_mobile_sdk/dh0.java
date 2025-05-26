package ads_mobile_sdk;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes2.dex */
public final class dh0 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final dh0 f4282a = new dh0();

    public dh0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        nm.s it = (nm.s) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        String p13 = it.p();
        Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
        split$default = StringsKt__StringsKt.split$default(p13, new String[]{","}, false, 0, 6, null);
        return split$default;
    }
}
