package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final l82.i0 f93654a;

    public l1(l82.i0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f93654a = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.d(this.f93654a, ((l1) obj).f93654a);
    }

    public final int hashCode() {
        return this.f93654a.hashCode();
    }

    public final String toString() {
        return "RemoveWithMatchingId(item=" + this.f93654a + ")";
    }
}
