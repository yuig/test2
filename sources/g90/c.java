package g90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f64515a;

    public c(String str) {
        this.f64515a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f64515a, ((c) obj).f64515a);
    }

    public final int hashCode() {
        String str = this.f64515a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CutoutSelected(cutoutPinId="), this.f64515a, ")");
    }
}
