package m90;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f86671a;

    /* renamed from: b, reason: collision with root package name */
    public final CutoutPickerOrigin f86672b;

    public m0(CutoutModel cutout, CutoutPickerOrigin origin) {
        Intrinsics.checkNotNullParameter(cutout, "cutout");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f86671a = cutout;
        this.f86672b = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f86671a, m0Var.f86671a) && this.f86672b == m0Var.f86672b;
    }

    public final int hashCode() {
        return this.f86672b.hashCode() + (this.f86671a.hashCode() * 31);
    }

    public final String toString() {
        return "AddToComposer(cutout=" + this.f86671a + ", origin=" + this.f86672b + ")";
    }
}
