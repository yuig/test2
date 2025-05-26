package or1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {
    public static b a(wy0 wy0Var) {
        if (wy0Var == null) {
            return b.NO_ACCOUNT;
        }
        if (dl2.b.L1(wy0Var)) {
            return b.LINKED_BUSINESS;
        }
        if (wy0Var.H3()) {
            Boolean G3 = wy0Var.G3();
            Intrinsics.checkNotNullExpressionValue(G3, "getIsPartner(...)");
            if (G3.booleanValue()) {
                return b.PARTNER;
            }
        }
        return b.PERSONAL;
    }
}
