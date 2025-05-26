package z70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final String f140988a = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f140988a, ((a) obj).f140988a);
    }

    public final int hashCode() {
        String str = this.f140988a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ChromeSessionComplete(pinId="), this.f140988a, ")");
    }
}
