package sb1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f112243a;

    public e(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f112243a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f112243a, ((e) obj).f112243a);
    }

    public final int hashCode() {
        return this.f112243a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("LoadUserSuccess(user="), this.f112243a, ")");
    }
}
