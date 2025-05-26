package iu1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f73703a;

    public h(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f73703a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f73703a, ((h) obj).f73703a);
    }

    public final int hashCode() {
        return this.f73703a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("NavUserLoaded(user="), this.f73703a, ")");
    }
}
