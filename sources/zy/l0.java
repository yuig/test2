package zy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f143086a;

    /* renamed from: b, reason: collision with root package name */
    public final String f143087b;

    public l0(h32.i0 i0Var, int i13) {
        this((i13 & 1) != 0 ? new h32.i0(null, null, null, null, null, null) : i0Var, (String) null);
    }

    public static l0 b(l0 l0Var, h32.i0 pinalyticsContext) {
        String str = l0Var.f143087b;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        return new l0(pinalyticsContext, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f143086a, l0Var.f143086a) && Intrinsics.d(this.f143087b, l0Var.f143087b);
    }

    public final int hashCode() {
        int hashCode = this.f143086a.hashCode() * 31;
        String str = this.f143087b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PinalyticsVMState(pinalyticsContext=" + this.f143086a + ", uniqueScreenKey=" + this.f143087b + ")";
    }

    public l0(h32.i0 pinalyticsContext, String str) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f143086a = pinalyticsContext;
        this.f143087b = str;
    }
}
