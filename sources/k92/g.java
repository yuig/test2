package k92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f78880a;

    public g(Integer num) {
        this.f78880a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f78880a, ((g) obj).f78880a);
    }

    public final int hashCode() {
        Integer num = this.f78880a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ToastCompletedEvent(toastId=" + this.f78880a + ")";
    }
}
