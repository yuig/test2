package q41;

import b60.b;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f102393a;

    public a(b activeUserManager) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f102393a = activeUserManager;
    }

    public final boolean a(wy0 wy0Var) {
        if (wy0Var == null || !this.f102393a.c(wy0Var)) {
            return false;
        }
        Boolean J3 = wy0Var.J3();
        Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
        return J3.booleanValue();
    }
}
