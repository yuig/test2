package k31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final j f78259a;

    /* renamed from: b, reason: collision with root package name */
    public final a f78260b;

    public k(j header, a carousel) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        this.f78259a = header;
        this.f78260b = carousel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f78259a, kVar.f78259a) && Intrinsics.d(this.f78260b, kVar.f78260b);
    }

    public final int hashCode() {
        return this.f78260b.f78235a.hashCode() + (this.f78259a.hashCode() * 31);
    }

    public final String toString() {
        return "UnorganizedIdeasModuleDisplayState(header=" + this.f78259a + ", carousel=" + this.f78260b + ")";
    }
}
