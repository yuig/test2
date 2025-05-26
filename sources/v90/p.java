package v90;

import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements u {

    /* renamed from: a, reason: collision with root package name */
    public final MaskModel f124951a;

    public p(MaskModel maskModel) {
        this.f124951a = maskModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f124951a, ((p) obj).f124951a);
    }

    public final int hashCode() {
        MaskModel maskModel = this.f124951a;
        if (maskModel == null) {
            return 0;
        }
        return maskModel.hashCode();
    }

    public final String toString() {
        return "RefineDoneClicked(model=" + this.f124951a + ")";
    }
}
