package s80;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f111569a;

    public h4(CutoutModel cutout) {
        Intrinsics.checkNotNullParameter(cutout, "cutout");
        this.f111569a = cutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4) && Intrinsics.d(this.f111569a, ((h4) obj).f111569a);
    }

    public final int hashCode() {
        return this.f111569a.hashCode();
    }

    public final String toString() {
        return "AddCutout(cutout=" + this.f111569a + ")";
    }
}
