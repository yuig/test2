package k92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f78877a;

    public d(Integer num) {
        this.f78877a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f78877a, ((d) obj).f78877a);
    }

    public final int hashCode() {
        Integer num = this.f78877a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ToastButtonClickedEvent(toastId=" + this.f78877a + ")";
    }
}
