package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133719a;

    public y1(String str) {
        this.f133719a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1) && Intrinsics.d(this.f133719a, ((y1) obj).f133719a);
    }

    public final int hashCode() {
        String str = this.f133719a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Metadata(compatibleVersion="), this.f133719a, ")");
    }
}
