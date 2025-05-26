package y31;

import com.pinterest.api.model.vz0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final vz0 f136773a;

    public a0(vz0 verifiedMerchant) {
        Intrinsics.checkNotNullParameter(verifiedMerchant, "verifiedMerchant");
        this.f136773a = verifiedMerchant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f136773a, ((a0) obj).f136773a);
    }

    public final int hashCode() {
        return this.f136773a.hashCode();
    }

    public final String toString() {
        return "VerifiedMerchantLoaded(verifiedMerchant=" + this.f136773a + ")";
    }
}
