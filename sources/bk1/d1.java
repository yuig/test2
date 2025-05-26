package bk1;

import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23206a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f23207b;

    public d1(int i13, d4 navigatingFrom) {
        Intrinsics.checkNotNullParameter(navigatingFrom, "navigatingFrom");
        this.f23206a = i13;
        this.f23207b = navigatingFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f23206a == d1Var.f23206a && this.f23207b == d1Var.f23207b;
    }

    public final int hashCode() {
        return this.f23207b.hashCode() + (Integer.hashCode(this.f23206a) * 31);
    }

    public final String toString() {
        return "ScrollToTopEventManagerSER(pinPosition=" + this.f23206a + ", navigatingFrom=" + this.f23207b + ")";
    }
}
