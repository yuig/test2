package tx0;

import com.pinterest.api.model.dh;
import com.pinterest.api.model.qx;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class q implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final qx f119669a;

    /* renamed from: b, reason: collision with root package name */
    public final dh f119670b;

    public q(qx item, dh displayMode) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        this.f119669a = item;
        this.f119670b = displayMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f119669a, qVar.f119669a) && this.f119670b == qVar.f119670b;
    }

    public final int hashCode() {
        return this.f119670b.hashCode() + (this.f119669a.hashCode() * 31);
    }

    public final String toString() {
        return "NewsHubFeedItemVMState(item=" + this.f119669a + ", displayMode=" + this.f119670b + ")";
    }
}
