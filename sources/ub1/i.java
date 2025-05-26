package ub1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f121721a;

    public i(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f121721a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f121721a, ((i) obj).f121721a);
    }

    public final int hashCode() {
        return this.f121721a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("UserSettingsLoaded(user="), this.f121721a, ")");
    }
}
