package tu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v implements w {
    public v() {
        Intrinsics.checkNotNullParameter("", "pinId");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        ((v) obj).getClass();
        return Intrinsics.d("", "");
    }

    @Override // tu.w
    public final String getPinId() {
        return "";
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "PinToLoad(pinId=)";
    }
}
