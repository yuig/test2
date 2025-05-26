package k92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final c f78890a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f78891b;

    public n(c toastConfig, Integer num) {
        Intrinsics.checkNotNullParameter(toastConfig, "toastConfig");
        this.f78890a = toastConfig;
        this.f78891b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f78890a, nVar.f78890a) && Intrinsics.d(this.f78891b, nVar.f78891b);
    }

    @Override // k92.o
    public final Integer g() {
        return this.f78891b;
    }

    public final int hashCode() {
        int hashCode = this.f78890a.hashCode() * 31;
        Integer num = this.f78891b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final c j() {
        return this.f78890a;
    }

    public final String toString() {
        return "ShowSimpleToastRequest(toastConfig=" + this.f78890a + ", toastId=" + this.f78891b + ")";
    }
}
