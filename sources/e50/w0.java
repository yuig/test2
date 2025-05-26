package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f57443a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f57444b;

    public w0(Integer num, Integer num2) {
        this.f57443a = num;
        this.f57444b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.d(this.f57443a, w0Var.f57443a) && Intrinsics.d(this.f57444b, w0Var.f57444b);
    }

    public final int hashCode() {
        Integer num = this.f57443a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f57444b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Metadata(storyPinBlockId=" + this.f57443a + ", storyPinPageId=" + this.f57444b + ")";
    }
}
