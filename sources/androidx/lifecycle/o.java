package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {
    public static q a(r state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = n.f18667a[state.ordinal()];
        if (i13 == 1) {
            return q.ON_DESTROY;
        }
        if (i13 == 2) {
            return q.ON_STOP;
        }
        if (i13 != 3) {
            return null;
        }
        return q.ON_PAUSE;
    }

    public static q b(r state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = n.f18667a[state.ordinal()];
        if (i13 == 1) {
            return q.ON_START;
        }
        if (i13 == 2) {
            return q.ON_RESUME;
        }
        if (i13 != 5) {
            return null;
        }
        return q.ON_CREATE;
    }

    public static q c(r state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = n.f18667a[state.ordinal()];
        if (i13 == 1) {
            return q.ON_CREATE;
        }
        if (i13 == 2) {
            return q.ON_START;
        }
        if (i13 != 3) {
            return null;
        }
        return q.ON_RESUME;
    }
}
