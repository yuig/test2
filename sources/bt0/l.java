package bt0;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class l implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f23877a;

    public l(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f23877a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f23877a, ((l) obj).f23877a);
    }

    public final int hashCode() {
        return this.f23877a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("SbaHftFollowingTabItem(user="), this.f23877a, ")");
    }
}
