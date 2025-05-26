package k92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f78879a;

    public f(Integer num) {
        this.f78879a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f78879a, ((f) obj).f78879a);
    }

    public final int hashCode() {
        Integer num = this.f78879a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ToastClickedEvent(toastId=" + this.f78879a + ")";
    }
}
