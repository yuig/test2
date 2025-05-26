package tk0;

import com.pinterest.api.model.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f118002a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118003b;

    /* renamed from: c, reason: collision with root package name */
    public final List f118004c;

    /* renamed from: d, reason: collision with root package name */
    public final List f118005d;

    public w(v7 board, String str, List selectedPinIds, List excludedPinIds) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(selectedPinIds, "selectedPinIds");
        Intrinsics.checkNotNullParameter(excludedPinIds, "excludedPinIds");
        this.f118002a = board;
        this.f118003b = str;
        this.f118004c = selectedPinIds;
        this.f118005d = excludedPinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f118002a, wVar.f118002a) && Intrinsics.d(this.f118003b, wVar.f118003b) && Intrinsics.d(this.f118004c, wVar.f118004c) && Intrinsics.d(this.f118005d, wVar.f118005d);
    }

    public final int hashCode() {
        int hashCode = this.f118002a.hashCode() * 31;
        String str = this.f118003b;
        return this.f118005d.hashCode() + ep.b.c(this.f118004c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "MoveAllPinsBut(board=" + this.f118002a + ", sectionId=" + this.f118003b + ", selectedPinIds=" + this.f118004c + ", excludedPinIds=" + this.f118005d + ")";
    }
}
