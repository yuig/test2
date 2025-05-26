package s02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f110338a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110339b;

    public p(String str, boolean z13) {
        this.f110338a = z13;
        this.f110339b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f110338a == pVar.f110338a && Intrinsics.d(this.f110339b, pVar.f110339b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f110338a) * 31;
        String str = this.f110339b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FinishAppealEvent(success=" + this.f110338a + ", userId=" + this.f110339b + ")";
    }
}
