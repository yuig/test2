package sf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f112692a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f112693b;

    public r0(int i13, q0 progress) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f112692a = i13;
        this.f112693b = progress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f112692a == r0Var.f112692a && Intrinsics.d(this.f112693b, r0Var.f112693b);
    }

    public final int hashCode() {
        return this.f112693b.hashCode() + (Integer.hashCode(this.f112692a) * 31);
    }

    public final String toString() {
        return "ProgressState(index=" + this.f112692a + ", progress=" + this.f112693b + ")";
    }
}
