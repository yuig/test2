package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final l82.i0 f93568a;

    public e1(l82.i0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f93568a = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            return Intrinsics.d(this.f93568a, ((e1) obj).f93568a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.f93568a.hashCode() * 31);
    }

    public final String toString() {
        return "Insert(item=" + this.f93568a + ", pos=0)";
    }
}
