package zy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 implements u50.o {

    /* renamed from: a */
    public final h32.i0 f143056a;

    /* renamed from: b */
    public final String f143057b;

    public a0(h32.i0 pinalyticsContext, String str) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f143056a = pinalyticsContext;
        this.f143057b = str;
    }

    public final h32.i0 e() {
        return this.f143056a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f143056a, a0Var.f143056a) && Intrinsics.d(this.f143057b, a0Var.f143057b);
    }

    public final String f() {
        return this.f143057b;
    }

    public final int hashCode() {
        int hashCode = this.f143056a.hashCode() * 31;
        String str = this.f143057b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PinalyticsDisplayState(pinalyticsContext=" + this.f143056a + ", uniqueScreenKey=" + this.f143057b + ")";
    }

    public a0() {
        this(new h32.i0(null, null, null, null, null, null), null);
    }
}
