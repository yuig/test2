package i2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f71299a;

    public t1(String str) {
        this.f71299a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && Intrinsics.d(this.f71299a, ((t1) obj).f71299a);
    }

    public final int hashCode() {
        return this.f71299a.hashCode();
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("OpaqueKey(key="), this.f71299a, ')');
    }
}
