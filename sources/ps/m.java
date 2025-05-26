package ps;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f101244a;

    /* renamed from: b, reason: collision with root package name */
    public final String f101245b;

    public m(int i13, String str) {
        this.f101244a = i13;
        this.f101245b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f101244a == mVar.f101244a && Intrinsics.d(this.f101245b, mVar.f101245b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f101244a) * 31;
        String str = this.f101245b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PinChipIndexEvent(currentlyViewedChipIndex=" + this.f101244a + ", pinId=" + this.f101245b + ")";
    }
}
