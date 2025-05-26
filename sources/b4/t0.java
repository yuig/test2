package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f21662a;

    public t0(String str) {
        this.f21662a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t0) {
            return Intrinsics.d(this.f21662a, ((t0) obj).f21662a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21662a.hashCode();
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("UrlAnnotation(url="), this.f21662a, ')');
    }
}
