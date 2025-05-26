package u01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class o extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119922b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119923c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119924d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119922b = pin;
        this.f119923c = monolithHeaderConfig;
        this.f119924d = z13;
        this.f119925e = 95;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f119922b, oVar.f119922b) && Intrinsics.d(this.f119923c, oVar.f119923c) && this.f119924d == oVar.f119924d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119925e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119924d) + ((this.f119923c.hashCode() + (this.f119922b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupRecipeModel(pin=");
        sb3.append(this.f119922b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119923c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119924d, ")");
    }
}
