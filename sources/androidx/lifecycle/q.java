package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public enum q {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;


    @NotNull
    public static final o Companion = new o();

    public static final q downFrom(@NotNull r rVar) {
        Companion.getClass();
        return o.a(rVar);
    }

    public static final q downTo(@NotNull r state) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        int i13 = n.f18667a[state.ordinal()];
        if (i13 == 1) {
            return ON_STOP;
        }
        if (i13 == 2) {
            return ON_PAUSE;
        }
        if (i13 != 4) {
            return null;
        }
        return ON_DESTROY;
    }

    public static final q upFrom(@NotNull r rVar) {
        Companion.getClass();
        return o.b(rVar);
    }

    public static final q upTo(@NotNull r rVar) {
        Companion.getClass();
        return o.c(rVar);
    }

    @NotNull
    public final r getTargetState() {
        switch (p.f18671a[ordinal()]) {
            case 1:
            case 2:
                return r.CREATED;
            case 3:
            case 4:
                return r.STARTED;
            case 5:
                return r.RESUMED;
            case 6:
                return r.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
