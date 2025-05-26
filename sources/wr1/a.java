package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final qr1.c f130936a;

    public a(qr1.c authUser) {
        Intrinsics.checkNotNullParameter(authUser, "authUser");
        this.f130936a = authUser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f130936a, ((a) obj).f130936a);
    }

    public final int hashCode() {
        return this.f130936a.hashCode();
    }

    public final String toString() {
        return "GoogleAuthenticated(authUser=" + this.f130936a + ")";
    }
}
