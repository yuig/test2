package u01;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class p extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119926b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119927c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119928d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119926b = pin;
        this.f119927c = monolithHeaderConfig;
        this.f119928d = z13;
        this.f119929e = RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f119926b, pVar.f119926b) && Intrinsics.d(this.f119927c, pVar.f119927c) && this.f119928d == pVar.f119928d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119929e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119928d) + ((this.f119927c.hashCode() + (this.f119926b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupShoppingModuleModel(pin=");
        sb3.append(this.f119926b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119927c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119928d, ")");
    }
}
