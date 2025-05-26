package sa0;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f112161a;

    public c(CutoutModel cutoutModel) {
        this.f112161a = cutoutModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f112161a, ((c) obj).f112161a);
    }

    public final int hashCode() {
        CutoutModel cutoutModel = this.f112161a;
        if (cutoutModel == null) {
            return 0;
        }
        return cutoutModel.hashCode();
    }

    public final String toString() {
        return "CutoutSelected(cutout=" + this.f112161a + ")";
    }
}
