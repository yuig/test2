package xs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f135698a;

    public b(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f135698a = uid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f135698a, ((b) obj).f135698a);
    }

    public final int hashCode() {
        return this.f135698a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LaunchLoadScreen(uid="), this.f135698a, ")");
    }
}
