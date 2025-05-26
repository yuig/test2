package km0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f80180a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80181b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80182c;

    public e(String boardId, String boardSessionId, int i13) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardSessionId, "boardSessionId");
        this.f80180a = boardId;
        this.f80181b = boardSessionId;
        this.f80182c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f80180a, eVar.f80180a) && Intrinsics.d(this.f80181b, eVar.f80181b) && this.f80182c == eVar.f80182c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f80182c) + cb.d(this.f80181b, this.f80180a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AllSavesBoardSectionsPageLoaderArgs(boardId=");
        sb3.append(this.f80180a);
        sb3.append(", boardSessionId=");
        sb3.append(this.f80181b);
        sb3.append(", sectionViewType=");
        return a.a.n(sb3, this.f80182c, ")");
    }
}
