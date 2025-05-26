package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133549a;

    public v9(String str) {
        this.f133549a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9) && Intrinsics.d(this.f133549a, ((v9) obj).f133549a);
    }

    public final int hashCode() {
        String str = this.f133549a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Owner(fullName="), this.f133549a, ")");
    }
}
