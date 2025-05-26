package a41;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f642a;

    /* renamed from: b, reason: collision with root package name */
    public final int f643b;

    public o0(List visibleTabs, int i13) {
        Intrinsics.checkNotNullParameter(visibleTabs, "visibleTabs");
        this.f642a = visibleTabs;
        this.f643b = i13;
    }

    public static o0 c(o0 o0Var, int i13) {
        List visibleTabs = o0Var.f642a;
        Intrinsics.checkNotNullParameter(visibleTabs, "visibleTabs");
        return new o0(visibleTabs, i13);
    }

    public final List a() {
        return this.f642a;
    }

    public final int b() {
        return this.f643b;
    }

    public final int d() {
        return this.f643b;
    }

    public final List e() {
        return this.f642a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f642a, o0Var.f642a) && this.f643b == o0Var.f643b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f643b) + (this.f642a.hashCode() * 31);
    }

    public final String toString() {
        return "TabState(visibleTabs=" + this.f642a + ", selectedTabPosition=" + this.f643b + ")";
    }
}
