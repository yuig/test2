package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s5 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111795a;

    public s5(String baordId) {
        Intrinsics.checkNotNullParameter(baordId, "baordId");
        this.f111795a = baordId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5) && Intrinsics.d(this.f111795a, ((s5) obj).f111795a);
    }

    public final int hashCode() {
        return this.f111795a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NavigateToPublishCollage(baordId="), this.f111795a, ")");
    }
}
