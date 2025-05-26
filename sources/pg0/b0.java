package pg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f100052a;

    public b0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f100052a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return Intrinsics.d(this.f100052a, ((b0) obj).f100052a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f100052a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PaidPartnershipStatusEvent(pinId="), this.f100052a, ", isRemoved=true)");
    }
}
