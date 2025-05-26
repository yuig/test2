package hv0;

import dl1.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final s f70462a;

    public i(s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f70462a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f70462a, ((i) obj).f70462a);
    }

    public final int hashCode() {
        return this.f70462a.hashCode();
    }

    public final String toString() {
        return "UpdateOverlayViewColorPickerWithModel(model=" + this.f70462a + ")";
    }
}
