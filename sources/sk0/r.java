package sk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f113080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113081b;

    public r(String boardId, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f113080a = boardId;
        this.f113081b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f113080a, rVar.f113080a) && Intrinsics.d(this.f113081b, rVar.f113081b);
    }

    public final int hashCode() {
        int hashCode = this.f113080a.hashCode() * 31;
        String str = this.f113081b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowBoardAction(boardId=");
        sb3.append(this.f113080a);
        sb3.append(", boardSectionId=");
        return a.a.p(sb3, this.f113081b, ")");
    }
}
