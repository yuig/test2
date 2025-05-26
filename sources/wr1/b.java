package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final qr1.c f130942a;

    public b(qr1.c authUser) {
        Intrinsics.checkNotNullParameter(authUser, "authUser");
        this.f130942a = authUser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f130942a, ((b) obj).f130942a);
    }

    public final int hashCode() {
        return this.f130942a.hashCode();
    }

    public final String toString() {
        return "PasswordAuthenticated(authUser=" + this.f130942a + ")";
    }
}
