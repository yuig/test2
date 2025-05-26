package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133809a;

    public z7(String str) {
        this.f133809a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7) && Intrinsics.d(this.f133809a, ((z7) obj).f133809a);
    }

    public final int hashCode() {
        String str = this.f133809a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Metadata(compatibleVersion="), this.f133809a, ")");
    }
}
