package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121805a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121806b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121807c;

    /* renamed from: d, reason: collision with root package name */
    public final h3.f f121808d;

    public k1(int i13, int i14, int i15, h3.f back) {
        Intrinsics.checkNotNullParameter(back, "back");
        this.f121805a = i13;
        this.f121806b = i14;
        this.f121807c = i15;
        this.f121808d = back;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f121805a == k1Var.f121805a && this.f121806b == k1Var.f121806b && this.f121807c == k1Var.f121807c && Intrinsics.d(this.f121808d, k1Var.f121808d);
    }

    public final int hashCode() {
        return this.f121808d.hashCode() + ep.b.b(this.f121807c, ep.b.b(this.f121806b, Integer.hashCode(this.f121805a) * 31, 31), 31);
    }

    public final String toString() {
        return "TopBarDisplayState(labelSwitch=" + this.f121805a + ", title=" + this.f121806b + ", contentDescriptionBack=" + this.f121807c + ", back=" + this.f121808d + ")";
    }
}
