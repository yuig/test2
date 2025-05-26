package b11;

import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public static final w f21089i = new w(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean isRendered = (Boolean) obj;
        Boolean pinUpdated = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(isRendered, "isRendered");
        Intrinsics.checkNotNullParameter(pinUpdated, "pinUpdated");
        return new Pair(isRendered, pinUpdated);
    }
}
