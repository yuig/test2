package o70;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f93223a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f93224b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f93225c;

    public a(f30 pin, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f93223a = pin;
        this.f93224b = z13;
        this.f93225c = z14;
    }

    public static a b(a aVar, boolean z13, boolean z14, int i13) {
        f30 pin = aVar.f93223a;
        if ((i13 & 2) != 0) {
            z13 = aVar.f93224b;
        }
        if ((i13 & 4) != 0) {
            z14 = aVar.f93225c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        return new a(pin, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f93223a, aVar.f93223a) && this.f93224b == aVar.f93224b && this.f93225c == aVar.f93225c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93225c) + ep.b.e(this.f93224b, this.f93223a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardShopToolPinCellVMState(pin=");
        sb3.append(this.f93223a);
        sb3.append(", isReported=");
        sb3.append(this.f93224b);
        sb3.append(", isSavedTrigger=");
        return a.a.r(sb3, this.f93225c, ")");
    }
}
