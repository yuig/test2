package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final qr1.c f131030a;

    public y(qr1.c authUser) {
        Intrinsics.checkNotNullParameter(authUser, "authUser");
        this.f131030a = authUser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f131030a, ((y) obj).f131030a);
    }

    public final int hashCode() {
        return this.f131030a.hashCode();
    }

    public final String toString() {
        return "GoogleSuccessfulAuth(authUser=" + this.f131030a + ")";
    }
}
