package pt;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f101326a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f101327b;

    public a(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f101326a = pin;
        this.f101327b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f101326a, aVar.f101326a) && this.f101327b == aVar.f101327b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101327b) + (this.f101326a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowcasePagePin(pin=" + this.f101326a + ", isSelected=" + this.f101327b + ")";
    }
}
