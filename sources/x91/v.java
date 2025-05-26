package x91;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f134357a;

    public v(wy0 wy0Var) {
        this.f134357a = wy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f134357a, ((v) obj).f134357a);
    }

    public final int hashCode() {
        wy0 wy0Var = this.f134357a;
        if (wy0Var == null) {
            return 0;
        }
        return wy0Var.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("BlockedAccountsItemDisplayState(user="), this.f134357a, ")");
    }
}
