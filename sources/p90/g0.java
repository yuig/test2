package p90;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f99189a;

    /* renamed from: b, reason: collision with root package name */
    public final CutoutPickerOrigin f99190b;

    public g0(String id3, CutoutPickerOrigin origin) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f99189a = id3;
        this.f99190b = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f99189a, g0Var.f99189a) && this.f99190b == g0Var.f99190b;
    }

    public final int hashCode() {
        return this.f99190b.hashCode() + (this.f99189a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateToCloseup(id=" + this.f99189a + ", origin=" + this.f99190b + ")";
    }
}
