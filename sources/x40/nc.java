package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    public final String f132893a;

    public nc(String str) {
        this.f132893a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nc) && Intrinsics.d(this.f132893a, ((nc) obj).f132893a);
    }

    public final int hashCode() {
        String str = this.f132893a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Owner(fullName="), this.f132893a, ")");
    }
}
