package mu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f88222a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f88223b;

    public p(String pinId, i0 pinLoadingStrategy) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pinLoadingStrategy, "pinLoadingStrategy");
        this.f88222a = pinId;
        this.f88223b = pinLoadingStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f88222a, pVar.f88222a) && this.f88223b == pVar.f88223b;
    }

    public final int hashCode() {
        return this.f88223b.hashCode() + (this.f88222a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadData(pinId=" + this.f88222a + ", pinLoadingStrategy=" + this.f88223b + ")";
    }
}
