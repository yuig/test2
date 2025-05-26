package vt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k extends r {
    public k() {
        Intrinsics.checkNotNullParameter("currentIndex invalid", "errorMsg");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        ((k) obj).getClass();
        return Intrinsics.d("currentIndex invalid", "currentIndex invalid");
    }

    public final int hashCode() {
        return -949050448;
    }

    public final String toString() {
        return "Error(errorMsg=currentIndex invalid)";
    }
}
