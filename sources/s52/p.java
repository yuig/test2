package s52;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f111196a;

    /* renamed from: b, reason: collision with root package name */
    public final int f111197b;

    /* renamed from: c, reason: collision with root package name */
    public final List f111198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f111199d;

    public p(int i13, String boardId, String templateId, List selectedPins) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(selectedPins, "selectedPins");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        this.f111196a = boardId;
        this.f111197b = i13;
        this.f111198c = selectedPins;
        this.f111199d = templateId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f111196a, pVar.f111196a) && this.f111197b == pVar.f111197b && Intrinsics.d(this.f111198c, pVar.f111198c) && Intrinsics.d(this.f111199d, pVar.f111199d);
    }

    public final int hashCode() {
        return this.f111199d.hashCode() + ep.b.c(this.f111198c, ep.b.b(this.f111197b, this.f111196a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShareBoardPinSelectionArgs(boardId=");
        sb3.append(this.f111196a);
        sb3.append(", maxPinCount=");
        sb3.append(this.f111197b);
        sb3.append(", selectedPins=");
        sb3.append(this.f111198c);
        sb3.append(", templateId=");
        return a.a.p(sb3, this.f111199d, ")");
    }
}
