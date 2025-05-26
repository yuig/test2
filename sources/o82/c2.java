package o82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c2 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f93549a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f93550b;

    public c2(Object obj, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f93549a = items;
        this.f93550b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Intrinsics.d(this.f93549a, c2Var.f93549a) && Intrinsics.d(this.f93550b, c2Var.f93550b);
    }

    public final int hashCode() {
        int hashCode = this.f93549a.hashCode() * 31;
        Object obj = this.f93550b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "UpdateTrackingParams(items=" + this.f93549a + ", args=" + this.f93550b + ")";
    }
}
