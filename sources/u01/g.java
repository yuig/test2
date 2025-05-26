package u01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class g extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119892b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@NotNull f30 pin) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f119892b = pin;
        this.f119893c = 789;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f119892b, ((g) obj).f119892b);
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119893c;
    }

    public final int hashCode() {
        return this.f119892b.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinCloseupClickthroughActionBarModel(pin="), this.f119892b, ")");
    }
}
