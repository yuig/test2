package f21;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f60951i = new b(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String response = (String) obj;
        tt1.a repinId = (tt1.a) obj2;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(repinId, "repinId");
        return new Pair(response, repinId);
    }
}
