package s80;

import com.pinterest.shuffles.core.ui.model.CutoutModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t4 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final CutoutModel f111803a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111804b;

    public t4(CutoutModel newCutout, String oldId) {
        Intrinsics.checkNotNullParameter(newCutout, "newCutout");
        Intrinsics.checkNotNullParameter(oldId, "oldId");
        this.f111803a = newCutout;
        this.f111804b = oldId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        if (!Intrinsics.d(this.f111803a, t4Var.f111803a)) {
            return false;
        }
        int i13 = r72.a2.f106437b;
        return Intrinsics.d(this.f111804b, t4Var.f111804b);
    }

    public final int hashCode() {
        int hashCode = this.f111803a.hashCode() * 31;
        int i13 = r72.a2.f106437b;
        return this.f111804b.hashCode() + hashCode;
    }

    public final String toString() {
        return "ReplaceCutout(newCutout=" + this.f111803a + ", oldId=" + r72.a2.a(this.f111804b) + ")";
    }
}
