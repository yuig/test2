package u01;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119874b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119875c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119876d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119874b = pin;
        this.f119875c = monolithHeaderConfig;
        this.f119876d = z13;
        this.f119877e = RecyclerViewTypes.VIEW_TYPE_PIN_PDP_MONOLITH_HEADER;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f119874b, bVar.f119874b) && Intrinsics.d(this.f119875c, bVar.f119875c) && this.f119876d == bVar.f119876d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119877e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119876d) + ((this.f119875c.hashCode() + (this.f119874b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PdpCloseupMonolithicHeaderModel(pin=");
        sb3.append(this.f119874b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119875c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119876d, ")");
    }
}
