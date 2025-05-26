package y31;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f136862a;

    public z(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f136862a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f136862a, ((z) obj).f136862a);
    }

    public final int hashCode() {
        return this.f136862a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("UserUpdated(user="), this.f136862a, ")");
    }
}
