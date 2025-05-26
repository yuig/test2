package om0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f96470a;

    /* renamed from: b, reason: collision with root package name */
    public final int f96471b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96472c;

    /* renamed from: d, reason: collision with root package name */
    public final String f96473d;

    public c0(int i13, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f96470a = pin;
        this.f96471b = i13;
        String id3 = pin.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f96472c = id3;
        String p03 = bs1.c.p0(pin);
        this.f96473d = p03 == null ? "" : p03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f96470a, c0Var.f96470a) && this.f96471b == c0Var.f96471b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96471b) + (this.f96470a.hashCode() * 31);
    }

    public final String toString() {
        return "PinPreviewState(pin=" + this.f96470a + ", position=" + this.f96471b + ")";
    }
}
