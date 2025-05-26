package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132878a;

    public n7(String str) {
        this.f132878a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7) && Intrinsics.d(this.f132878a, ((n7) obj).f132878a);
    }

    public final int hashCode() {
        String str = this.f132878a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Owner(fullName="), this.f132878a, ")");
    }
}
