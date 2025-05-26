package tx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final qx1.d f119688a;

    public f(qx1.d tabPosition) {
        Intrinsics.checkNotNullParameter(tabPosition, "tabPosition");
        this.f119688a = tabPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f119688a == ((f) obj).f119688a;
    }

    public final int hashCode() {
        return this.f119688a.hashCode();
    }

    public final String toString() {
        return "OnTabSelected(tabPosition=" + this.f119688a + ")";
    }
}
