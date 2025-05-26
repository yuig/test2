package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f93642a;

    public k(y0 hidden) {
        Intrinsics.checkNotNullParameter(hidden, "hidden");
        this.f93642a = hidden;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f93642a, ((k) obj).f93642a);
    }

    public final int hashCode() {
        return this.f93642a.hashCode();
    }

    public final String toString() {
        return "Hidden(hidden=" + this.f93642a + ")";
    }
}
