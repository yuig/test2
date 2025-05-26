package z70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final String f140990a;

    public d(String str) {
        this.f140990a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f140990a, ((d) obj).f140990a);
    }

    public final int hashCode() {
        String str = this.f140990a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ChromeSessionInProgress(pinId="), this.f140990a, ")");
    }
}
