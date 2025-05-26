package v90;

import com.pinterest.shuffles.core.ui.model.MaskModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final MaskModel f124969a;

    public x(MaskModel maskModel) {
        this.f124969a = maskModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f124969a, ((x) obj).f124969a);
    }

    public final int hashCode() {
        MaskModel maskModel = this.f124969a;
        if (maskModel == null) {
            return 0;
        }
        return maskModel.hashCode();
    }

    public final String toString() {
        return "PrimaryButtonClicked(model=" + this.f124969a + ")";
    }
}
