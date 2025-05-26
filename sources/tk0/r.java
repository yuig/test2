package tk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f117988a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117989b;

    /* renamed from: c, reason: collision with root package name */
    public final List f117990c;

    public r(String boardId, String str, List selectedPinIds) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        this.f117988a = boardId;
        this.f117989b = str;
        this.f117990c = selectedPinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f117988a, rVar.f117988a) && Intrinsics.d(this.f117989b, rVar.f117989b) && Intrinsics.d(this.f117990c, rVar.f117990c);
    }

    public final int hashCode() {
        int hashCode = this.f117988a.hashCode() * 31;
        String str = this.f117989b;
        return this.f117990c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreateSection(boardId=");
        sb3.append(this.f117988a);
        sb3.append(", sectionId=");
        sb3.append(this.f117989b);
        sb3.append(", selectedPinIds=");
        return a.c.j(sb3, this.f117990c, ")");
    }
}
