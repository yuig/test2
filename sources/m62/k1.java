package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final k62.g f86026a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86027b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86028c;

    public k1(k62.g toolInfo, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(toolInfo, "toolInfo");
        this.f86026a = toolInfo;
        this.f86027b = z13;
        this.f86028c = z14;
    }

    public static k1 a(k1 k1Var, k62.g toolInfo, boolean z13, boolean z14, int i13) {
        if ((i13 & 1) != 0) {
            toolInfo = k1Var.f86026a;
        }
        if ((i13 & 2) != 0) {
            z13 = k1Var.f86027b;
        }
        if ((i13 & 4) != 0) {
            z14 = k1Var.f86028c;
        }
        Intrinsics.checkNotNullParameter(toolInfo, "toolInfo");
        return new k1(toolInfo, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.d(this.f86026a, k1Var.f86026a) && this.f86027b == k1Var.f86027b && this.f86028c == k1Var.f86028c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86028c) + ep.b.e(this.f86027b, this.f86026a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ToolModel(toolInfo=");
        sb3.append(this.f86026a);
        sb3.append(", isSelected=");
        sb3.append(this.f86027b);
        sb3.append(", isHighlighted=");
        return a.a.r(sb3, this.f86028c, ")");
    }
}
