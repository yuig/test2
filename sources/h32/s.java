package h32;

import c50.t4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final t4 f67229b = new t4(24);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f67230a;

    public s(Integer num) {
        this.f67230a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f67230a, ((s) obj).f67230a);
    }

    public final int hashCode() {
        Integer num = this.f67230a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "BadgeItemData(badgeLabelEnum=" + this.f67230a + ")";
    }
}
