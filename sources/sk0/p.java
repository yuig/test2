package sk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f113074a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113075b;

    public p(String boardId, String sectionId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        this.f113074a = boardId;
        this.f113075b = sectionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f113074a, pVar.f113074a) && Intrinsics.d(this.f113075b, pVar.f113075b);
    }

    public final int hashCode() {
        return this.f113075b.hashCode() + (this.f113074a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavigateToSectionMoreIdeas(boardId=");
        sb3.append(this.f113074a);
        sb3.append(", sectionId=");
        return a.a.p(sb3, this.f113075b, ")");
    }
}
