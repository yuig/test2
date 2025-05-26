package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f57428a;

    public u(String str) {
        this.f57428a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f57428a, ((u) obj).f57428a);
    }

    public final int hashCode() {
        String str = this.f57428a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Title(format="), this.f57428a, ")");
    }
}
