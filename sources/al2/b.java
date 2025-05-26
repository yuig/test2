package al2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class b extends a {
    public static Comparable c(Comparable a13, Comparable b13) {
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b13, "b");
        return a13.compareTo(b13) >= 0 ? a13 : b13;
    }
}
