package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104257a;

    public d0(String sectionId) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        this.f104257a = sectionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f104257a, ((d0) obj).f104257a);
    }

    public final int hashCode() {
        return this.f104257a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SectionPreviewClicked(sectionId="), this.f104257a, ")");
    }
}
