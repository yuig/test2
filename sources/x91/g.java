package x91;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f134317a;

    public g(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f134317a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f134317a, ((g) obj).f134317a);
    }

    public final int hashCode() {
        return this.f134317a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("UnblockUserSuccess(user="), this.f134317a, ")");
    }
}
