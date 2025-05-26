package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f93581a;

    /* renamed from: b, reason: collision with root package name */
    public final sq0.y f93582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f93583c;

    public f1(int i13, sq0.y scrollDirection, int i14) {
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        this.f93581a = i13;
        this.f93582b = scrollDirection;
        this.f93583c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f93581a == f1Var.f93581a && this.f93582b == f1Var.f93582b && this.f93583c == f1Var.f93583c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93583c) + ((this.f93582b.hashCode() + (Integer.hashCode(this.f93581a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ItemAppeared(pos=");
        sb3.append(this.f93581a);
        sb3.append(", scrollDirection=");
        sb3.append(this.f93582b);
        sb3.append(", numberOfColumns=");
        return a.a.n(sb3, this.f93583c, ")");
    }
}
