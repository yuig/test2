package h32;

import c50.t4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a */
    public static final t4 f66981a = new t4(21);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        ((f) obj).getClass();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.d(bool, bool)) {
            return false;
        }
        Boolean bool2 = Boolean.FALSE;
        return Intrinsics.d(bool2, bool2);
    }

    public final int hashCode() {
        return Boolean.FALSE.hashCode() + (Boolean.TRUE.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdDisclosureEventData(isPharmaAd=");
        sb3.append(Boolean.TRUE);
        sb3.append(", isPharmaDisclosureClickthrough=");
        return a.c.h(sb3, Boolean.FALSE, ")");
    }
}
