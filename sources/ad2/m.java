package ad2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final int f2107a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2108b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2109c;

    public m(int i13, String boardId, String boardName) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        this.f2107a = i13;
        this.f2108b = boardId;
        this.f2109c = boardName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2107a == mVar.f2107a && Intrinsics.d(this.f2108b, mVar.f2108b) && Intrinsics.d(this.f2109c, mVar.f2109c);
    }

    public final int hashCode() {
        return this.f2109c.hashCode() + cb.d(this.f2108b, Integer.hashCode(this.f2107a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SaveBoardSelectionRequest(widgetId=");
        sb3.append(this.f2107a);
        sb3.append(", boardId=");
        sb3.append(this.f2108b);
        sb3.append(", boardName=");
        return a.a.p(sb3, this.f2109c, ")");
    }
}
