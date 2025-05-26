package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f57418a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57419b;

    public s0(Integer num, Integer num2) {
        this.f57418a = num;
        this.f57419b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f57418a, s0Var.f57418a) && Intrinsics.d(this.f57419b, s0Var.f57419b);
    }

    public final int hashCode() {
        Integer num = this.f57418a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f57419b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Metadata(storyPinBlockId=" + this.f57418a + ", storyPinPageId=" + this.f57419b + ")";
    }
}
