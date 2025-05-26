package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132806a;

    public m4(String str) {
        this.f132806a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4) && Intrinsics.d(this.f132806a, ((m4) obj).f132806a);
    }

    public final int hashCode() {
        String str = this.f132806a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Metadata(compatibleVersion="), this.f132806a, ")");
    }
}
