package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132586a;

    public j3(String str) {
        this.f132586a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3) && Intrinsics.d(this.f132586a, ((j3) obj).f132586a);
    }

    public final int hashCode() {
        String str = this.f132586a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Owner(fullName="), this.f132586a, ")");
    }
}
