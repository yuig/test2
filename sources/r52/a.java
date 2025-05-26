package r52;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a implements i0, dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f106256a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f106257b;

    public a(@NotNull f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f106256a = pin;
        this.f106257b = z13;
    }

    public static a v(a aVar, boolean z13) {
        f30 pin = aVar.f106256a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        return new a(pin, z13);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        String f39332b = this.f106256a.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
        return f39332b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f106256a, aVar.f106256a) && this.f106257b == aVar.f106257b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106257b) + (this.f106256a.hashCode() * 31);
    }

    public final String toString() {
        return "ItemPin(pin=" + this.f106256a + ", isSelected=" + this.f106257b + ")";
    }
}
