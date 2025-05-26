package o82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f93536a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93537b;

    public b1(Object args, boolean z13) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.f93536a = args;
        this.f93537b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.d(this.f93536a, b1Var.f93536a) && this.f93537b == b1Var.f93537b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93537b) + (this.f93536a.hashCode() * 31);
    }

    public final String toString() {
        return "Configure(args=" + this.f93536a + ", clearAndRefresh=" + this.f93537b + ")";
    }
}
