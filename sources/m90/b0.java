package m90;

import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutPickerPage f86631a;

    public b0(CutoutPickerPage page) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.f86631a = page;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f86631a, ((b0) obj).f86631a);
    }

    public final int hashCode() {
        return this.f86631a.hashCode();
    }

    public final String toString() {
        return "Page(page=" + this.f86631a + ")";
    }
}
