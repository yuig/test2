package x91;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f134313a;

    public e(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f134313a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f134313a, ((e) obj).f134313a);
    }

    public final int hashCode() {
        return this.f134313a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("UnblockButtonClick(user="), this.f134313a, ")");
    }
}
