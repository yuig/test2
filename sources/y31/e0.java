package y31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f136787a;

    public e0(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f136787a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f136787a, ((e0) obj).f136787a);
    }

    public final int hashCode() {
        return this.f136787a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadVerifiedMerchant(uid="), this.f136787a, ")");
    }
}
