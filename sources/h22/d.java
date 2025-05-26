package h22;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f66581a;

    /* renamed from: b, reason: collision with root package name */
    public final List f66582b;

    public d(f30 pin, List pages) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f66581a = pin;
        this.f66582b = pages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f66581a, dVar.f66581a) && Intrinsics.d(this.f66582b, dVar.f66582b);
    }

    public final int hashCode() {
        return this.f66582b.hashCode() + (this.f66581a.hashCode() * 31);
    }

    public final String toString() {
        return "StoryPinResponse(pin=" + this.f66581a + ", pages=" + this.f66582b + ")";
    }
}
