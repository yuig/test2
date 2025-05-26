package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final l82.i0 f93687a;

    public p1(l82.i0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f93687a = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && Intrinsics.d(this.f93687a, ((p1) obj).f93687a);
    }

    public final int hashCode() {
        return this.f93687a.hashCode();
    }

    public final String toString() {
        return "UpdateWithMatchingId(item=" + this.f93687a + ")";
    }
}
