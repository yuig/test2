package sa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements o {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f112178a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f112179b;

    public l(b0 source, Integer num) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f112178a = source;
        this.f112179b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f112178a, lVar.f112178a) && Intrinsics.d(this.f112179b, lVar.f112179b);
    }

    public final int hashCode() {
        int hashCode = this.f112178a.hashCode() * 31;
        Integer num = this.f112179b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Initialize(source=" + this.f112178a + ", maxCutoutItems=" + this.f112179b + ")";
    }
}
