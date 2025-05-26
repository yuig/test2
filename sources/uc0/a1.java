package uc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f121755a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121756b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121757c;

    /* renamed from: d, reason: collision with root package name */
    public final z0 f121758d;

    public a1(int i13, int i14, int i15, y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f121755a = i13;
        this.f121756b = i14;
        this.f121757c = i15;
        this.f121758d = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f121755a == a1Var.f121755a && this.f121756b == a1Var.f121756b && this.f121757c == a1Var.f121757c && Intrinsics.d(this.f121758d, a1Var.f121758d);
    }

    public final int hashCode() {
        return this.f121758d.hashCode() + ep.b.b(this.f121757c, ep.b.b(this.f121756b, Integer.hashCode(this.f121755a) * 31, 31), 31);
    }

    public final String toString() {
        return "HomePageItemDisplayState(vectorImage=" + this.f121755a + ", title=" + this.f121756b + ", description=" + this.f121757c + ", event=" + this.f121758d + ")";
    }
}
