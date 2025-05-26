package qz;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final List f105410a;

    /* renamed from: b, reason: collision with root package name */
    public final String f105411b;

    public j(List pins, String str) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.f105410a = pins;
        this.f105411b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f105410a, jVar.f105410a) && Intrinsics.d(this.f105411b, jVar.f105411b);
    }

    public final int hashCode() {
        int hashCode = this.f105410a.hashCode() * 31;
        String str = this.f105411b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BoardSharingPinsPage(pins=" + this.f105410a + ", bookmark=" + this.f105411b + ")";
    }
}
