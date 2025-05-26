package u01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119882b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull f30 pin) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f119882b = pin;
        this.f119883c = 901;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f119882b, ((d) obj).f119882b);
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119883c;
    }

    public final int hashCode() {
        return this.f119882b.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinCloseupAffiliateDisclaimerModel(pin="), this.f119882b, ")");
    }
}
