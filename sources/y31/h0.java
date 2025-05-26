package y31;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f136799a;

    public h0(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f136799a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f136799a, ((h0) obj).f136799a);
    }

    public final int hashCode() {
        return this.f136799a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("ShowPincodeModal(user="), this.f136799a, ")");
    }
}
