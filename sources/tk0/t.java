package tk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f117995a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117996b;

    /* renamed from: c, reason: collision with root package name */
    public final List f117997c;

    public t(String boardId, String str, List excludedPinIds) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(excludedPinIds, "excludedPinIds");
        this.f117995a = boardId;
        this.f117996b = str;
        this.f117997c = excludedPinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f117995a, tVar.f117995a) && Intrinsics.d(this.f117996b, tVar.f117996b) && Intrinsics.d(this.f117997c, tVar.f117997c);
    }

    public final int hashCode() {
        int hashCode = this.f117995a.hashCode() * 31;
        String str = this.f117996b;
        return this.f117997c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeleteAllBut(boardId=");
        sb3.append(this.f117995a);
        sb3.append(", sectionId=");
        sb3.append(this.f117996b);
        sb3.append(", excludedPinIds=");
        return a.c.j(sb3, this.f117997c, ")");
    }
}
