package tk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f117991a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117992b;

    /* renamed from: c, reason: collision with root package name */
    public final List f117993c;

    /* renamed from: d, reason: collision with root package name */
    public final List f117994d;

    public s(String boardId, String str, List selectedPinIds, List excludedPinIds) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        Intrinsics.checkNotNullParameter(excludedPinIds, "excludedPinIds");
        this.f117991a = boardId;
        this.f117992b = str;
        this.f117993c = selectedPinIds;
        this.f117994d = excludedPinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f117991a, sVar.f117991a) && Intrinsics.d(this.f117992b, sVar.f117992b) && Intrinsics.d(this.f117993c, sVar.f117993c) && Intrinsics.d(this.f117994d, sVar.f117994d);
    }

    public final int hashCode() {
        int hashCode = this.f117991a.hashCode() * 31;
        String str = this.f117992b;
        return this.f117994d.hashCode() + ep.b.c(this.f117993c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreateSectionForAllBut(boardId=");
        sb3.append(this.f117991a);
        sb3.append(", sectionId=");
        sb3.append(this.f117992b);
        sb3.append(", selectedPinIds=");
        sb3.append(this.f117993c);
        sb3.append(", excludedPinIds=");
        return a.c.j(sb3, this.f117994d, ")");
    }
}
