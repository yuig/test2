package bi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22886a;

    public x(boolean z13) {
        Intrinsics.checkNotNullParameter("PREF_ENABLE_CLOSED_CAPTIONS", "key");
        this.f22886a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        xVar.getClass();
        return Intrinsics.d("PREF_ENABLE_CLOSED_CAPTIONS", "PREF_ENABLE_CLOSED_CAPTIONS") && this.f22886a == xVar.f22886a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22886a) - 185920416;
    }

    public final String toString() {
        return a.a.r(new StringBuilder("UpdatePreferences(key=PREF_ENABLE_CLOSED_CAPTIONS, value="), this.f22886a, ")");
    }
}
