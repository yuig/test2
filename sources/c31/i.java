package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f31.y f25584a;

    public i(f31.y innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f25584a = innerEvent;
    }

    @Override // c31.f
    public final u50.s d() {
        return this.f25584a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f25584a, ((i) obj).f25584a);
    }

    public final int hashCode() {
        return this.f25584a.hashCode();
    }

    public final String toString() {
        return "WrappedSearchEvent(innerEvent=" + this.f25584a + ")";
    }
}
