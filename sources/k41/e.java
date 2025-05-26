package k41;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {
    public static f a(zo.c boardViewType) {
        Intrinsics.checkNotNullParameter(boardViewType, "boardViewType");
        int i13 = d.f78306b[boardViewType.ordinal()];
        if (i13 == 1) {
            return f.Wide;
        }
        if (i13 == 2) {
            return f.Default;
        }
        if (i13 == 3) {
            return f.Compact;
        }
        throw new NoWhenBranchMatchedException();
    }
}
