package se0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {
    public static f a(yk1.i loadState) {
        Intrinsics.checkNotNullParameter(loadState, "loadState");
        int i13 = d.f112381a[loadState.ordinal()];
        if (i13 == 1) {
            return f.LOADING;
        }
        if (i13 == 2) {
            return f.LOADED;
        }
        if (i13 == 3) {
            return f.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
