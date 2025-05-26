package hp0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f69824a;

    public b0(String str) {
        this.f69824a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f69824a, ((b0) obj).f69824a);
    }

    public final int hashCode() {
        String str = this.f69824a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadCarousel(rootPinUid="), this.f69824a, ")");
    }
}
