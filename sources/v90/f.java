package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f124892a;

    public f(String collageId) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        this.f124892a = collageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f124892a, ((f) obj).f124892a);
    }

    public final int hashCode() {
        return this.f124892a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DraftCollagePicked(collageId="), this.f124892a, ")");
    }
}
