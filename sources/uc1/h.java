package uc1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import qr1.v;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f121902a;

    /* renamed from: b, reason: collision with root package name */
    public final v f121903b;

    public h(wy0 user, v mfaData) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(mfaData, "mfaData");
        this.f121902a = user;
        this.f121903b = mfaData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f121902a, hVar.f121902a) && Intrinsics.d(this.f121903b, hVar.f121903b);
    }

    public final int hashCode() {
        return this.f121903b.hashCode() + (this.f121902a.hashCode() * 31);
    }

    public final String toString() {
        return "MfaEligibility(user=" + this.f121902a + ", mfaData=" + this.f121903b + ")";
    }
}
