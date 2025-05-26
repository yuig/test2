package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final l82.i0 f93682a;

    public o1(ny0.a0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f93682a = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        o1Var.getClass();
        return Intrinsics.d(this.f93682a, o1Var.f93682a);
    }

    public final int hashCode() {
        return this.f93682a.hashCode() + (Integer.hashCode(0) * 31);
    }

    public final String toString() {
        return "Update(pos=0, item=" + this.f93682a + ")";
    }
}
