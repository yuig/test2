package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f91390a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91391b;

    public c0(int i13, u50.i0 tabText) {
        Intrinsics.checkNotNullParameter(tabText, "tabText");
        this.f91390a = tabText;
        this.f91391b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f91390a, c0Var.f91390a) && this.f91391b == c0Var.f91391b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91391b) + (this.f91390a.hashCode() * 31);
    }

    public final String toString() {
        return "TabState(tabText=" + this.f91390a + ", tabID=" + this.f91391b + ")";
    }
}
