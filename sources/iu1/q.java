package iu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f73716a;

    public q(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f73716a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f73716a, ((q) obj).f73716a);
    }

    public final int hashCode() {
        return this.f73716a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadNavUser(userId="), this.f73716a, ")");
    }
}
