package u01;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class i extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119898b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119899c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119900d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f119901e;

    /* renamed from: f, reason: collision with root package name */
    public final int f119902f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13, boolean z14) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119898b = pin;
        this.f119899c = monolithHeaderConfig;
        this.f119900d = z13;
        this.f119901e = z14;
        this.f119902f = z14 ? 97 : RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_NON_CREATOR_ANALYTICS_MODULE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f119898b, iVar.f119898b) && Intrinsics.d(this.f119899c, iVar.f119899c) && this.f119900d == iVar.f119900d && this.f119901e == iVar.f119901e;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119902f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119901e) + ep.b.e(this.f119900d, (this.f119899c.hashCode() + (this.f119898b.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupCreatorAnalyticsModel(pin=");
        sb3.append(this.f119898b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119899c);
        sb3.append(", isFullPin=");
        sb3.append(this.f119900d);
        sb3.append(", isBusinessAccount=");
        return a.a.r(sb3, this.f119901e, ")");
    }
}
