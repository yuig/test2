package i51;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f71601a;

    public p(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f71601a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f71601a, ((p) obj).f71601a);
    }

    public final int hashCode() {
        return this.f71601a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("UserLoaded(user="), this.f71601a, ")");
    }
}
