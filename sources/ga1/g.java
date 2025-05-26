package ga1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f64622a;

    public g(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f64622a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f64622a, ((g) obj).f64622a);
    }

    public final int hashCode() {
        return this.f64622a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("UserSettingsLoaded(user="), this.f64622a, ")");
    }
}
