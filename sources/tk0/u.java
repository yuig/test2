package tk0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f117998a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117999b;

    /* renamed from: c, reason: collision with root package name */
    public final List f118000c;

    public u(String boardId, String str, List selectedPinIds) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        this.f117998a = boardId;
        this.f117999b = str;
        this.f118000c = selectedPinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f117998a, uVar.f117998a) && Intrinsics.d(this.f117999b, uVar.f117999b) && Intrinsics.d(this.f118000c, uVar.f118000c);
    }

    public final int hashCode() {
        int hashCode = this.f117998a.hashCode() * 31;
        String str = this.f117999b;
        return this.f118000c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeletePins(boardId=");
        sb3.append(this.f117998a);
        sb3.append(", sectionId=");
        sb3.append(this.f117999b);
        sb3.append(", selectedPinIds=");
        return a.c.j(sb3, this.f118000c, ")");
    }
}
