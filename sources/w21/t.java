package w21;

import com.pinterest.api.model.i50;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f127810a;

    /* renamed from: b, reason: collision with root package name */
    public final i50 f127811b;

    public t(int i13, i50 option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f127810a = i13;
        this.f127811b = option;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f127810a == tVar.f127810a && Intrinsics.d(this.f127811b, tVar.f127811b);
    }

    public final int hashCode() {
        return this.f127811b.hashCode() + (Integer.hashCode(this.f127810a) * 31);
    }

    public final String toString() {
        return "PinSelected(phase=" + this.f127810a + ", option=" + this.f127811b + ")";
    }
}
