package hu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements l82.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f70427a;

    public k(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f70427a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f70427a, ((k) obj).f70427a);
    }

    public final int hashCode() {
        return this.f70427a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadNavUser(userId="), this.f70427a, ")");
    }
}
