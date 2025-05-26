package u52;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120741a;

    /* renamed from: b, reason: collision with root package name */
    public final List f120742b;

    public w0(String templateId, List selectedPinIds) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        this.f120741a = templateId;
        this.f120742b = selectedPinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.d(this.f120741a, w0Var.f120741a) && Intrinsics.d(this.f120742b, w0Var.f120742b);
    }

    public final int hashCode() {
        return this.f120742b.hashCode() + (this.f120741a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Exit(templateId=");
        sb3.append(this.f120741a);
        sb3.append(", selectedPinIds=");
        return a.c.j(sb3, this.f120742b, ")");
    }
}
