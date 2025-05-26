package w41;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f128012a;

    /* renamed from: b, reason: collision with root package name */
    public final List f128013b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.i0 f128014c;

    /* renamed from: d, reason: collision with root package name */
    public final String f128015d;

    public h1(f30 pin, List allPins, h32.i0 context, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(allPins, "allPins");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128012a = pin;
        this.f128013b = allPins;
        this.f128014c = context;
        this.f128015d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.f128012a, h1Var.f128012a) && Intrinsics.d(this.f128013b, h1Var.f128013b) && Intrinsics.d(this.f128014c, h1Var.f128014c) && Intrinsics.d(this.f128015d, h1Var.f128015d);
    }

    public final int hashCode() {
        int hashCode = (this.f128014c.hashCode() + ep.b.c(this.f128013b, this.f128012a.hashCode() * 31, 31)) * 31;
        String str = this.f128015d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NavigateToPinEffectRequest(pin=" + this.f128012a + ", allPins=" + this.f128013b + ", context=" + this.f128014c + ", screenKey=" + this.f128015d + ")";
    }
}
