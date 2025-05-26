package am2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.b f15551a;

    /* renamed from: b, reason: collision with root package name */
    public final List f15552b;

    public f0(ym2.b classId, List typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        this.f15551a = classId;
        this.f15552b = typeParametersCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f15551a, f0Var.f15551a) && Intrinsics.d(this.f15552b, f0Var.f15552b);
    }

    public final int hashCode() {
        return this.f15552b.hashCode() + (this.f15551a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClassRequest(classId=");
        sb3.append(this.f15551a);
        sb3.append(", typeParametersCount=");
        return d7.g.k(sb3, this.f15552b, ')');
    }
}
