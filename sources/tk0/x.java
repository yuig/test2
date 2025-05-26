package tk0;

import com.pinterest.api.model.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f118006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118007b;

    /* renamed from: c, reason: collision with root package name */
    public final List f118008c;

    public x(v7 board, String str, List selectedPinIds) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        this.f118006a = board;
        this.f118007b = str;
        this.f118008c = selectedPinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f118006a, xVar.f118006a) && Intrinsics.d(this.f118007b, xVar.f118007b) && Intrinsics.d(this.f118008c, xVar.f118008c);
    }

    public final int hashCode() {
        int hashCode = this.f118006a.hashCode() * 31;
        String str = this.f118007b;
        return this.f118008c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MovePins(board=");
        sb3.append(this.f118006a);
        sb3.append(", sectionId=");
        sb3.append(this.f118007b);
        sb3.append(", selectedPinIds=");
        return a.c.j(sb3, this.f118008c, ")");
    }
}
