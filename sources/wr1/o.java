package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f130983a;

    public o(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f130983a = username;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f130983a, ((o) obj).f130983a);
    }

    public final int hashCode() {
        return this.f130983a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserSelectedSendRecoveryEmail(username="), this.f130983a, ")");
    }
}
