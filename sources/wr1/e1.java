package wr1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yq1.k1;

/* loaded from: classes4.dex */
public final class e1 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f130963a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f130964b;

    public e1(wy0 user, k1 onUserClicked) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(onUserClicked, "onUserClicked");
        this.f130963a = user;
        this.f130964b = onUserClicked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.f130963a, e1Var.f130963a) && Intrinsics.d(this.f130964b, e1Var.f130964b);
    }

    public final int hashCode() {
        return this.f130964b.hashCode() + (this.f130963a.hashCode() * 31);
    }

    public final String toString() {
        return "RecoverUserItemDisplayState(user=" + this.f130963a + ", onUserClicked=" + this.f130964b + ")";
    }
}
