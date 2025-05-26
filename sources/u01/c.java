package u01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119878b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119879c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119880d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(true, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119878b = pin;
        this.f119879c = monolithHeaderConfig;
        this.f119880d = z13;
        this.f119881e = 94;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f119878b, cVar.f119878b) && Intrinsics.d(this.f119879c, cVar.f119879c) && this.f119880d == cVar.f119880d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119881e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119880d) + ((this.f119879c.hashCode() + (this.f119878b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseUpRedesignedCommentsModel(pin=");
        sb3.append(this.f119878b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119879c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119880d, ")");
    }
}
