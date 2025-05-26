package u01;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class q extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119930b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119931c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119932d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119930b = pin;
        this.f119931c = monolithHeaderConfig;
        this.f119932d = z13;
        this.f119933e = RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f119930b, qVar.f119930b) && Intrinsics.d(this.f119931c, qVar.f119931c) && this.f119932d == qVar.f119932d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119933e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119932d) + ((this.f119931c.hashCode() + (this.f119930b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupTemplateDetailsModel(pin=");
        sb3.append(this.f119930b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119931c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119932d, ")");
    }
}
