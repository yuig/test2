package u52;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120747a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120748b;

    /* renamed from: c, reason: collision with root package name */
    public final int f120749c;

    /* renamed from: d, reason: collision with root package name */
    public final List f120750d;

    public x0(int i13, String boardId, String templateId, ArrayList selectedPinIds) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        this.f120747a = boardId;
        this.f120748b = templateId;
        this.f120749c = i13;
        this.f120750d = selectedPinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.d(this.f120747a, x0Var.f120747a) && Intrinsics.d(this.f120748b, x0Var.f120748b) && this.f120749c == x0Var.f120749c && Intrinsics.d(this.f120750d, x0Var.f120750d);
    }

    public final int hashCode() {
        return this.f120750d.hashCode() + ep.b.b(this.f120749c, cb.d(this.f120748b, this.f120747a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavigateToPinPicker(boardId=");
        sb3.append(this.f120747a);
        sb3.append(", templateId=");
        sb3.append(this.f120748b);
        sb3.append(", maxPinCount=");
        sb3.append(this.f120749c);
        sb3.append(", selectedPinIds=");
        return a.c.j(sb3, this.f120750d, ")");
    }
}
