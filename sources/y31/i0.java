package y31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f136802a;

    public i0(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f136802a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f136802a, ((i0) obj).f136802a);
    }

    public final int hashCode() {
        return this.f136802a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowUserImageDialog(uid="), this.f136802a, ")");
    }
}
