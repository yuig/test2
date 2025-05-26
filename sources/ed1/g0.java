package ed1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58608a;

    /* renamed from: b, reason: collision with root package name */
    public final i91.c0 f58609b;

    public g0(int i13, i91.c0 selectedShareConfig) {
        Intrinsics.checkNotNullParameter(selectedShareConfig, "selectedShareConfig");
        this.f58608a = i13;
        this.f58609b = selectedShareConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f58608a == g0Var.f58608a && Intrinsics.d(this.f58609b, g0Var.f58609b);
    }

    public final int hashCode() {
        return this.f58609b.hashCode() + (Integer.hashCode(this.f58608a) * 31);
    }

    public final String toString() {
        return "SharesheetModalPreviewSelected(position=" + this.f58608a + ", selectedShareConfig=" + this.f58609b + ")";
    }
}
