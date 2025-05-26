package y31;

import com.pinterest.api.model.vz0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final vz0 f136806a;

    public j0(vz0 vz0Var) {
        this.f136806a = vz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f136806a, ((j0) obj).f136806a);
    }

    public final int hashCode() {
        vz0 vz0Var = this.f136806a;
        if (vz0Var == null) {
            return 0;
        }
        return vz0Var.hashCode();
    }

    public final String toString() {
        return "ShowVerifiedMerchantModal(verifiedMerchant=" + this.f136806a + ")";
    }
}
