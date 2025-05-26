package ml0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class t0 implements l82.i0, dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f87503a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87504b;

    public t0(@NotNull f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f87503a = pin;
        this.f87504b = z13;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        String f39332b = this.f87503a.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
        return f39332b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f87503a, t0Var.f87503a) && this.f87504b == t0Var.f87504b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87504b) + (this.f87503a.hashCode() * 31);
    }

    public final String toString() {
        return "ItemPin(pin=" + this.f87503a + ", isSelected=" + this.f87504b + ")";
    }
}
