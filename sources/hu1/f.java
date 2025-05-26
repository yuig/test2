package hu1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f70419a;

    public f(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f70419a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f70419a, ((f) obj).f70419a);
    }

    public final int hashCode() {
        return this.f70419a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("NavUserLoaded(user="), this.f70419a, ")");
    }
}
