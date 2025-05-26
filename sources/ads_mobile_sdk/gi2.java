package ads_mobile_sdk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class gi2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5579a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5580b;

    public gi2(String signalBlob, List list) {
        Intrinsics.checkNotNullParameter(signalBlob, "signalBlob");
        this.f5579a = signalBlob;
        this.f5580b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi2)) {
            return false;
        }
        gi2 gi2Var = (gi2) obj;
        return Intrinsics.d(this.f5579a, gi2Var.f5579a) && Intrinsics.d(this.f5580b, gi2Var.f5580b);
    }

    public final int hashCode() {
        int hashCode = this.f5579a.hashCode() * 31;
        List list = this.f5580b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "SignalResponse(signalBlob=" + this.f5579a + ", csrbErrors=" + this.f5580b + ")";
    }
}
