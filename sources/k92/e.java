package k92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f78878a;

    public e(Integer num) {
        this.f78878a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f78878a, ((e) obj).f78878a);
    }

    public final int hashCode() {
        Integer num = this.f78878a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ToastCanceledEvent(toastId=" + this.f78878a + ")";
    }
}
