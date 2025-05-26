package wr1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f130962a;

    public e0(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f130962a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f130962a, ((e0) obj).f130962a);
    }

    public final int hashCode() {
        return this.f130962a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("RecoverUserClicked(user="), this.f130962a, ")");
    }
}
