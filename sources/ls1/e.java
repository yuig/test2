package ls1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84687a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84688b;

    public e(ArrayList arrayList, boolean z13) {
        this.f84687a = z13;
        this.f84688b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f84687a == eVar.f84687a && Intrinsics.d(this.f84688b, eVar.f84688b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f84687a) * 31;
        List list = this.f84688b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "PinChipEvent(isParentPinPromoted=" + this.f84687a + ", pinChips=" + this.f84688b + ")";
    }
}
