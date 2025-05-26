package sv;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f115311a;

    public q(String str) {
        this.f115311a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f115311a, ((q) obj).f115311a);
    }

    public final int hashCode() {
        String str = this.f115311a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadPinCollage(pinUid="), this.f115311a, ")");
    }
}
