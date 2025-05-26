package wr1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f130967a;

    public f1(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this.f130967a = user;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Intrinsics.d(this.f130967a, ((f1) obj).f130967a);
    }

    public final int hashCode() {
        return this.f130967a.hashCode();
    }

    public final String toString() {
        return d7.g.j(new StringBuilder("RecoverUserItemVMState(user="), this.f130967a, ")");
    }

    public /* synthetic */ f1() {
        this(new wy0());
    }
}
