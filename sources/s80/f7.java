package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f7 implements u50.o {

    /* renamed from: c, reason: collision with root package name */
    public static final f7 f111538c = new f7(u50.h0.f120562a, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111539a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f111540b;

    public f7(u50.i0 text, boolean z13) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f111539a = z13;
        this.f111540b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return this.f111539a == f7Var.f111539a && Intrinsics.d(this.f111540b, f7Var.f111540b);
    }

    public final int hashCode() {
        return this.f111540b.hashCode() + (Boolean.hashCode(this.f111539a) * 31);
    }

    public final String toString() {
        return "ProgressOverlayDisplayState(isVisible=" + this.f111539a + ", text=" + this.f111540b + ")";
    }
}
