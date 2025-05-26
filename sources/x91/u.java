package x91;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f134356a;

    public /* synthetic */ u() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f134356a, ((u) obj).f134356a);
    }

    public final int hashCode() {
        wy0 wy0Var = this.f134356a;
        if (wy0Var == null) {
            return 0;
        }
        return wy0Var.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("BlockedAccountsItem(user="), this.f134356a, ")");
    }

    public u(wy0 wy0Var) {
        this.f134356a = wy0Var;
    }
}
