package k92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements o {

    /* renamed from: a, reason: collision with root package name */
    public final a f78888a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f78889b;

    public m(a toast, Integer num) {
        Intrinsics.checkNotNullParameter(toast, "toast");
        this.f78888a = toast;
        this.f78889b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f78888a, mVar.f78888a) && Intrinsics.d(this.f78889b, mVar.f78889b);
    }

    @Override // k92.o
    public final Integer g() {
        return this.f78889b;
    }

    public final int hashCode() {
        int hashCode = this.f78888a.hashCode() * 31;
        Integer num = this.f78889b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final a j() {
        return this.f78888a;
    }

    public final String toString() {
        return "ShowCustomToastRequest(toast=" + this.f78888a + ", toastId=" + this.f78889b + ")";
    }
}
