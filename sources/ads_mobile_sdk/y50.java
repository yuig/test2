package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class y50 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final y50 f14088a = new y50();

    public y50() {
        super(1);
    }

    public static String a(Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getKey() + " = " + it.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }
}
