package ea1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f58038a;

    public c0(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f58038a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f58038a, ((c0) obj).f58038a);
    }

    public final int hashCode() {
        return this.f58038a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("UserSettingsLoaded(user="), this.f58038a, ")");
    }
}
