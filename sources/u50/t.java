package u50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface t {
    default String a() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
