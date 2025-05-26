package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f130966a;

    public f0(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f130966a = email;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f130966a, ((f0) obj).f130966a);
    }

    public final int hashCode() {
        return this.f130966a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SearchEmailButtonClick(email="), this.f130966a, ")");
    }
}
