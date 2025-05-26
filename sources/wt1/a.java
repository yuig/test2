package wt1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface a {
    boolean y(Object obj, Object obj2);

    default boolean z(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }
}
