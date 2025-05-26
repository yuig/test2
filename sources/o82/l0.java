package o82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f93652a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93653b;

    public l0(List items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f93652a = items;
        this.f93653b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f93652a, l0Var.f93652a) && Intrinsics.d(this.f93653b, l0Var.f93653b);
    }

    public final int hashCode() {
        int hashCode = this.f93652a.hashCode() * 31;
        String str = this.f93653b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PagedResponse(items=" + this.f93652a + ", cursor=" + this.f93653b + ")";
    }
}
