package m90;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f86689a;

    /* renamed from: b, reason: collision with root package name */
    public final CutoutPickerOrigin f86690b;

    public q0(String id3, CutoutPickerOrigin origin) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f86689a = id3;
        this.f86690b = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f86689a, q0Var.f86689a) && this.f86690b == q0Var.f86690b;
    }

    public final int hashCode() {
        return this.f86690b.hashCode() + (this.f86689a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateToCloseup(id=" + this.f86689a + ", origin=" + this.f86690b + ")";
    }
}
