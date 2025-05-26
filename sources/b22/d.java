package b22;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f21289a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21290b;

    public d(ArrayList pins, String str) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f21289a = pins;
        this.f21290b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f21289a, dVar.f21289a) && Intrinsics.d(this.f21290b, dVar.f21290b);
    }

    public final int hashCode() {
        int hashCode = this.f21289a.hashCode() * 31;
        String str = this.f21290b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PinListWithBookmark(pins=" + this.f21289a + ", bookmark=" + this.f21290b + ")";
    }
}
