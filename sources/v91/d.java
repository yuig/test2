package v91;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f124979a;

    public d(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f124979a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f124979a, ((d) obj).f124979a);
    }

    public final int hashCode() {
        return this.f124979a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("InitialDataLoaded(user="), this.f124979a, ")");
    }
}
