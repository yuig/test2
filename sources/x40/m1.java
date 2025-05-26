package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132801a;

    public m1(String str) {
        this.f132801a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && Intrinsics.d(this.f132801a, ((m1) obj).f132801a);
    }

    public final int hashCode() {
        String str = this.f132801a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Owner(fullName="), this.f132801a, ")");
    }
}
