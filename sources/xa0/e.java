package xa0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f134399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134400b;

    public e(int i13, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f134399a = pin;
        this.f134400b = i13;
    }

    public final f30 b() {
        return this.f134399a;
    }

    public final int d() {
        return this.f134400b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f134399a, eVar.f134399a) && this.f134400b == eVar.f134400b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f134400b) + (this.f134399a.hashCode() * 31);
    }

    public final String toString() {
        return "PublishedCollage(pin=" + this.f134399a + ", position=" + this.f134400b + ")";
    }
}
