package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f92555a;

    public b1(String useCaseId) {
        Intrinsics.checkNotNullParameter(useCaseId, "useCaseId");
        this.f92555a = useCaseId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && Intrinsics.d(this.f92555a, ((b1) obj).f92555a);
    }

    public final int hashCode() {
        return this.f92555a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowMoreButton(useCaseId="), this.f92555a, ")");
    }
}
