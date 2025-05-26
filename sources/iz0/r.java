package iz0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f73931a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f73932b;

    /* renamed from: c, reason: collision with root package name */
    public final wa2.m f73933c;

    public r(int i13, f30 pin) {
        wa2.m pinFeatureConfig = new wa2.m(-8388610, -1, 1023, null, null, null, null, null, null, null, null, null, null, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f73931a = i13;
        this.f73932b = pin;
        this.f73933c = pinFeatureConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f73931a == rVar.f73931a && Intrinsics.d(this.f73932b, rVar.f73932b) && Intrinsics.d(this.f73933c, rVar.f73933c);
    }

    public final int hashCode() {
        return this.f73933c.hashCode() + ((this.f73932b.hashCode() + (Integer.hashCode(this.f73931a) * 31)) * 31);
    }

    public final String toString() {
        return "QuizResultPin(index=" + this.f73931a + ", pin=" + this.f73932b + ", pinFeatureConfig=" + this.f73933c + ")";
    }
}
