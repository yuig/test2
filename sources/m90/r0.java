package m90;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutPickerPage f86693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86694b;

    public r0(CutoutPickerPage page, int i13) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.f86693a = page;
        this.f86694b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f86693a, r0Var.f86693a) && this.f86694b == r0Var.f86694b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86694b) + (this.f86693a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateToPage(page=" + this.f86693a + ", numColumns=" + this.f86694b + ")";
    }
}
