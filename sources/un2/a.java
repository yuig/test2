package un2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f122915a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f122916b;

    public a(Object obj, Object obj2) {
        this.f122915a = obj;
        this.f122916b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f122915a, aVar.f122915a) && Intrinsics.d(this.f122916b, aVar.f122916b);
    }

    public final int hashCode() {
        Object obj = this.f122915a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f122916b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f122915a + ", upper=" + this.f122916b + ')';
    }
}
