package xs0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f135843a;

    /* renamed from: b, reason: collision with root package name */
    public final l32.c f135844b;

    public w(f30 pin, l32.c feedbackType) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        this.f135843a = pin;
        this.f135844b = feedbackType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f135843a, wVar.f135843a) && this.f135844b == wVar.f135844b;
    }

    public final int hashCode() {
        return this.f135844b.hashCode() + (this.f135843a.hashCode() * 31);
    }

    public final String toString() {
        return "HidePin(pin=" + this.f135843a + ", feedbackType=" + this.f135844b + ")";
    }
}
