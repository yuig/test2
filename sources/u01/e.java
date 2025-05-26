package u01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class e extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119884b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119885c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119886d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119887e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119884b = pin;
        this.f119885c = monolithHeaderConfig;
        this.f119886d = z13;
        this.f119887e = 96;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f119884b, eVar.f119884b) && Intrinsics.d(this.f119885c, eVar.f119885c) && this.f119886d == eVar.f119886d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119887e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119886d) + ((this.f119885c.hashCode() + (this.f119884b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupBoardAttributionModel(pin=");
        sb3.append(this.f119884b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119885c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119886d, ")");
    }
}
