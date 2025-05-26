package o82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z0 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f93764a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93765b;

    public z0(List items, boolean z13) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f93764a = items;
        this.f93765b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.f93764a, z0Var.f93764a) && this.f93765b == z0Var.f93765b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93765b) + (this.f93764a.hashCode() * 31);
    }

    public final String toString() {
        return "Append(items=" + this.f93764a + ", hasMore=" + this.f93765b + ")";
    }
}
