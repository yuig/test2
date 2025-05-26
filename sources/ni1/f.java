package ni1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements h {
    public f() {
        Intrinsics.checkNotNullParameter("Attribution type is unknown", "message");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        ((f) obj).getClass();
        return Intrinsics.d("Attribution type is unknown", "Attribution type is unknown");
    }

    public final int hashCode() {
        return -921779655;
    }

    public final String toString() {
        return "AssertFailure(message=Attribution type is unknown)";
    }
}
