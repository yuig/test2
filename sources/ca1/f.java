package ca1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f27199a;

    public f(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f27199a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f27199a, ((f) obj).f27199a);
    }

    public final int hashCode() {
        return this.f27199a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("UserSettingsLoaded(user="), this.f27199a, ")");
    }
}
