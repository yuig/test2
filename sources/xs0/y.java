package xs0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f135845a;

    /* renamed from: b, reason: collision with root package name */
    public final l32.c f135846b;

    /* renamed from: c, reason: collision with root package name */
    public final String f135847c;

    /* renamed from: d, reason: collision with root package name */
    public final int f135848d;

    public y(f30 pin, l32.c feedbackType, String str, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        this.f135845a = pin;
        this.f135846b = feedbackType;
        this.f135847c = str;
        this.f135848d = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f135845a, yVar.f135845a) && this.f135846b == yVar.f135846b && Intrinsics.d(this.f135847c, yVar.f135847c) && this.f135848d == yVar.f135848d;
    }

    public final int hashCode() {
        int hashCode = (this.f135846b.hashCode() + (this.f135845a.hashCode() * 31)) * 31;
        String str = this.f135847c;
        return Integer.hashCode(this.f135848d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "UndoHidePin(pin=" + this.f135845a + ", feedbackType=" + this.f135846b + ", sourceUid=" + this.f135847c + ", recommendationUid=" + this.f135848d + ")";
    }
}
