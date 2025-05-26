package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final qr1.c f130948a;

    public c0(qr1.c authUser) {
        Intrinsics.checkNotNullParameter(authUser, "authUser");
        this.f130948a = authUser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f130948a, ((c0) obj).f130948a);
    }

    public final int hashCode() {
        return this.f130948a.hashCode();
    }

    public final String toString() {
        return "PasswordSuccessfulAuth(authUser=" + this.f130948a + ")";
    }
}
