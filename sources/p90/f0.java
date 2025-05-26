package p90;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f99186a;

    /* renamed from: b, reason: collision with root package name */
    public final CutoutPickerOrigin f99187b;

    public f0(CutoutModel cutout, CutoutPickerOrigin origin) {
        Intrinsics.checkNotNullParameter(cutout, "cutout");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f99186a = cutout;
        this.f99187b = origin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f99186a, f0Var.f99186a) && this.f99187b == f0Var.f99187b;
    }

    public final int hashCode() {
        return this.f99187b.hashCode() + (this.f99186a.hashCode() * 31);
    }

    public final String toString() {
        return "CloseWithCutoutSelection(cutout=" + this.f99186a + ", origin=" + this.f99187b + ")";
    }
}
