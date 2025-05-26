package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class qz0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10330a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10331b;

    public qz0(String description, String muteUrl) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(muteUrl, "muteUrl");
        this.f10330a = description;
        this.f10331b = muteUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz0)) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        return Intrinsics.d(this.f10330a, qz0Var.f10330a) && Intrinsics.d(this.f10331b, qz0Var.f10331b);
    }

    public final int hashCode() {
        return this.f10331b.hashCode() + (this.f10330a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.m("InternalMuteThisAdReason(description=", this.f10330a, ", muteUrl=", this.f10331b, ")");
    }
}
