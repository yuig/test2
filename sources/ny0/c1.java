package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f92565a;

    public c1(String useCaseId) {
        Intrinsics.checkNotNullParameter(useCaseId, "useCaseId");
        this.f92565a = useCaseId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && Intrinsics.d(this.f92565a, ((c1) obj).f92565a);
    }

    public final int hashCode() {
        return this.f92565a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowMoreButtonDisplayState(useCaseId="), this.f92565a, ")");
    }
}
