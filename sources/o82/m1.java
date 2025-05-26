package o82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f93667a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93668b;

    public m1(List items, boolean z13) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f93667a = items;
        this.f93668b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Intrinsics.d(this.f93667a, m1Var.f93667a) && this.f93668b == m1Var.f93668b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93668b) + (this.f93667a.hashCode() * 31);
    }

    public final String toString() {
        return "SetAll(items=" + this.f93667a + ", hasMore=" + this.f93668b + ")";
    }
}
