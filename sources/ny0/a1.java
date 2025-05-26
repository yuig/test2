package ny0;

import com.pinterest.api.model.f30;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f92550a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f92551b;

    /* renamed from: c, reason: collision with root package name */
    public final String f92552c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.d f92553d;

    public a1(f30 pin, String useCaseId, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(useCaseId, "useCaseId");
        this.f92550a = pin;
        this.f92551b = z13;
        this.f92552c = useCaseId;
        this.f92553d = bs1.c.p(new Pair("pin_id", pin.getUid()), new Pair("use_case_id", useCaseId));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f92550a, a1Var.f92550a) && this.f92551b == a1Var.f92551b && Intrinsics.d(this.f92552c, a1Var.f92552c);
    }

    public final int hashCode() {
        return this.f92552c.hashCode() + ep.b.e(this.f92551b, this.f92550a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SelectablePin(pin=");
        sb3.append(this.f92550a);
        sb3.append(", isSelected=");
        sb3.append(this.f92551b);
        sb3.append(", useCaseId=");
        return a.a.p(sb3, this.f92552c, ")");
    }
}
