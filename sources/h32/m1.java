package h32;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final kp.n f67140b = new kp.n(24);

    /* renamed from: a, reason: collision with root package name */
    public final List f67141a;

    public m1(List list) {
        this.f67141a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1) {
            return Intrinsics.d(this.f67141a, ((m1) obj).f67141a) && Intrinsics.d(null, null) && Intrinsics.d(null, null);
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f67141a;
        return (list == null ? 0 : list.hashCode()) * 961;
    }

    public final String toString() {
        return a.c.j(new StringBuilder("InterestImpressionData(interestImpressions="), this.f67141a, ", orderType=null, blendType=null)");
    }
}
