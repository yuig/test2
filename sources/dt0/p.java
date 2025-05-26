package dt0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ha2.b f56251a;

    public p(ha2.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f56251a = configuration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f56251a, ((p) obj).f56251a);
    }

    public final int hashCode() {
        return this.f56251a.hashCode();
    }

    public final String toString() {
        return "LaunchActionSheet(configuration=" + this.f56251a + ")";
    }
}
