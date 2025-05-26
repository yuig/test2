package ea1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f58075a;

    /* renamed from: b, reason: collision with root package name */
    public final String f58076b;

    public l(String boardId, String str) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f58075a = boardId;
        this.f58076b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f58075a, lVar.f58075a) && Intrinsics.d(this.f58076b, lVar.f58076b);
    }

    public final int hashCode() {
        int hashCode = this.f58075a.hashCode() * 31;
        String str = this.f58076b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardSelected(boardId=");
        sb3.append(this.f58075a);
        sb3.append(", sectionId=");
        return a.a.p(sb3, this.f58076b, ")");
    }
}
