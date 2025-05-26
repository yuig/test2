package s80;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 implements r1 {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f111642a;

    public l1(CutoutModel cutout) {
        Intrinsics.checkNotNullParameter(cutout, "cutout");
        this.f111642a = cutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.d(this.f111642a, ((l1) obj).f111642a);
    }

    public final int hashCode() {
        return this.f111642a.hashCode();
    }

    public final String toString() {
        return "LocalCutoutCreated(cutout=" + this.f111642a + ")";
    }
}
