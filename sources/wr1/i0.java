package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f130973a;

    public i0(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        this.f130973a = username;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f130973a, ((i0) obj).f130973a);
    }

    public final int hashCode() {
        return this.f130973a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SearchUsernameButtonClick(username="), this.f130973a, ")");
    }
}
