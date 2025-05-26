package s80;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q5 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public final List f111774a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111775b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f111776c;

    public q5(List pinIds, boolean z13, boolean z14, int i13) {
        pinIds = (i13 & 1) != 0 ? kotlin.collections.q0.f80391a : pinIds;
        z14 = (i13 & 4) != 0 ? false : z14;
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        this.f111774a = pinIds;
        this.f111775b = z13;
        this.f111776c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return Intrinsics.d(this.f111774a, q5Var.f111774a) && this.f111775b == q5Var.f111775b && this.f111776c == q5Var.f111776c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111776c) + ep.b.e(this.f111775b, this.f111774a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavigateToCutoutPicker(pinIds=");
        sb3.append(this.f111774a);
        sb3.append(", shouldNavigateToBottomSheet=");
        sb3.append(this.f111775b);
        sb3.append(", shouldShowOnboarding=");
        return a.a.r(sb3, this.f111776c, ")");
    }
}
