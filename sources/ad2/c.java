package ad2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f2093a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2094b;

    public c(String boardId, String boardName) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        this.f2093a = boardId;
        this.f2094b = boardName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f2093a, cVar.f2093a) && Intrinsics.d(this.f2094b, cVar.f2094b);
    }

    public final int hashCode() {
        return this.f2094b.hashCode() + (this.f2093a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardSelected(boardId=");
        sb3.append(this.f2093a);
        sb3.append(", boardName=");
        return a.a.p(sb3, this.f2094b, ")");
    }
}
