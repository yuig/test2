package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f83872a;

    public j(String sectionId) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        this.f83872a = sectionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f83872a, ((j) obj).f83872a);
    }

    public final int hashCode() {
        return this.f83872a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardSectionClicked(sectionId="), this.f83872a, ")");
    }
}
