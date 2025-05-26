package i90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f71778a;

    public e(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f71778a = userId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f71778a, ((e) obj).f71778a);
    }

    public final int hashCode() {
        return this.f71778a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ImageCloseupRequestArgs(userId="), this.f71778a, ")");
    }
}
