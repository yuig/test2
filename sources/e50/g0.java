package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f57347a;

    public g0(String str) {
        this.f57347a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f57347a, ((g0) obj).f57347a);
    }

    public final int hashCode() {
        String str = this.f57347a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Action(feedUrl="), this.f57347a, ")");
    }
}
